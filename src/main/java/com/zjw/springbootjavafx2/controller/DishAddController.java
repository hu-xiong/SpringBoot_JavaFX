package com.zjw.springbootjavafx2.controller;

import com.zjw.springbootjavafx2.Springbootjavafx2Application;
import com.zjw.springbootjavafx2.service.DishService;
import com.zjw.springbootjavafx2.view.MenuView;
import de.felixroske.jfxsupport.FXMLController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import javax.annotation.Resource;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

@FXMLController
public class DishAddController implements Initializable{
    @Resource
    DishService dishService;

    @FXML private TextField name;
    @FXML private TextField type;
    @FXML private TextField difficulty;
    @FXML private TextField cdm;
    @FXML private TextField food1;
    @FXML private TextField food2;
    @FXML private TextField food2Amount;
    @FXML private TextField food1Amount;

    @FXML public void send(){
    }

    @FXML public void back(){
        Springbootjavafx2Application.showView(MenuView.class);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){

    }
}
