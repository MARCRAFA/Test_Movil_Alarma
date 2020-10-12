package activity.calculator;

import appiumControl.Button;
import org.openqa.selenium.By;

public class MainActivity {

    public Button menuButton;
    public Button nineButton;
    public Button doubleZeroButton;
    public Button divisionButton;
    public Button oneButton;
    public Button ZeroButton;
    public Button equalsButton;

    public MainActivity(){

        menuButton= new Button(By.id("com.tricolorcat.calculator:id/display_sub"));
        nineButton= new Button(By.id("com.tricolorcat.calculator:id/nine"));
        doubleZeroButton= new Button(By.id("com.tricolorcat.calculator:id/doublezero"));
        divisionButton= new Button(By.id("com.tricolorcat.calculator:id/divide"));
        oneButton= new Button(By.id("com.tricolorcat.calculator:id/one"));
        ZeroButton= new Button(By.id("com.tricolorcat.calculator:id/one"));
        equalsButton= new Button(By.id("com.tricolorcat.calculator:id/equal"));

    }
}
