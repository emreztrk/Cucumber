package StepDefinitions;

import Utilities.ExcelUtility;
import Utilities.GWD;
import Utilities.GWD_old;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @After
    public void after(Scenario senaryo){ // her senaryodan sonra çalışcak bölüm
        System.out.println("Senaryo bitti");

        ExcelUtility.writeExcel("", senaryo, GWD.threadBrowserGet());

        if (senaryo.isFailed()){
            // extent report için çalışsan kısım
            TakesScreenshot ts=(TakesScreenshot) GWD.getDriver();
            final byte[] hafizadakiHali=ts.getScreenshotAs(OutputType.BYTES);
            senaryo.attach(hafizadakiHali, "image/png", "screenshot nane");
        }
        GWD.quitDriver();
    }
}
