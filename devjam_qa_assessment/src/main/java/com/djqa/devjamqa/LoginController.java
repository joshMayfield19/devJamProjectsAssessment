package com.djqa.devjamqa;

import org.springframework.stereotype.Component;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

@Component
public class LoginController {
	@FXML
    public TextField loginUsername;
 
	@FXML
    public TextField loginPassword;
	
	@FXML
    public Button loginButton;
	
	@FXML
	public Button bugReportLoginButton;
	
	@FXML
	public TextArea bugReportLogin;
	
    private Scene secondScene;
	
    @FXML
    public void initialize() {
        
    }
    
    @FXML
    public void login(ActionEvent actionEvent) {
    	Stage primaryStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        primaryStage.setScene(secondScene);
    }
    
    @FXML
    public void saveBugReportLogin() {
    	
    }
    
    public void setSecondScene(Scene scene) {
        secondScene = scene;
    }

    public void openSecondScene(ActionEvent actionEvent) {
        Stage primaryStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        primaryStage.setScene(secondScene);
    }
}
