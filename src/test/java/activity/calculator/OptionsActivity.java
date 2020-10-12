package activity.calculator;

import appiumControl.Button;
import org.openqa.selenium.By;

public class OptionsActivity {

    public Button themeButton;

    public OptionsActivity(){

        themeButton= new Button(By.id("com.tricolorcat.calculator:id/seven"));

    }
}
