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
public class savetovariableactions {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void savetovariableactions() {
		tg.openDevice();
		tg.wait(2);
		tg.swipe(Direction.DOWN);
		tg_String var_elementdetails = "Null";
		var_elementdetails = tg.getElementAttribute("ele_FormfirstName", "name", var_elementdetails);
		tg.printLogs(var_elementdetails);
		var_elementdetails = tg.getElementAttribute("ele_FormfullName", "type", var_elementdetails);
		tg.printLogs(var_elementdetails);
		tg_String var_v1 = "";
		var_v1 = tg.saveToVariable(var_v1, "capability", "platformName");
		tg_String var_v2 = "";
		var_v2 = tg.saveToVariable(var_v2, "capability", "newCommandTimeout");
		tg_String var_v3 = "";
		var_v3 = tg.saveToVariable(var_v3, "capability", "udid");
		tg_String var_v4 = "";
		var_v4 = tg.saveToVariable(var_v4, "capability", "platformVersion");
		tg_String var_v5 = "";
		var_v5 = tg.saveToVariable(var_v5, "capability", "automationName");
		tg_String var_v6 = "";
		var_v6 = tg.saveToVariable(var_v6, "deviceinfo", "model");
		tg_String var_v7 = "";
		var_v7 = tg.saveToVariable(var_v7, "deviceinfo", "manufacturer");
		tg_String var_v8 = "";
		var_v8 = tg.saveToVariable(var_v8, "deviceinfo", "ios version");
		tg_String var_v9 = "";
		var_v9 = tg.saveToVariable(var_v9, "deviceinfo", "udid");
		tg_String var_v10 = "";
		var_v10 = tg.saveToVariable(var_v10, "deviceinfo", "devicetime");
		tg_String var_v11 = "";
		var_v11 = tg.saveToVariable(var_v11, "regex", "[A-Za-z]{5,10}");
		tg.wait(1);
		START_CUSTOM_SCRIPT;
		System.out.println("platForm : "+var_v1);
		System.out.println("newCommandTimout : "+var_v2);
		System.out.println("uDID : "+var_v3);
		System.out.println("platFormVer : "+var_v4);
		System.out.println("automationName : "+var_v5);
		System.out.println("Model : "+var_v6);
		System.out.println("Manufacture : "+var_v7);
		System.out.println("iOSVersion : "+var_v8);
		System.out.println("uDID : "+var_v9);
		System.out.println("DeviceTime : "+var_v10);
		System.out.println("Regex : "+var_v11);
		END_CUSTOM_SCRIPT;
		tg.close();
	}
}