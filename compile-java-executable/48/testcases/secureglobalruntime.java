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
		tg.printLogs(var_gstr);
		tg_String var_local1 = "null";
		tg_String var_local2 = "null";
		var_gstr = tg.saveToVariable(var_local1, var_gstr);
		var_ra_ra_str = tg.saveToVariable(var_local2, var_ra_ra_str);
		tg.printLogs(var_gstr);
		tg.printLogs(var_ra_ra_str);
		tg.startSecureBlock();
		tg.wait("ele_EnteremailaddressEditText1782830312862", ComparisonType.IS_VISIBLE);
		tg.type("ele_EnteremailaddressEditText1782830312862", "DemoTest", false);
		tg.printLogs(var_gstr);
		tg.endSecureBlock();
		tg.wait(2);
		tg.startSecureBlock();
		tg.wait("ele_EnterpasswordEditText1782830323675", ComparisonType.IS_VISIBLE);
		tg.type("ele_EnterpasswordEditText1782830323675", "FirstName", false);
		tg.printLogs(var_ra_ra_str);
		tg.endSecureBlock();
		tg.wait(2);
		tg.close();
	}
}