package com.zjw.springbootjavafx2;

import com.zjw.springbootjavafx2.config.Splash;
import com.zjw.springbootjavafx2.controller.LoginController;
import com.zjw.springbootjavafx2.view.LoginView;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.InputStream;

@SpringBootApplication
public class Springbootjavafx2Application extends AbstractJavaFxApplicationSupport {
	public static void main(String[] args) {
		launch(Springbootjavafx2Application.class,LoginView.class,new Splash(),args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		super.start(stage);
		stage.setTitle("餐馆供应链管理信息系统");
	}

}
