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
public class wcsvtapbyimage {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void wcsvtapbyimage() {
		tg.openDevice();
		tg.wait(2);
		tg_String var_name = "alice";
		tg.writeToCSV("var_name", var_name, "");
		tg.writeToCSV("var_gstr", var_gstr, "");
		var_name = tg.saveToVariable(var_gstr, var_name);
		tg.writeToCSV("var_name", var_name, "");
		tg.writeToCSV("text", "text", "text1");
		tg.tapByImage("ele_SignInButton1782900326059", 0.65);
		tg.close();
	}
}