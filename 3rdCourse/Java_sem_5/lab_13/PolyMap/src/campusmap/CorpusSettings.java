package campusmap;
import javafx.scene.control.ScrollBar;

public class CorpusSettings {
    private final ScrollBar xscrollBar = new ScrollBar();
    public CorpusSettings(int value) {
        xscrollBar.setMin(50.0D);
        xscrollBar.setMax(600.0D);
        setValue(value);
        xscrollBar.setMinSize(100.0D, 15.0D);
        xscrollBar.setPrefSize(100.0D, 15.0D);
        xscrollBar.setMaxSize(100.0D, 15.0D);
    }
   
    public ScrollBar getScrollBar() {
        return xscrollBar;
    }
    public void setValue(int value) {
        xscrollBar.setValue((double)value);
    }
    
}
