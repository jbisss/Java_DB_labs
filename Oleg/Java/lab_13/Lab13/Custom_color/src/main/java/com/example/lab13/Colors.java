package com.example.lab13;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;

import java.io.IOException;
import java.util.ArrayList;

public class Colors extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        Scene scene = new Scene(root,400,400);

        Button btn=new Button("Change to prettier");
        btn.setLayoutX(10);
        btn.setLayoutY(150);

        Rectangle rectangle=new Rectangle();
        rectangle.setWidth(250);
        rectangle.setHeight(100);
        rectangle.setLayoutX(140);
        rectangle.setLayoutY(120);
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.BLACK);
        rectangle.setStrokeWidth(5);

        Polygon polygon= new Polygon(200,350, 30,350, 30,250);
        LinearGradient gradient=new LinearGradient(0,0,1,0,true,
                CycleMethod.NO_CYCLE, new Stop(0,Color.BLACK),
                new Stop(1,Color.BLUE));
        polygon.setFill(gradient);

        root.getChildren().addAll(btn,rectangle,polygon);

        ArrayList<Color> color_list=new ArrayList<>(5);
        color_list.add(Color.rgb(123,231,121));
        color_list.add(Color.rgb(14,15,162));
        color_list.add(Color.rgb(200,25,255));
        color_list.add(Color.rgb(0,128,0));
        color_list.add(Color.rgb(5,92,5));

        EventHandler<ActionEvent> event = new EventHandler<>() {
            public void handle(ActionEvent actionEvent) {
                scene.setFill(color_list.get(color_number));
                rectangle.setFill(color_list.get(color_number==4? 0:color_number+1));
                if(color_number==4){
                    color_number=0;
                }
                else {
                    color_number++;
                }
            }
            int color_number=0;
        };

        btn.setOnAction(event);

        stage.setTitle("Цвета");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}