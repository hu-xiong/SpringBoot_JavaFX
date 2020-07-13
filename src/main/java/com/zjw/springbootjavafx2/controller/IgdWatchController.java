package com.zjw.springbootjavafx2.controller;

import com.mysql.cj.xdevapi.Table;
import com.zjw.springbootjavafx2.Springbootjavafx2Application;
import com.zjw.springbootjavafx2.pojo.VO.IgdVO;
import com.zjw.springbootjavafx2.pojo.entity.Ingredient;
import com.zjw.springbootjavafx2.service.IgdService;
import com.zjw.springbootjavafx2.view.MenuView;
import de.felixroske.jfxsupport.FXMLController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import javax.annotation.Resource;
import java.net.URL;
import java.util.*;

@FXMLController
public class IgdWatchController implements Initializable {

    @Resource
    IgdService igdService;

    @FXML private TableView table1;
    @FXML private TableColumn name;
    @FXML private TableColumn enterTime;
    @FXML private TableColumn maxDuration;
    @FXML private TableColumn duration;
    @FXML private TableColumn grade;
    public ObservableList<IgdVO> list = FXCollections.observableArrayList();

    @FXML public void back(){
        Springbootjavafx2Application.showView(MenuView.class);
    }

    @FXML public void show(){

        name.setCellValueFactory(new PropertyValueFactory<>("igdName"));
        enterTime.setCellValueFactory(new PropertyValueFactory<>("igdEnterHouseTime"));
        maxDuration.setCellValueFactory(new PropertyValueFactory<>("igdMaxduration"));
        duration.setCellValueFactory(new PropertyValueFactory<>("igdDuration"));
        grade.setCellValueFactory(new PropertyValueFactory<>("igdGrade"));

        list.addAll(generateData());
        table1.setItems(list);
    }

    public List<IgdVO> generateData(){
        List<IgdVO> list = new ArrayList<IgdVO>();
        List<Ingredient> listPrimary = igdService.showAll();
        Iterator<Ingredient> i = listPrimary.iterator();

        while (i.hasNext()){
            IgdVO igdVO = new IgdVO();
            igdVO.initIngredient(i.next());
            list.add(igdVO);
        }

        return list;
    }

    public void updateDuration(){
        List<Ingredient> list = igdService.showAll();
        /*Iterator<Ingredient> i = list.iterator();*/
        /*DateFormat tformat = new SimpleDateFormat("yyyy-MM-dd");*/
        Date nowTime = new Date();
        Ingredient ingredient = new Ingredient();

        for(Ingredient i :list){
            Date beforeTime = i.getIgdEnterhousetime();
            int duration = differentDays(beforeTime,nowTime);

            ingredient = i;
            ingredient.setIgdDuration(duration);
            ingredient.setIgdGrade(i.getIgdMaxduration()/duration);

            boolean flag = igdService.updateIngredient(ingredient);
            System.out.println(flag);
        }

        return;
    }

    public static int differentDays(Date date1,Date date2)
    {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);

        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);
        int day1= cal1.get(Calendar.DAY_OF_YEAR);
        int day2 = cal2.get(Calendar.DAY_OF_YEAR);

        int year1 = cal1.get(Calendar.YEAR);
        int year2 = cal2.get(Calendar.YEAR);
        if(year1 != year2)   //不同一年
        {
            int timeDistance = 0 ;
            for(int i = year1 ; i < year2 ; i ++)
            {
                if(i%4==0 && i%100!=0 || i%400==0)    //闰年
                {
                    timeDistance += 366;
                }
                else    //不是闰年
                {
                    timeDistance += 365;
                }
            }

            return timeDistance + (day2-day1) ;
        }
        else    //同一年
        {
            System.out.println("判断day2 减 day1 : " + (day2-day1));
            return day2-day1;
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){

        updateDuration();
    }
}
