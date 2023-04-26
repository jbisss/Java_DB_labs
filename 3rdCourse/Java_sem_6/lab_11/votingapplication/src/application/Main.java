package votingapplication.src.application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.File;

public class Main extends Application {
    String cat1 = "Java Team";
    String cat2 = "SQL Team";
    private Label score1Lbl, score2Lbl;
    private Button cat1Btn, cat2Btn, showBtn, rstBtn;
    int cat1Score = 0;
    int cat2Score = 0;

    @Override
    public void start(Stage primaryStage) {
        final double BTN_WIDTH = 100;
        Label cat1Lbl = new Label(cat1);
        cat1Lbl.setLayoutX(110);
        cat1Lbl.setLayoutY(10);
        cat1Lbl.setTextFill(Color.RED);

        Label cat2Lbl = new Label(cat2);
        cat2Lbl.setLayoutX(230);
        cat2Lbl.setLayoutY(10);
        cat2Lbl.setTextFill(Color.BLUE);

        //create second label
        score1Lbl = new Label("" + cat1Score);
        score1Lbl.setLayoutX(130);
        score1Lbl.setLayoutY(40);
        score1Lbl.setTextFill(Color.RED);
        score1Lbl.setVisible(false);

        score2Lbl = new Label("" + cat2Score);
        score2Lbl.setLayoutX(250);
        score2Lbl.setLayoutY(40);
        score2Lbl.setTextFill(Color.BLUE);
        score2Lbl.setVisible(false);

        cat1Btn = new Button("Vote " + cat1);
        cat1Btn.setLayoutX(90);
        cat1Btn.setLayoutY(80);
        cat1Btn.setPrefWidth(BTN_WIDTH);

        cat2Btn = new Button("Vote " + cat2);
        cat2Btn.setLayoutX(210);
        cat2Btn.setLayoutY(80);
        cat2Btn.setPrefWidth(BTN_WIDTH);

        cat1Btn.setOnAction((ActionEvent event) -> {
            cat1Score++;
//			score1Lbl.setText(""+cat1Score);
        });

        cat2Btn.setOnAction((ActionEvent event) -> {
            cat2Score++;
//			score2Lbl.setText(""+cat2Score);
        });

        showBtn = new Button("Show Votes");
        showBtn.setLayoutX(90);
        showBtn.setLayoutY(120);
        showBtn.setPrefWidth(BTN_WIDTH);
        showBtn.setOnAction((ActionEvent event) -> {
            showVotes();
            setBtnUse(true, true, true, false);
        });

        rstBtn = new Button("Reset Votes");
        rstBtn.setLayoutX(210);
        rstBtn.setLayoutY(120);
        rstBtn.setPrefWidth(BTN_WIDTH);
        rstBtn.setOnAction((ActionEvent event) -> {
            resetVotes();
            setBtnUse(false, false, false, true);
        });
        rstBtn.setDisable(true);
        //add image
        File file_1 = new File(".\\lab_11\\votingapplication\\src\\application\\Java_Duke.png");
        Image jImage = new Image(file_1.toURI().toString());
        ImageView jImgView = new ImageView(jImage);
        jImgView.setX(10);
        jImgView.setY(30);

        File file_2 = new File(".\\lab_11\\votingapplication\\src\\application\\Datagirl.png");
        Image sqlImage = new Image(file_2.toURI().toString());
        ImageView sqlImgView = new ImageView(sqlImage);
        sqlImgView.setX(320);
        sqlImgView.setY(30);
        try {
            Group root = new Group();
            root.getChildren().add(cat1Lbl);
            root.getChildren().add(score1Lbl);
            root.getChildren().add(cat1Btn);
            root.getChildren().add(cat2Lbl);
            root.getChildren().add(score2Lbl);
            root.getChildren().add(cat2Btn);
            root.getChildren().add(jImgView);
            root.getChildren().add(sqlImgView);
            root.getChildren().add(showBtn);
            root.getChildren().add(rstBtn);
//			
            Scene scene = new Scene(root, 400, 200);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            primaryStage.setTitle("Voting Panel!");
            primaryStage.setMinWidth(scene.getWidth());
            primaryStage.setMinHeight(scene.getHeight());
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showVotes() {
        score1Lbl.setText("" + cat1Score);
        score2Lbl.setText("" + cat2Score);
        score1Lbl.setVisible(true);
        score2Lbl.setVisible(true);
    }

    private void resetVotes() {
        cat1Score = 0;
        cat2Score = 0;
        score1Lbl.setVisible(false);
        score2Lbl.setVisible(false);
    }

    private void setBtnUse(boolean cat1, boolean cat2,
                           boolean show, boolean reset) {
        cat1Btn.setDisable(cat1);
        cat2Btn.setDisable(cat2);
        showBtn.setDisable(show);
        rstBtn.setDisable(reset);
    }

    public static void main(String[] args) {
        launch(args);
    }


}
