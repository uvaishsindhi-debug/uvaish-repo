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
public class tdpjson {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tdpjson() {
		tg.openDevice();
		tg.wait(2);
		JSONObject var_Data = tg.getJsonData("https://poc27.testgrid.io/s/csv-to-json/20260618/IHfGcT.json");
		tg_int var_count = 0;
		tg_String var_fname = "Null";
		tg_String var_email = "Null";
		while(tg.verify.isLessThanOrEqualTo(var_count, 1)){
		var_fname = tg.saveToVariable(var_fname, var_Data, "$.records["+var_count+"].FirstName");
		tg.wait("ele_EnteremailaddressEditText1782830312862", ComparisonType.IS_VISIBLE);
		tg.type("ele_EnteremailaddressEditText1782830312862", var_fname, false);
		tg.wait(2);
		var_email = tg.saveToVariable(var_email, var_Data, "$.records["+var_count+"].LastName");
		tg.wait("ele_EnteremailaddressEditText1782830312862", ComparisonType.IS_VISIBLE);
		tg.type("ele_EnteremailaddressEditText1782830312862", var_email, false);
		tg.wait(1);
		var_count = tg.increments(var_count, 1);
		}
		tg.close();
	}
}