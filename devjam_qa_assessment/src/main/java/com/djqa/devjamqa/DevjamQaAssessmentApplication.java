package com.djqa.devjamqa;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

@SpringBootApplication
@EnableJpaRepositories
public class DevjamQaAssessmentApplication extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
	       // getting loader and a pane for the first scene. 
        // loader will then give a possibility to get related controller
        FXMLLoader firstPaneLoader = new FXMLLoader(getClass().getResource("DJLogin.fxml"));
        Parent firstPane = firstPaneLoader.load();
        Scene firstScene = new Scene(firstPane, 600, 575);

        // getting loader and a pane for the second scene
        FXMLLoader secondPageLoader = new FXMLLoader(getClass().getResource("DJSummaryScaled.fxml"));
        Parent secondPane = secondPageLoader.load();
        Scene secondScene = new Scene(secondPane, 600, 575);

        // injecting second scene into the controller of the first scene
        LoginController loginController = (LoginController) firstPaneLoader.getController();
        loginController.setSecondScene(secondScene);
        
        // getting loader and a pane for the second scene
        FXMLLoader itemOnePageLoader = new FXMLLoader(getClass().getResource("DJSummaryScaled.fxml"));
        Parent itemOnePane = itemOnePageLoader.load();
        Scene itemOneScene = new Scene(itemOnePane, 600, 575);
        
        // getting loader and a pane for the second scene
        FXMLLoader itemTwoPageLoader = new FXMLLoader(getClass().getResource("DJSummaryScaled.fxml"));
        Parent itemTwoPane = itemTwoPageLoader.load();
        Scene itemTwoScene = new Scene(itemTwoPane, 600, 575);
        
        // getting loader and a pane for the second scene
        FXMLLoader checkOutPageLoader = new FXMLLoader(getClass().getResource("DJSummaryScaled.fxml"));
        Parent checkOutPane = checkOutPageLoader.load();
        Scene checkOutScene = new Scene(checkOutPane, 600, 575);
        
        SummaryController summaryController = (SummaryController) secondPageLoader.getController();
        summaryController.setItemOneScene(itemOneScene);
        summaryController.setItemTwoScene(itemTwoScene);
        summaryController.setCheckoutScene(checkOutScene);

        // injecting first scene into the controller of the second scene
        //SecondController secondPaneController = (SecondController) secondPageLoader.getController();
        //secondPaneController.setFirstScene(firstScene);

        primaryStage.setTitle("QA Assessment");
        primaryStage.setScene(firstScene);
        primaryStage.show();
	}
}
