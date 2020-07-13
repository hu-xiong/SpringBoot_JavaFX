package com.zjw.springbootjavafx2.controller;

import com.zjw.springbootjavafx2.Springbootjavafx2Application;
import com.zjw.springbootjavafx2.service.UserService;
import com.zjw.springbootjavafx2.view.MenuView;
import com.zjw.springbootjavafx2.view.LoginView;
import de.felixroske.jfxsupport.FXMLController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javax.annotation.Resource;
import java.net.URL;
import java.util.ResourceBundle;

@FXMLController
public class LoginController implements Initializable{
    @Resource
    UserService userService;

    @FXML private TextField accountInput;
    @FXML private PasswordField passwordInput;
    private ResourceBundle resourceBundle;

    @FXML public void login(ActionEvent event){
        if(userService.userLoginCheck(accountInput.getText(),passwordInput.getText())){
            System.out.println("欢迎进入菜单！");
            Springbootjavafx2Application.showView(MenuView.class);
        }else {
            System.out.println("密码输入错误！请重新输入！");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.titleProperty().set("信息提示：");
            alert.headerTextProperty().set("密码输入错误！请重新输入！");
            alert.showAndWait();
        }
    }

    @FXML public void manage(){
        Springbootjavafx2Application.showView(MenuView.class);
    }

    @FXML
    public void clearAll(ActionEvent event){
        accountInput.setText(null);
        passwordInput.setText(null);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.resourceBundle = rb;
    }
}
