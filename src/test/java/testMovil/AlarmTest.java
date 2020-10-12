package testMovil;

import activity.alarma.MainActivity;
import activity.alarma.CreateNewActivity;
import activity.alarma.ParametersActivity;
import activity.alarma.SetRankActivity;
import activity.alarma.RepeatFrequencyActivity;
import activity.alarma.RepeatAlarmActivity;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import sessionManager.Session;

import javax.print.attribute.SetOfIntegerSyntax;
import java.net.MalformedURLException;

public class AlarmTest {

    MainActivity mainActivity = new MainActivity();
    CreateNewActivity createNewActivity = new CreateNewActivity();
    ParametersActivity parametersActivity = new ParametersActivity();
    SetRankActivity setRankActivity = new SetRankActivity();
    RepeatFrequencyActivity repeatFrequencyActivity = new RepeatFrequencyActivity();
    RepeatAlarmActivity repeatAlarmActivity = new RepeatAlarmActivity();

    @Test
    public void verifyAddAlarm() throws MalformedURLException {

        mainActivity.alarmButton.click();
        createNewActivity.newAlarmButton.click();
        parametersActivity.rankSwitchButton.click();
        parametersActivity.fromButton.click();
        setRankActivity.oneButton.click();
        setRankActivity.twoButton.click();
        setRankActivity.doubleZeroButton.click();
        setRankActivity.acceptButton.click();
        parametersActivity.toButton.click();
        setRankActivity.oneButton.click();
        setRankActivity.twoButton.click();
        setRankActivity.thirtyButton.click();
        setRankActivity.acceptButton.click();
        parametersActivity.titleTextBox.type("Reunion de negocios");
        parametersActivity.frequencyButton.click();
        repeatFrequencyActivity.checkDayButton.click();
        repeatFrequencyActivity.acceptButton.click();
        parametersActivity.repeatButton.click();
        //repeatAlarmActivity.minuteButton.click();
        repeatAlarmActivity.acceptButton.click();
        parametersActivity.vibrateButton.click();
        parametersActivity.doneButton.click();

        // Verificacion
        String actualResult= "";
        String expectedResult= createNewActivity.resultLabel.getText();
        Assert.assertEquals("ERROR ! No se creó ninguna alarma",expectedResult,actualResult);
        createNewActivity.exitMainButton.click();


    }

    @After
    public void after() throws MalformedURLException {
        Session.getInstance().closeSession();
    }

}