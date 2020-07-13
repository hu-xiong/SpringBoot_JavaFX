package com.zjw.springbootjavafx2.controller;

import com.zjw.springbootjavafx2.Springbootjavafx2Application;
import com.zjw.springbootjavafx2.pojo.entity.Ingredient;
import com.zjw.springbootjavafx2.service.IgdService;
import com.zjw.springbootjavafx2.view.*;
import de.felixroske.jfxsupport.FXMLController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javax.annotation.Resource;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@FXMLController
public class MenuController implements Initializable {
    private ResourceBundle resourceBundle;

    /**
     * 食材模块
     */
    @FXML public void igdList(){
        Springbootjavafx2Application.showView(IgdListView.class);
    }
    @FXML public void igdWrite(){
        Springbootjavafx2Application.showView(IgdAddView.class);
    }
    @FXML public void igdQuality(){
        Springbootjavafx2Application.showView(IgdWatchView.class);
    }

    /**
     * 调味品模块
     */
    @FXML public void cdmList(){
        Springbootjavafx2Application.showView(CdmListView.class);
    }
    @FXML public void cdmWrite(){
        Springbootjavafx2Application.showView(CdmAddView.class);
    }

    /***
     * 菜品模块
     */
    @FXML public void dishList(){
        Springbootjavafx2Application.showView(DishListView.class);
    }
    @FXML public void dishNeedIgd(){
        Springbootjavafx2Application.showView(DishAddView.class);
    }

    /**
     * 供应商模块
     */
    @FXML public void supplierList(){
        Springbootjavafx2Application.showView(SupplierListView.class);
    }
    @FXML public void supplierWrite(){
        Springbootjavafx2Application.showView(SupplierAddView.class);
    }

    /**
     * 用户模块
     */
    @FXML public void imageAllOf(){
        Springbootjavafx2Application.showView(ImageAllOfView.class);
    }
    @FXML public void accountDetail(){
        Springbootjavafx2Application.showView(UserDetailView.class);
    }
    @FXML public void exit(){
        Springbootjavafx2Application.showView(LoginView.class);
    }

    /**
     * 帮助模块
     */
    @FXML public void usageMethod(){

    }
    @FXML public void problem(){

    }

    @Override
    public void initialize(URL url, ResourceBundle rb){
        this.resourceBundle = rb;
    }
}
