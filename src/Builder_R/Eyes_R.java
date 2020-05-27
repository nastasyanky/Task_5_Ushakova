package Builder_R;

import Figures_R.Event_R;
import javafx.scene.paint.Color;

public class Eyes_R extends Event_R {
    public Eyes_R(Color color, double length, double width) {
        super(color, length, width);
    }
    public Eyes_R(){
        super(Color.BLUE, 100,100);

    }
}
