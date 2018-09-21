package com.djqa.devjamqa;

import org.springframework.boot.SpringApplication;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class DevjamQaAssessmentApplication extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
	       // getting loader and a pane for the first scene. 
        // loader will then give a possibility to get related controller
        FXMLLoader firstPaneLoader = new FXMLLoader(getClass().getResource("DJLogin.fxml"));
        Parent firstPane = firstPaneLoader.load();
        Scene firstScene = new Scene(firstPane, 300, 275);

        // getting loader and a pane for the second scene
        FXMLLoader secondPageLoader = new FXMLLoader(getClass().getResource("DJSummaryScaled.fxml"));
        Parent secondPane = secondPageLoader.load();
        Scene secondScene = new Scene(secondPane, 300, 275);

        // injecting second scene into the controller of the first scene
        LoginController loginController = (LoginController) firstPaneLoader.getController();
        loginController.setSecondScene(secondScene);

        // injecting first scene into the controller of the second scene
        //SecondController secondPaneController = (SecondController) secondPageLoader.getController();
        //secondPaneController.setFirstScene(firstScene);

  }
}
