
package goaltest;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;

public class GoalTest extends Application {
    public static Group root = new Group();
    Goal goal=new Goal(150,150);
    Goal goal1=new Goal(400,400);

    @Override
    public void start(Stage primaryStage) {
        //Instantiate a few Goal objects

        Scene scene = new Scene(root, 600, 500, Color.rgb(123,255,1));

        // Label label_x = new Label("Положение х :");
        // label_x.setTextFill(Color.WHITE);

        // Label label_y = new Label("Положение y :");
        // label_y.setTextFill(Color.WHITE);
        // label_y.setLayoutY(25);

        // root.getChildren().add(label_x);
        // root.getChildren().add(label_y);



        primaryStage.setTitle("GoalTest");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
