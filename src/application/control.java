package application;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ResourceBundle;

import javax.print.DocFlavor.URL;

import javafx.scene.Node;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
//import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class control {
    
    @FXML
    private Hyperlink hyperLink;
    @FXML
    private AnchorPane root;

    @FXML
    private Button connectButton;

    @FXML
    private TextField usernameField;
    
    @FXML
    private PasswordField passwordField;
    
    public void initialize(URL location, ResourceBundle resources) {
        usernameField.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!usernameField.getStyle().equals("")) {
                usernameField.setStyle("-fx-border-color: transparent;");
            }
        });

        passwordField.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!passwordField.getStyle().equals("")) {
                passwordField.setStyle("-fx-border-color: transparent;");
            }
        });

        
    }

    @FXML
    private void handleConnectButton(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.equals("ayoub") && password.equals("09937390")) {
            try {
                // Load the new FXML file and create a new scene
                Parent secondPageParent = FXMLLoader.load(getClass().getResource("/application/dashboardLV1.fxml"));
                Scene secondPageScene = new Scene(secondPageParent);

                // Get the current stage and set the new scene
                Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                currentStage.setScene(secondPageScene);
                currentStage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {

            usernameField.setStyle("-fx-border-color: red;");
            passwordField.setStyle("-fx-border-color: red;");
        }
    }


    @FXML
    void handleLinkClicked() throws IOException, URISyntaxException {
    	System.out.print("clicked");
    	String url = hyperLink.getText();


            Desktop.getDesktop().browse(new URI("https://github.com/aljaneayoub/dockerdash/blob/master/README.md"));
       
    }
    
    }


