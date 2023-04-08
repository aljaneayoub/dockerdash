package application;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;

public class control {
    
    @FXML
    private Hyperlink hyperLink;

    @FXML
    void handleLinkClicked(ActionEvent event) throws IOException, URISyntaxException {
    	System.out.print("clicked");
        URI uri = new URI("https://github.com/signup");
        java.awt.Desktop.getDesktop().browse(uri);
    }

}
