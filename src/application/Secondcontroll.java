package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class Secondcontroll {
	@FXML
    private AnchorPane root;
	@FXML
	private Button imageButton1;
	@FXML
	private Button imageButton2;
	@FXML
	private Button imageButton3;
	@FXML
	private Button imageButton4;
    @FXML

	void handleImageButtonAction1(ActionEvent event) {
        System.out.println("Image button 1 clicked!");
	}
    @FXML

void handleImageButtonAction2(ActionEvent event) {
        System.out.println("Image button 2 clicked!");
	}
    @FXML
void handleImageButtonAction3(ActionEvent event) {
        System.out.println("Image button 3 clicked!");
}
    @FXML
void handleImageButtonAction4(ActionEvent event) {
        System.out.println("Image button 4 clicked!");
}
}



