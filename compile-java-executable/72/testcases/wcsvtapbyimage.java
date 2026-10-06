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
		tg.swipe(Direction.DOWN);
		tg.wait("ele_ScreensButton1781785646867", ComparisonType.IS_VISIBLE);
		tg.click("ele_ScreensButton1781785646867", 1);
		tg.wait("ele_OpenScrollScreenStaticText1781785671348", ComparisonType.IS_VISIBLE);
		tg.click("ele_OpenScrollScreenStaticText1781785671348", 1);
		tg.wait(2);
		tg.tapByImage("ele_buttonscrollToBottomElement", 0.5);
		tg.wait(2);
		tg_String var_var1 = "Null";
		tg_int var_var2 = 0;
		tg.writeToCSV("var_var1", var_var1, "");
		tg.writeToCSV("var_var2", var_var2, "");
		var_var1 = tg.saveToVariable("NewValue", var_var1);
		var_var2 = tg.saveToVariable(100, var_var2);
		tg.writeToCSV("var_var1", var_var1, "");
		tg.writeToCSV("var_var2", var_var2, "");
		tg.close();
	}
}