package activity.alarma;

import appiumControl.Button;
import org.openqa.selenium.By;

public class RepeatAlarmActivity {

    public Button minuteButton;
    public Button acceptButton;

    public RepeatAlarmActivity(){

        //minuteButton= new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout"));
        acceptButton= new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]"));
    }
}
