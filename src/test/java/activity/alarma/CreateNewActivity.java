package activity.alarma;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

public class CreateNewActivity {
    public Button newAlarmButton;
    public Button exitMainButton;
    public Label resultLabel;

    public CreateNewActivity(){
              //boton central
        //newAlarmButton= new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView"));

        newAlarmButton= new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[2]"));
        exitMainButton= new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView"));
        resultLabel= new Label(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout"));
    }
}
