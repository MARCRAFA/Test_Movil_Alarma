package activity.alarma;

import appiumControl.Button;
import org.openqa.selenium.By;

public class SetRankActivity{
    public Button oneButton;
    public Button twoButton;
    public Button doubleZeroButton;
    public Button thirtyButton;
    public Button acceptButton;

    public SetRankActivity(){

        oneButton= new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.Button[1]"));
        twoButton= new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.Button[2]"));
        doubleZeroButton= new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[5]/android.widget.Button[1]"));
        thirtyButton= new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[5]/android.widget.Button[3]"));
        acceptButton= new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[2]"));
    }

}
