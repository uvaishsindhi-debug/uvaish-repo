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
public class checkaction {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void checkaction() {
		tg.openDevice();
		tg.type("ele_EnteremailaddressEditText1782830312862", "40", false);
		tg.wait(1);
		tg.click("ele_EnteremailaddressEditText1782830312862", 1);
		tg.wait(2);
		tg.check.isEqualTo("ele_EnteremailaddressEditText1782830312862","40");
		tg.check.isNotEqualTo("ele_EnteremailaddressEditText1782830312862","41");
		tg.check.isGreaterThanOrEqualTo("ele_EnteremailaddressEditText1782830312862","40");
		tg.check.isGreaterThan("ele_EnteremailaddressEditText1782830312862","39");
		tg.check.isLessThan("ele_EnteremailaddressEditText1782830312862","55");
		tg.check.isEnabled("ele_EnteremailaddressEditText1782830312862");
		tg.wait(3);
		tg.type("ele_EnteremailaddressEditText1782830312862", "Kartik", false);
		tg.wait(1);
		tg.click("ele_EnteremailaddressEditText1782830312862", 1);
		tg.check.contains("ele_EnteremailaddressEditText1782830312862","Kar");
		tg.printLogs("DONE");
		tg.printLogs("ELEMENT CHECK ACTION SUCCESSSSS.......");
		tg_int var_NUM = 40;
		tg_String var_TEXT = "Kartik";
		tg.check.isEqualTo(var_NUM,"40");
		tg.check.isEqualTo(var_TEXT,"Kartik");
		tg.check.isNotEqualTo(var_NUM,"41");
		tg.check.isNotEqualTo(var_TEXT,var_NUM);
		tg.check.isGreaterThanOrEqualTo(var_NUM,"40");
		tg.check.isNotEqualTo(var_TEXT,"KartikM");
		tg.check.isGreaterThan(var_NUM,"39");
		tg.check.isLessThan(var_NUM,"55");
		tg.check.contains(var_TEXT,"Kar");
		tg.check.isEnabled("ele_EnteremailaddressEditText1782830312862");
		tg.printLogs(var_NUM);
		tg.printLogs(var_TEXT);
		tg.printLogs("VARIABLE CHECK ACTION SUCCESSSSS.....");
		tg.close();
	}
}