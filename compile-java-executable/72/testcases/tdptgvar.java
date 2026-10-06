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
public class tdptgvar {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tdptgvar() {
		tg.openDevice();
		tg.wait(2);
		tg.wait("ele_FormfullName", ComparisonType.IS_VISIBLE);
		tg.type("ele_FormfullName", "DemoTest", false);
		tg.wait(2);
		tg.wait("ele_Formfieldemail", ComparisonType.IS_VISIBLE);
		tg.type("ele_Formfieldemail", "EmailTest", false);
		tg.wait(1);
		tg.wait("ele_DoneButton", ComparisonType.IS_VISIBLE);
		tg.click("ele_DoneButton", 1);
		tg.click("ele_ClearDataButton", 1);
		tg.close();
	}
}