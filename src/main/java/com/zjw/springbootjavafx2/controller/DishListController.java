package com.zjw.springbootjavafx2.controller;

import com.zjw.springbootjavafx2.Springbootjavafx2Application;
import com.zjw.springbootjavafx2.pojo.VO.DishVO;
import com.zjw.springbootjavafx2.pojo.entity.Dish;
import com.zjw.springbootjavafx2.service.DishService;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;

@FXMLController
public class DishListController implements Initializable {

    @Resource
    DishService dishService;

    public ObservableList<DishVO> list = FXCollections.observableArrayList();

    @FXML private TableView DishTable;
    @FXML private TableColumn name;
    @FXML private TableColumn type;
    @FXML private TableColumn difficulty;
    @FXML private TableColumn grade;
    @FXML private TableColumn cdm;
    @FXML private TableColumn food1;
    @FXML private TableColumn amount1;
    @FXML private TableColumn food2;
    @FXML private TableColumn amount2;
    @FXML private TableColumn choice;


    private void config(){
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        type.setCellValueFactory(new PropertyValueFactory<>("type"));
        difficulty.setCellValueFactory(new PropertyValueFactory<>("difficulty"));
        grade.setCellValueFactory(new PropertyValueFactory<>("grade"));
        cdm.setCellValueFactory(new PropertyValueFactory<>("cdmName"));
        food1.setCellValueFactory(new PropertyValueFactory<>("firstFoodName"));
        amount1.setCellValueFactory(new PropertyValueFactory<>("firstFoodAmount"));
        food2.setCellValueFactory(new PropertyValueFactory<>("secondFoodName"));
        amount2.setCellValueFactory(new PropertyValueFactory<>("secondFoodAmount"));
    }


    @FXML private void back(){
        Springbootjavafx2Application.showView(MenuView.class);
    }

    @FXML private void show(){
        DishTable.getItems().clear();
        config();
        list.addAll(generate());
        DishTable.setItems(list);
    }

    @FXML private void delete(){

    }

    private List<DishVO> generate(){
        List<DishVO> list = new ArrayList<DishVO>();
        List<Dish> listPrimary = dishService.showAllDishes();
        Iterator<Dish> i = listPrimary.iterator();

        while (i.hasNext()){
            DishVO igdVO = new DishVO(i.next());
            list.add(igdVO);
        }

        return list;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){

    }
}
