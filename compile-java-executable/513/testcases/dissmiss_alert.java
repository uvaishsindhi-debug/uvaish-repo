import io.testgrid.listeners.TestListener;
import io.testgrid.listeners.RetryFailedTestCases;
import io.testgrid.tg;
import org.testng.annotations.*;
import app.getxray.xray.testng.annotations.XrayTest;
import io.testgrid.enums.ComparisonType;
import org.json.JSONObject;
import io.testgrid.enums.Direction;
import io.testgrid.enums.Size;
import io.testgrid.enums.Buttons;
import static io.testgrid.baseClass.driver;
import org.openqa.selenium.*;
import io.testgrid.enums.Alert;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.testng.annotations.Test;

@Listeners(TestListener.class);
public class dissmiss_alert {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void dissmiss_alert() {
		tg.openDevice();
		tg.wait(5);
		tg.tapByImage("ele_mainmenudetectlocationTextView1776866351598", 0.65);
		tg.wait(5);
		tg.alertButton("Don't Allow");
		tg.wait(10);
		tg.deactivateApp("org.asdtm.goodweather");
		tg.wait(5);
		tg.activateApp("org.asdtm.goodweather");
		tg.wait(10);
		// [DISABLED] tg.clearAppData("org.asdtm.goodweather");
		tg.wait(5);
		tg.activateApp("com.android.chrome");
		tg.wait(2);
		tg.setOrientation("LANDSCAPE");
		tg.wait(2);
		tg.clearAppData("com.android.chrome");
		tg.wait(5);
		tg.close();
	}
}