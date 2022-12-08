package goaltest;

import javafx.scene.image.Image;
import  javafx.scene.image.ImageView;
import javafx.scene.media.AudioClip;

import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class Goal {
    private Image dukeImage;
    private ImageView dukeImageView;

    private Image gloveImage;
    private ImageView gloveImageView;

    private AudioClip tone;

    public Goal(double x ,double y){
        dukeImage = new Image(getClass().getResource("Images/Duke.png").toString());
        gloveImage=new Image(getClass().getResource("Images/Glove.png").toString());
        tone = new AudioClip(getClass().getResource("Audio/Note5.wav").toString());

        dukeImageView =new ImageView(dukeImage);
        gloveImageView = new ImageView(gloveImage);
        dukeImageView.setLayoutX(x);
        dukeImageView.setLayoutY(y);
        gloveImageView.setLayoutX(x+15);
        gloveImageView.setLayoutY(y-15);
        GoalTest.root.getChildren().add(dukeImageView);
        GoalTest.root.getChildren().add(gloveImageView);


        interactions();
    }

    private void interactions(){

        dukeImageView.setOnMouseDragged((MouseEvent me)->{
            dukeImageView.setLayoutX(me.getSceneX());
            dukeImageView.setLayoutY(me.getSceneY());
            gloveImageView.setLayoutX(me.getSceneX()+15);
            gloveImageView.setLayoutY(me.getSceneY()-15);
        });
        dukeImageView.setOnMousePressed((MouseEvent me)->{

            tone.play();
        });
    }
}
