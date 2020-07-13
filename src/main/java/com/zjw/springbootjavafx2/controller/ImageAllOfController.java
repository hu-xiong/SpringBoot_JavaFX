package com.zjw.springbootjavafx2.controller;

import com.zjw.springbootjavafx2.Springbootjavafx2Application;
import com.zjw.springbootjavafx2.view.MenuView;
import de.felixroske.jfxsupport.FXMLController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

@FXMLController
public class ImageAllOfController implements Initializable {

    @FXML private void back(){
        Springbootjavafx2Application.showView(MenuView.class);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){

    }
}
