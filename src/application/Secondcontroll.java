/*package application;


import java.awt.event.ActionEvent;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;

public class Secondcontroll {
	@FXML
	private BorderPane bp;
	
	 @FXML
	    private AnchorPane pane1;
	    @FXML
	    private AnchorPane pane2;
	    @FXML
	    private AnchorPane pane3;
    @FXML

	void acceuilpressed(MouseEvent event) {
        System.out.println("acceuil");
        pane1.setVisible(true);
        pane2.setVisible(false);
        pane3.setVisible(false);	}
    @FXML

    void layerspressed(MouseEvent event) {
        System.out.println("registry layers");
        pane1.setVisible(false);
        pane2.setVisible(true);
        pane3.setVisible(false);	}
    @FXML
    void historypressed(MouseEvent event) {
        System.out.println("history");
        pane1.setVisible(false);
        pane2.setVisible(false);
        pane3.setVisible(true);

}
    public void initialize() {
        // Set the initial scene (pane)
        pane1.setVisible(true);
        pane2.setVisible(false);
        pane3.setVisible(false);
    }
    @FXML
    void logoutpressed() {
        System.out.println("log out");
}
}
*/
package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Secondcontroll {
    @FXML
    private StackPane contentarea;
    @FXML

    public void initialize() throws IOException{

            Parent fxml = FXMLLoader.load(getClass().getResource("acceuil.fxml"));
            contentarea.getChildren().removeAll();
            contentarea.getChildren().setAll(fxml);

    }
    public void acceuil(javafx.event.ActionEvent actionEvent) throws IOException{
    Parent fxml = FXMLLoader.load(getClass().getResource("acceuil.fxml"));	
    contentarea.getChildren().removeAll();
    contentarea.getChildren().setAll(fxml);
    }
    public void layers(javafx.event.ActionEvent actionEvent) throws IOException{
    Parent fxml = FXMLLoader.load(getClass().getResource("layers.fxml"));	
    contentarea.getChildren().removeAll();
    contentarea.getChildren().setAll(fxml);
    }
    public void history(javafx.event.ActionEvent actionEvent) throws IOException{
    Parent fxml = FXMLLoader.load(getClass().getResource("history.fxml"));	
    contentarea.getChildren().removeAll();
    contentarea.getChildren().setAll(fxml);
    }
    @FXML
    void logout(ActionEvent event) throws IOException{
        
            Parent firstPage_parent = FXMLLoader.load(getClass().getResource("/application/login.fxml"));
            Scene firstPage_scene = new  Scene(firstPage_parent);
            Stage app_stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
            app_stage.setScene(firstPage_scene);
            app_stage.show();
            
        
    }
}


