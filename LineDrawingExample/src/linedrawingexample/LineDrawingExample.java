/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linedrawingexample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class LineDrawingExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            // Create a Line object
            Line line = new Line();
            line.setStartX(0);
            line.setStartY(0);
            line.setEndX(100);
            line.setEndY(200);

            // Create a Group to hold the line
            Group root = new Group();
            root.getChildren().add(line);

            // Create the scene and set it on the stage
            Scene scene = new Scene(root, 300, 300);
            primaryStage.setTitle("Line Drawing Example");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

