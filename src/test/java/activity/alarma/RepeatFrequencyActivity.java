package activity.alarma;

import appiumControl.Button;
import org.openqa.selenium.By;

public class RepeatFrequencyActivity {

    public Button checkDayButton;
    public Button acceptButton;

    public RepeatFrequencyActivity(){

        checkDayButton= new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[6]"));
        acceptButton= new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]"));
    }
}
