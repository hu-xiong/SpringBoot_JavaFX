package com.zjw.springbootjavafx2.controller;

import com.zjw.springbootjavafx2.Springbootjavafx2Application;
import com.zjw.springbootjavafx2.pojo.entity.Condiment;
import com.zjw.springbootjavafx2.service.CdmService;
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
public class CdmAddController implements Initializable {
    @Resource
    CdmService cdmService;

    @FXML private TextField name;
    @FXML private TextField supplier;
    @FXML private TextField MaxDuration;

    @FXML public void back(){
        Springbootjavafx2Application.showView(MenuView.class);
    }

    @FXML public void send(){
        int i = Integer.parseInt(MaxDuration.getText());
        Date nowtime = new Date();

        Condiment condiment = new Condiment(name.getText(),i,supplier.getText(),i);
        condiment.setCdmEnterhousetime(nowtime);
        condiment.setCdmDuration(1);

        if(cdmService.addCdm(condiment)){
            System.out.println("Ok");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.titleProperty().set("信息提示：");
            alert.headerTextProperty().set("添加调味品成功!");
            alert.showAndWait();
        }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.titleProperty().set("信息提示：");
            alert.headerTextProperty().set("添加食材失败!");
            alert.showAndWait();
        }
    }

    @Override
    public void initialize(URL ur, ResourceBundle resourceBundle){

    }
}
