package com.zjw.springbootjavafx2.controller;

import com.zjw.springbootjavafx2.Springbootjavafx2Application;
import com.zjw.springbootjavafx2.pojo.entity.Ingredient;
import com.zjw.springbootjavafx2.service.IgdService;
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
public class IgdAddController implements Initializable {

    @Resource
    IgdService igdService;
    @FXML private TextField name;
    @FXML private TextField type;
    @FXML private TextField saveMethod;
    @FXML private TextField maxDuration;
    @FXML private TextField supplier;
    @FXML private TextField num;

    @FXML public void submit(){
        Ingredient ingredient = new Ingredient(name.getText(),type.getText(),num.getText(),
                supplier.getText(),Integer.parseInt(maxDuration.getText()),saveMethod.getText());
        Date date = new Date();
        ingredient.setIgdEnterhousetime(date);
        ingredient.setIgdDuration(1);
        ingredient.setIgdGrade(ingredient.getIgdMaxduration());

        if(igdService.saveIngredient(ingredient)){
            System.out.println("插入数据 成功");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.titleProperty().set("信息提示：");
            alert.headerTextProperty().set("添加食材成功!");
            alert.showAndWait();
        }
    }

    @FXML public void back(){
        Springbootjavafx2Application.showView(MenuView.class);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){

    }
}
