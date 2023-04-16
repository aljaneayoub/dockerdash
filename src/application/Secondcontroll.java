package application;

import java.io.IOException;
import java.util.EventObject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

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

	void mousepressed1() {
        System.out.println("acceuil");
	}
    @FXML

void mousepressed2() {
        System.out.println("registry layers");
	}
    @FXML
void mousepressed3() {
        System.out.println("history");
}
    @FXML
void mousepressedlogout() {
        System.out.println("log out");



}

}

