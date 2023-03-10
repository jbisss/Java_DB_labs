package campusmap;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Objects;

public class CampusMap extends Application {
   public static Group root = new Group();
@Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(root, 900, 600, Color.WHITE);
        primaryStage.setTitle("Политех");
        primaryStage.setScene(scene);
        primaryStage.show();

        Image background = new Image(Objects.requireNonNull(this.getClass().getResourceAsStream("maps/campus_map_2.jpg")));
        ImageView backgroundView = new ImageView(background);
        backgroundView.setPreserveRatio(true);
        backgroundView.setFitWidth(1024);

        root.getChildren().add(backgroundView);
        backgroundView.toBack();

        Corpus centr_prof = new Corpus(350, 130, 300, "Цент проф.", Color.rgb(123, 123, 123, 0.7D));
        Corpus Corpus1 = new Corpus(725, 425, 150, "Первый корпус", Color.rgb(1, 231, 231, 0.7D));
        Corpus Corpus2 = new Corpus(100, 320, 50, "Метро", Color.rgb(100, 20, 212, 0.7D));
        Corpus tram = new Corpus(14, 420, 50, "55 трамвай", Color.rgb(255, 25, 2, 0.7D));
        Corpus stadium = new Corpus(350, 450,420, "Храм", Color.rgb(10, 200, 50, 0.7D));

        Center centerPoint = new Center("Центр", centr_prof, Corpus1, Corpus2,tram, stadium);
        Center centerPoint1 = new Center("Студенты", tram, stadium, centr_prof);
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
