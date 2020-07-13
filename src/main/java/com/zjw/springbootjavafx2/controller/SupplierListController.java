package com.zjw.springbootjavafx2.controller;


import com.zjw.springbootjavafx2.Springbootjavafx2Application;
import com.zjw.springbootjavafx2.pojo.VO.SupplierVO;
import com.zjw.springbootjavafx2.pojo.entity.Supplier;
import com.zjw.springbootjavafx2.service.SupplierService;
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
public class SupplierListController implements Initializable{

    @Resource
    SupplierService supplierService;

    private ObservableList<SupplierVO> list = FXCollections.observableArrayList();

    @FXML private TableView SupplierTable;
    @FXML private TableColumn name;
    @FXML private TableColumn number;
    @FXML private TableColumn address;
    @FXML private TableColumn plantSize;
    @FXML private TableColumn firstGrade;


    private void config(){
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        number.setCellValueFactory(new PropertyValueFactory<>("number"));
        address.setCellValueFactory(new PropertyValueFactory<>("address"));
        plantSize.setCellValueFactory(new PropertyValueFactory<>("plantSize"));
        firstGrade.setCellValueFactory(new PropertyValueFactory<>("firstGrade"));
    }

    @FXML private void back(){
        Springbootjavafx2Application.showView(MenuView.class);
    }

    @FXML private void show(){
        SupplierTable.getItems().clear();
        config();
        list.addAll(generate());
        SupplierTable.setItems(list);

    }


    private List<SupplierVO> generate(){
        List<SupplierVO> list = new ArrayList<SupplierVO>();
        List<Supplier> listPrimary = supplierService.showAll();

        for (Supplier i :listPrimary){
            SupplierVO supplierVO = new SupplierVO(i);
            list.add(supplierVO);
        }

        return list;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){

    }
}
