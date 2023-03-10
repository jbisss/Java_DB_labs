package campusmap;

import java.util.ArrayList;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class Center {
    private static final ArrayList<Center> allPoints = new ArrayList<>();
    Corpus[] corps;
    public int xLocation;
    public int yLocation;
    public String text;
    private int distance;
    public Circle point = new Circle();
    public Color fillColor;
    public Color outlineColor;
    public Text display;

    //конструктор
    public Center(String s, Corpus... corpuses) {
        fillColor = Color.BLACK;
        outlineColor = Color.GRAY;
        display = new Text();
        text = s + "\nDistance: ";

        corps = corpuses;
        display.setFill(Color.BLACK);
        display.setFont(Font.font("Default", FontWeight.BOLD, 16.0D));
        CampusMap.root.getChildren().addAll(point, display);
        allPoints.add(this);
        calculateCenter();
        updateDrawing();
    }

    public void updateDrawing() {
        point.setCenterX( xLocation);
        point.setCenterY( yLocation);
        point.setRadius(10.0D);
        point.setFill(fillColor);
        point.setStroke(outlineColor);
        display.setText(text + distance);
        display.setX( (xLocation - 20));
        display.setY( yLocation + point.getRadius() + 15.0D);
    }
    public void calculateCenter() {
        int stud = 0;
        int xWeight = 0;
        int yWeight = 0;
        Corpus[] corp = corps;

        for (Corpus build_ : corp) {
            xWeight += build_.xLocation * build_.students;
            yWeight += build_.yLocation * build_.students;
            stud += build_.students;
        }
        xLocation = xWeight / stud;
        yLocation = yWeight / stud;
        distance = calculateDistance(corps[0]);
    }

    private int calculateDistance(Corpus build) {
        return (int) Math.sqrt(Math.pow((double) (build.xLocation - xLocation), 2.0D) + Math.pow((double) (build.yLocation - yLocation), 2.0D));
    }

    public static void updateAllPoint() {
        for(Center point:allPoints) {
            point.calculateCenter();
            point.updateDrawing();
            point.point.toFront();
            point.display.toFront();
        }
    }
}
