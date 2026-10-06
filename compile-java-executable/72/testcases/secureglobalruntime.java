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
public class secureglobalruntime {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void secureglobalruntime() {
		tg.openDevice();
		tg.wait(2);
		tg.printLogs(var_gstr);
		tg.printLogs(var_ra_rstr);
		tg_String var_local = "Null";
		tg_String var_local2 = "Null";
		var_gstr = tg.saveToVariable(var_local, var_gstr);
		var_ra_rstr = tg.saveToVariable(var_local2, var_ra_rstr);
		tg.printLogs(var_gstr);
		tg.printLogs(var_ra_rstr);
		tg.startSecureBlock();
		tg.wait("ele_FormfullName", ComparisonType.IS_VISIBLE);
		tg.type("ele_FormfullName", "DemoTest", false);
		tg.printLogs(var_gstr);
		tg.endSecureBlock();
		tg.wait(2);
		tg.startSecureBlock();
		tg.wait("ele_FormfirstName", ComparisonType.IS_VISIBLE);
		tg.type("ele_FormfirstName", "FirstName", false);
		tg.printLogs(var_ra_rstr);
		tg.endSecureBlock();
		tg.wait(2);
		tg.click("ele_DoneButton");
		tg.close();
	}
}