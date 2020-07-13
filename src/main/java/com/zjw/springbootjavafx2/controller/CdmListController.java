package com.zjw.springbootjavafx2.controller;

import com.zjw.springbootjavafx2.Springbootjavafx2Application;
import com.zjw.springbootjavafx2.pojo.VO.CdmVO;
import com.zjw.springbootjavafx2.pojo.VO.IgdVO;
import com.zjw.springbootjavafx2.pojo.entity.Condiment;
import com.zjw.springbootjavafx2.service.CdmService;
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
public class CdmListController implements Initializable {

    @Resource
    CdmService cdmService;

    private ObservableList<CdmVO> list = FXCollections.observableArrayList();

    @FXML private TableView cdmTable;
    @FXML private TableColumn name;
    @FXML private TableColumn supplier;
    @FXML private TableColumn enterTime;
    @FXML private TableColumn grade;
    @FXML private TableColumn duration;
    @FXML private TableColumn maxDuration;


    private void config(){
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        supplier.setCellValueFactory(new PropertyValueFactory<>("supplier"));
        enterTime.setCellValueFactory(new PropertyValueFactory<>("enterTime"));
        grade.setCellValueFactory(new PropertyValueFactory<>("grade"));
        maxDuration.setCellValueFactory(new PropertyValueFactory<>("maxDuration"));
        duration.setCellValueFactory(new PropertyValueFactory<>("duration"));
    }

    @FXML public void back(){
        Springbootjavafx2Application.showView(MenuView.class);
    }

    @FXML public void show(){
        cdmTable.getItems().clear();
        config();
        list.addAll(generate());
        cdmTable.setItems(list);
    }

    private List<CdmVO> generate(){
        List<CdmVO> list = new ArrayList<CdmVO>();
        List<Condiment> listPrimary = cdmService.selectAllCdm();
        Iterator<Condiment> i = listPrimary.iterator();

        while (i.hasNext()){
            CdmVO igdVO = new CdmVO(i.next());
            list.add(igdVO);
        }

        return list;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){

    }
}
