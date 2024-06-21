/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose: Below code set's the action and message for the button's.
 *   Project:  RadioButton 
 *   Platform: JavaSE-22.0.1
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	 Version: 2024-03 (4.31.0)
 *   Build id: 20240307-1437 
 *********************************************************************************************/



package application;

import javafx.event.ActionEvent; 
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class MainController {
	@FXML
	private RadioButton rb1;
	@FXML
	private RadioButton rb2;
	@FXML
	private Label lbl;
	
	public void radioSelect(ActionEvent event) {
		String message=" ";
		if(rb1.isSelected()) {
			message=rb1.getText()+ "\n";
		}
		
		if(rb2.isSelected()) {
			message=rb2.getText()+ "\n";
		}
		lbl.setText(message);
	}
	
	

}
