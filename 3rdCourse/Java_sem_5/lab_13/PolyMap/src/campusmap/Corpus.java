package campusmap;

import java.awt.geom.Point2D.Double;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class Corpus {
    public int xLocation;
    public int yLocation;
    public int students;
    public String text;
    private final Double iconGrabPosition = new Double(0.0D, 0.0D);
    private final Double mouseGrabPosition = new Double(0.0D, 0.0D);
    private final Double mouseReleasePosition = new Double(0.0D, 0.0D);
   CorpusSettings studChanger;
    public Rectangle buildingRectangle = new Rectangle();
    public Color fillColor;
    public Color outlineColor;
    public Text display;
    
    //конструктор класса
    public Corpus(int width, int height, int students_quantity, String name, Color color) {
        xLocation = width;
        yLocation = height;
        students = students_quantity;
        text = name;
        fillColor = color;

        display = new Text();
        display.setFill(Color.BLACK);
        display.setFont(Font.font("Default", FontWeight.BOLD, 16.0D));

        CampusMap.root.getChildren().addAll(buildingRectangle, display);
        interactions();
        UpdateMap();
    }
    //добавление и расстановка 
    public void UpdateMap() {
        buildingRectangle.setWidth(150.0D * ((double) students / 500.0D));
        buildingRectangle.setHeight(150.0D * ((double) students / 500.0D));
        buildingRectangle.setLayoutX((double)xLocation - buildingRectangle.getWidth() / 2.0D);
        buildingRectangle.setLayoutY((double)yLocation - buildingRectangle.getHeight() / 2.0D);
        buildingRectangle.setFill(fillColor);
        buildingRectangle.setStroke(outlineColor);

        display.setText(text + ":\n" + students);

        display.setLayoutX(buildingRectangle.getLayoutX() - 40.0D);
        display.setLayoutY(buildingRectangle.getLayoutY() + buildingRectangle.getHeight() + 15.0D);
        display.setTextAlignment(TextAlignment.CENTER);
        display.setWrappingWidth(buildingRectangle.getWidth() + 80.0D);
    }
    private void interactions() {
        buildingRectangle.setOnMousePressed((me) -> {
            mouseGrabPosition.x = me.getSceneX();
            mouseGrabPosition.y = me.getSceneY();
            iconGrabPosition.x = xLocation;
            iconGrabPosition.y = yLocation;
            buildingRectangle.toFront();
        });
        buildingRectangle.setOnMouseDragged((me) -> {
            mouseReleasePosition.x = me.getSceneX();
            mouseReleasePosition.y = me.getSceneY();
            xLocation = (int)(me.getSceneX() - mouseGrabPosition.x + iconGrabPosition.x);
            yLocation = (int)(me.getSceneY() - mouseGrabPosition.y + iconGrabPosition.y);
            UpdateMap();
            Center.updateAllPoint();
        });

        display.setOnMousePressed((me) -> {
            if (studChanger == null) {
                mouseGrabPosition.x = me.getSceneX();
                iconGrabPosition.x = (double)students;
                studChanger = new CorpusSettings(students);
                studChanger.getScrollBar().setLayoutX(buildingRectangle.getLayoutX());
                studChanger.getScrollBar().setLayoutY(buildingRectangle.getLayoutY() + buildingRectangle.getHeight() + 40.0D);
                CampusMap.root.getChildren().add(studChanger.getScrollBar());
            }

        });

        display.setOnMouseDragged((me) -> {
            mouseReleasePosition.x = me.getSceneX();
            int newValue = (int)(2.0D * me.getSceneX() - 2.0D * mouseGrabPosition.x + iconGrabPosition.x);
            if (newValue < 50) {
                newValue = 50;
            } else if (newValue > 600) {
                newValue = 600;
            }

            studChanger.setValue(newValue);
            students = newValue;
            UpdateMap();
            Center.updateAllPoint();
            studChanger.getScrollBar().setLayoutY(buildingRectangle.getLayoutY() + buildingRectangle.getHeight() + 40.0D);
        });

        display.setOnMouseReleased((me) -> {
            studChanger.getScrollBar().toBack();
            if (studChanger != null) {
                CampusMap.root.getChildren().remove(studChanger.getScrollBar());
                studChanger = null;
            }

        });
    }
    
}
