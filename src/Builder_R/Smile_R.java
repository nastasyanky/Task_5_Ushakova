package Builder_R;

import javafx.fxml.FXML;
import javafx.scene.Group;

public class Smile_R extends Group {
    public Smile_R(){
    }

    public void setHead_R(Head_R m){
        getChildren().add(m);
    }
    public void setMouth_R(Mouth_R m)   {
        getChildren().add(m);
    }
    public void setEyes_R(Eyes_R m)    {
        getChildren().add(m);
    }
    public String toString()
    {
        return new String ("Смайлик");
    }
}
