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
public class networkasst {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void networkasst() {
		tg.openDevice();
				tg.wait(2);
				tg.wait("ele_LocationButton1781773745657", ComparisonType.IS_VISIBLE);
				tg.click("ele_LocationButton1781773745657", 1);
				tg.wait("ele_APIButton1781853971839", ComparisonType.IS_VISIBLE);
				tg.click("ele_APIButton1781853971839", 1);
				tg.wait(5);
				tg.wait("ele_FormTab", ComparisonType.IS_VISIBLE);
				tg.click("ele_FormTab", 1);
		tg.close();
	}
}