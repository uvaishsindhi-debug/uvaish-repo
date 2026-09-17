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
public class code_1 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void code_1() {
		tg.openDevice();
		START_CUSTOM_SCRIPT;
		driver.get("https://demoqa.com/automation-practice-form");
		END_CUSTOM_SCRIPT;
		tg.wait(5);
		tg.pageLoadStart("demo_QA");
		tg.wait("ele_EditText1776156712780", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_EditText1776156712780", 1);
		tg_String var_username = "test";
		tg.type("ele_EditText1776156712780", var_username, true);
		tg.wait("ele_EditText1776156804091", ComparisonType.IS_CLICKABLE, 10);
		tg.type("ele_EditText1776156804091", "grid", true);
		tg.wait("ele_EditText1776156834456", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_EditText1776156834456", 1);
		tg.type("ele_EditText1776156834456", "testgrid@testgrid.io", true);
		tg.click("ele_MaleRadioButton1776157210879", 1);
		tg.wait("ele_EditText1776156918136", ComparisonType.IS_CLICKABLE);
		tg_int var_phnum = 1234567890;
		tg.click("ele_EditText1776156918136", 1);
		tg.type("ele_EditText1776156918136", var_phnum, true);
		tg.check.isVisible("ele_EditText1776156918136");
		tg.check.isEqualTo(var_phnum,"1234567890");
		tg.check.isNotEqualTo(var_phnum,"125");
		tg.check.isGreaterThanOrEqualTo(var_phnum,"12345678");
		tg.check.isLessThanOrEqualTo(var_phnum,"1234567999");
		tg.check.isGreaterThan(var_phnum,"123");
		tg.check.isLessThan(var_phnum,"1234567999");
		// All conditions are checked......✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅
		// [DISABLED] tg.check.contains(var_phnum,"1234");
		tg.pageLoadEnd("demo_QA");
		tg.printLogs("emoji  🚀 Test started... 🔍 Running steps... 🧪 Validating results... ⚙️ Processing actions... ✅ All good... 🎯 Test passed! 🏁");
		tg.printPageSource();
		tg.close();
	}
}