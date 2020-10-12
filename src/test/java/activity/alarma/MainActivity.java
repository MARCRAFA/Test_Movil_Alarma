package activity.alarma;

import appiumControl.Button;
import org.openqa.selenium.By;

public class MainActivity {
    public Button alarmButton;

    public MainActivity(){

        alarmButton= new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView[2]"));
    }
}