package com.djqa.devjamqa;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class SummaryController {
	@FXML
    public ImageView itemOnePic;
 
	@FXML
    public ImageView itemTwoPic;
	
	@FXML
	public Button addItemOneButton;
	
	@FXML
	public Button addItemTwoButton;
	
	@FXML
	public Hyperlink itemOneLink;
	
	@FXML
	public Hyperlink itemTwoLink;
	
	@FXML
	public Button checkOutButton;
	
	@FXML
	public TextArea runningCart;
	
    private Scene itemOneScene;
    private Scene itemTwoScene;
    private Scene checkOutScene;
	
	@FXML
	protected void initialize() {
		itemOneLink.setText("RSI T-Shirt");
		itemTwoLink.setText("RSI Coffee Cup");
	}
	
	@FXML
	public void addItemOne() {
		String currentCart = runningCart.getText();
        runningCart.setText(currentCart + "\nRSI T-Shirt");	    	
	}
	
	@FXML
	public void addItemTwo() {
		String currentCart = runningCart.getText();
        runningCart.setText(currentCart + "\nRSI Coffee Cup");	
	}
	
	@FXML
	public void itemOneLink(ActionEvent actionEvent) {
		Stage primaryStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        primaryStage.setScene(itemOneScene);
	}
	
	@FXML
	public void itemTwoLink(ActionEvent actionEvent) {
		Stage primaryStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        primaryStage.setScene(itemTwoScene);
	}
	
	@FXML
	public void checkout(ActionEvent actionEvent) {
		Stage primaryStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        primaryStage.setScene(checkOutScene);
	}
	

    public void setItemOneScene(Scene scene) {
        itemOneScene = scene;
    }
    

    public void setItemTwoScene(Scene scene) {
        itemTwoScene = scene;
    }
    

    public void setCheckoutScene(Scene scene) {
        checkOutScene = scene;
    }
}
