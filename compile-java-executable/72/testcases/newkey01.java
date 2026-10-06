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
public class newkey01 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void newkey01() {
		tg.openDevice();
		tg.wait(2);
		tg.printPageSource();
		tg.pageLoadStart("Fullname");
		tg.wait("ele_FormfullName", ComparisonType.IS_VISIBLE);
		tg.type("ele_FormfullName", "FullName", false);
		tg.pageLoadEnd("Fullname");
		tg.pageLoadStart("FirstName");
		tg.wait(1);
		tg.wait("ele_FormfirstName", ComparisonType.IS_VISIBLE);
		tg.type("ele_FormfirstName", "FirstName", false);
		tg.pageLoadEnd("FirstName");
		tg.wait(1);
		tg.pageLoadStart("pageone");
		tg.wait("ele_FormlastName", ComparisonType.IS_VISIBLE);
		tg.type("ele_FormlastName", "LastName", false);
		tg.wait("ele_DoneButton", ComparisonType.IS_VISIBLE);
		tg.click("ele_DoneButton", 1);
		tg.pageLoadEnd("pageone");
		tg.pageLoadStart("ClearTap");
		tg.wait("ele_Submittext", ComparisonType.IS_VISIBLE);
		tg.click("ele_Submittext", 1);
		tg.wait(2);
		tg.alertButton("Cancel");
		tg.wait(1);
		tg.pageLoadEnd("ClearTap");
		tg_String var_settingapp = "com.apple.Preferences";
		tg.pageLoadStart("ActivateApp");
		tg.activateApp(var_settingapp);
		tg.wait(2);
		tg.deactivateApp("com.demo.Demo-iOS");
		tg.wait(2);
		tg.activateApp(var_demoiosapp);
		tg.wait(2);
		tg.pageLoadEnd("ActivateApp");
		tg.setOrientation("LANDSCAPE");
		tg.wait(2);
		tg.setOrientation("PORTRAIT");
		tg.printLogs("SUCESSS");
		tg.close();
	}
}