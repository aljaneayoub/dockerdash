package application;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javafx.scene.Node;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class control {
    
    @FXML
    private Hyperlink hyperLink;
    @FXML
    private AnchorPane root;

    @FXML
    private Button connectButton;



    @FXML
    void handleConnectButton(ActionEvent event) {
        try {
            Parent secondPage_parent = FXMLLoader.load(getClass().getResource("/application/dashboardLV1.fxml"));
            Scene secondPage_scene = new  Scene(secondPage_parent);
            Stage app_stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
            app_stage.setScene(secondPage_scene);
            app_stage.show();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleLinkClicked(ActionEvent event) throws IOException, URISyntaxException {
    	System.out.print("clicked");
        URI uri = new URI("https://github.com/aljaneayoub/dockerdash/blob/master/README.md");
        java.awt.Desktop.getDesktop().browse(uri);
    }

}
