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
public class tctct {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tctct() {
		tg.openDevice();
		// [DISABLED] 		tg.wait(2);
		// [DISABLED] 		tg.printLogs(var_gstr);
		// [DISABLED] 		tg.printLogs(var_gstr);
		// [DISABLED] 		tg_String var_local1 = "null";
		// [DISABLED] 		tg_String var_local2 = "null";
		// [DISABLED] 		var_gstr = tg.saveToVariable(var_local1, var_gstr);
		// [DISABLED] 		var_ra_ra_str = tg.saveToVariable(var_local2, var_ra_ra_str);
		// [DISABLED] 		tg.printLogs(var_gstr);
		// [DISABLED] 		tg.printLogs(var_ra_ra_str);
		// [DISABLED] 		tg.startSecureBlock();
				tg.wait(1);
				tg.typeEncrypted("ele_EnteremailaddressEditText1782900372245", "fffff", false);
				tg.type("ele_EnteremailaddressEditText1782830312862", "DemoTest", false);
		// [DISABLED] 		tg.printLogs(var_gstr);
		// [DISABLED] 		tg.endSecureBlock();
		// [DISABLED] 		tg.wait(2);
		// [DISABLED] 		tg.startSecureBlock();
		// [DISABLED] 		tg.wait("ele_EnterpasswordEditText1782830323675", ComparisonType.IS_VISIBLE);
		// [DISABLED] 		tg.type("ele_EnterpasswordEditText1782830323675", "FirstName", false);
		// [DISABLED] 		tg.printLogs(var_ra_ra_str);
		// [DISABLED] 		tg.endSecureBlock();
		tg.close();
	}
}