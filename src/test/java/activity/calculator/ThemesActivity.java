package activity.calculator;

import appiumControl.Button;
import org.openqa.selenium.By;

public class ThemesActivity {

    public Button colorButton;

    public ThemesActivity(){

        colorButton= new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.CheckedTextView[7]"));

    }
}
