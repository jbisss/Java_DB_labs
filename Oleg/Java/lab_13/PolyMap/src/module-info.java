module PolyMap {
    exports campusmap;

    requires javafx.media;
    requires javafx.controls;
    requires javafx.graphics;
    requires java.desktop;
    requires javafx.swt;

    opens campusmap.maps;
}