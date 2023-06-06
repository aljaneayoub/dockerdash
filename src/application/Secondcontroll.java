package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import java.awt.Label;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;




public class Secondcontroll {
    @FXML
    private StackPane contentarea;
    @FXML
    private FlowPane cardContainer;
   /* 
    private Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:/home/ayoub/Bureau/database/dockerdash.db";
        return DriverManager.getConnection(url);
    }*/

    public void initialize() throws JSONException  {
    	try {
            Pane pane = new Pane(); // Create a new Pane
            pane.setPrefSize(838, 60); // Set the preferred size of the pane
            pane.setStyle("-fx-background-color: #FFFFFF;"); // Set the background color of the pane (white)

            Pane textPane = new Pane(); // Create a new Pane for the text background
            textPane.setPrefSize(838, 60); // Set the preferred size of the text pane
            textPane.setStyle("-fx-background-color: #a6a6a6;"); // Set the background color of the text pane

            Text text = new Text("Desk");
            text.setLayoutX(32);
            text.setLayoutY(39);
            text.setFill(Color.WHITE);
            text.setFont(Font.font("Comic Sans MS", 27));
            int place=32;
            int repeat=displayShellCommandOutput();
            for (int i=0;i<repeat;i++) {
            Rectangle card = new Rectangle(180, 230); // Create a rectangle as the card
            card.setFill(Color.WHITE); // Set the fill color of the card to white
            card.setStroke(Color.rgb(166, 166, 166)); // Set the border color of the card to grey
            card.setStrokeWidth(1); // Set the border width of the card
            card.setLayoutX(place);
            place+=200;
            card.setLayoutY(85);
            
            card.setOnMouseEntered(e -> card.setStroke(Color.GREY));
            card.setOnMouseExited(e -> card.setStroke(Color.rgb(166, 166, 166)));
            
            card.setOnMouseClicked(e -> {
                try {
                    // Load the new FXML file
                    Parent fxml = FXMLLoader.load(getClass().getResource("layers.fxml"));
                    // Set the new content of the container
                    contentarea.getChildren().clear();
                    contentarea.getChildren().add(fxml);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            });

            pane.getChildren().add(card); // Add the card to the pane

            }
            textPane.getChildren().add(text); // Add the text to the text pane
            pane.getChildren().add(textPane); // Add the text pane to the main pane

            contentarea.getChildren().clear(); // Clear the existing content
            contentarea.getChildren().add(pane); // Set the pane as the new content

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void acceuil(ActionEvent actionEvent) throws JSONException {
    	try {
            Pane pane = new Pane(); // Create a new Pane
            pane.setPrefSize(838, 60); // Set the preferred size of the pane
            pane.setStyle("-fx-background-color: #FFFFFF;"); // Set the background color of the pane (white)

            Pane textPane = new Pane(); // Create a new Pane for the text background
            textPane.setPrefSize(838, 60); // Set the preferred size of the text pane
            textPane.setStyle("-fx-background-color: #a6a6a6;"); // Set the background color of the text pane

            Text text = new Text("Desk");
            text.setLayoutX(32);
            text.setLayoutY(39);
            text.setFill(Color.WHITE);
            text.setFont(Font.font("Comic Sans MS", 27));

            int place=32;
            int repeat=displayShellCommandOutput();
            for (int i=0;i<repeat;i++) {
            Rectangle card = new Rectangle(180, 230); // Create a rectangle as the card
            card.setFill(Color.WHITE); // Set the fill color of the card to white
            card.setStroke(Color.rgb(166, 166, 166)); // Set the border color of the card to grey
            card.setStrokeWidth(1); // Set the border width of the card
            card.setLayoutX(place);
            place+=200;
            card.setLayoutY(85);
            
            card.setOnMouseEntered(e -> card.setStroke(Color.GREY));
            card.setOnMouseExited(e -> card.setStroke(Color.rgb(166, 166, 166)));
            
            card.setOnMouseClicked(e -> {
                try {
                    // Load the new FXML file
                    Parent fxml = FXMLLoader.load(getClass().getResource("layers.fxml"));
                    // Set the new content of the container
                    contentarea.getChildren().clear();
                    contentarea.getChildren().add(fxml);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            });

            pane.getChildren().add(card); // Add the card to the pane

            }
            
            textPane.getChildren().add(text); // Add the text to the text pane
            pane.getChildren().add(textPane); // Add the text pane to the main pane

            contentarea.getChildren().clear(); // Clear the existing content
            contentarea.getChildren().add(pane); // Set the pane as the new content

            displayShellCommandOutput();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void layers(ActionEvent actionEvent) {
        try {
            Parent fxml = FXMLLoader.load(getClass().getResource("layers.fxml"));
            contentarea.getChildren().removeAll();
            contentarea.getChildren().setAll(fxml);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void history(ActionEvent actionEvent) {
        try {
            Parent fxml = FXMLLoader.load(getClass().getResource("build.fxml"));
            contentarea.getChildren().removeAll();
            contentarea.getChildren().setAll(fxml);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    

    public void logout(ActionEvent event) {
        try {
            Parent firstPage_parent = FXMLLoader.load(getClass().getResource("/application/login.fxml"));
            Scene firstPage_scene = new Scene(firstPage_parent);
            Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            app_stage.setScene(firstPage_scene);
            app_stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public int displayShellCommandOutput() throws JSONException {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder("curl", "-X", "GET", "http://localhost:5000/v2/_catalog");
            Process process = processBuilder.start();

            InputStream inputStream = process.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            StringBuilder output = new StringBuilder(); // Store the output in a StringBuilder

            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line); // Append each line to the StringBuilder
            }

            process.waitFor();

            // Parse the JSON response
            JSONObject json = new JSONObject(output.toString());
            JSONArray repositories = json.getJSONArray("repositories");
            int i;
            for (i = 0; i < repositories.length(); i++) {
                String repository = repositories.getString(i);
                System.out.println(repository);

                String imageName = repository;
                String command = "curl -X GET http://localhost:5000/v2/" + imageName + "/tags/list";

                ProcessBuilder processBuilder2 = new ProcessBuilder("bash", "-c", command);
                Process process2 = processBuilder2.start();

                InputStream inputStream2 = process2.getInputStream();
                BufferedReader reader2 = new BufferedReader(new InputStreamReader(inputStream2));

                StringBuilder tagsOutput = new StringBuilder();

                String line2;
                while ((line2 = reader2.readLine()) != null) {
                    tagsOutput.append(line2).append(System.lineSeparator());
                }

                process2.waitFor();

                JSONObject json2 = new JSONObject(tagsOutput.toString());
                JSONArray tags = json2.getJSONArray("tags");

                for (int j = 0; j < tags.length(); j++) {
                    String tag = tags.getString(j);
                    System.out.println(" - " + tag);
                }
            }
            return i;

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
		return 0;
    }


      
    }


