package application;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.*;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class acceuil {
    public void start(Stage primaryStage) {
        Pane card = new Pane(); // Create a Pane for the card
        card.setPrefSize(60, 80); // Set the preferred size of the card
        card.setStyle("-fx-background-color: #ECECEC;"); // Set the background color of the card

        Scene scene = new Scene(card);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Card Example");
        primaryStage.show();
    }

}
