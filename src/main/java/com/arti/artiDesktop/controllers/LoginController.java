package com.arti.artiDesktop.controllers;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.stereotype.Controller;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

@Controller
@FxmlView("Login.fxml")
public class LoginController implements Initializable {


	@FXML
    private Button btn_eye;

    @FXML
    private Button btn_eye_slash;

    @FXML
    private Button btn_login;

    @FXML
    private ComboBox<String> combobox_lodin;

    @FXML
    private TextField password_afficher;

    @FXML
    private PasswordField password_field;

    @FXML
    private TextField username_field;


    public void afichermodpass(){
    	btn_eye_slash.setVisible(true);
    	btn_eye.setVisible(false);
    	password_afficher.setText(password_field.getText().trim());
    	password_field.setVisible(false);
    	password_afficher.setVisible(true);

    }
    public void masquermodpass(){
    	btn_eye_slash.setVisible(false);
    	btn_eye.setVisible(true);
    	password_field.setText(password_afficher.getText().trim());
    	password_afficher.setVisible(false);
    	password_field.setVisible(true);
    }

public void login() throws SQLException, IOException {
//    	if(combobox_lodin.getValue()=="Admin") {
//    	String user=username_field.getText().trim();
//    	String pass="";
//    	if(password_field.isVisible()) {
//    		pass=password_field.getText().trim();
//    	}
//    	if(password_afficher.isVisible()) {
//    		pass=password_afficher.getText().trim();
//    	}
//    	Alert alert;
//
//    	int x =BD_Centre_Analyse.verifier_login_admin(user, pass);
//
//        if(user.isEmpty() || pass.isEmpty()){
//
//            alert = new Alert(AlertType.ERROR);
//            alert.setTitle("Admin Message");
//            alert.setHeaderText(null);
//            alert.setContentText("Please fill all blank fields.");
//            alert.showAndWait();
//        }else if(x==1){
//        	Centre_data_window.username=user;
//        	Centre_data_window.password=pass;
//			Parent root = FXMLLoader.load(getClass().getResource("Admin_space.fxml"));
//			Scene scene = new Scene(root);
//			Centre_data_window.stage.setScene(scene);
//			Centre_data_window.stage.centerOnScreen();
//			Centre_data_window.stage.show();
//        }else {
//            alert = new Alert(AlertType.ERROR);
//            alert.setTitle("Admin Message");
//            alert.setHeaderText(null);
//            alert.setContentText("wrong username or password.");
//            alert.showAndWait();
//        }}
//
//    	if(combobox_lodin.getValue()=="Agent") {
//    		String user=username_field.getText().trim();
//        	String pass="";
//        	if(password_field.isVisible()) {
//        		pass=password_field.getText().trim();
//        	}
//        	if(password_afficher.isVisible()) {
//        		pass=password_afficher.getText().trim();
//        	}
//        	Alert alert;
//
//        	int x = BD_Centre_Analyse.verifier_login_agent(user, pass);
//
//            if(user.isEmpty() || pass.isEmpty()){
//
//                alert = new Alert(AlertType.ERROR);
//                alert.setTitle("Admin Message");
//                alert.setHeaderText(null);
//                alert.setContentText("Please fill all blank fields.");
//                alert.showAndWait();
//            }else if(x==1){
//            	Centre_data_window.username=user;
//            	Centre_data_window.password=pass;
//            	Centre_data_window.id_agent=BD_Centre_Analyse.retourner_id_agent(user, pass);
//    			Parent root = FXMLLoader.load(getClass().getResource("Agent_space.fxml"));
//    			Scene scene = new Scene(root);
//    			Centre_data_window.stage.setScene(scene);
//    			Centre_data_window.stage.centerOnScreen();
//    			Centre_data_window.stage.show();
//
//
//            }else {
//                alert = new Alert(AlertType.ERROR);
//                alert.setTitle("Admin Message");
//                alert.setHeaderText(null);
//                alert.setContentText("wrong username or password.");
//                alert.showAndWait();
//            }
//    	}


    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		combobox_lodin.setItems(FXCollections.observableArrayList("Admin", "Agent"));
		combobox_lodin.getSelectionModel().selectFirst();
	}


}
