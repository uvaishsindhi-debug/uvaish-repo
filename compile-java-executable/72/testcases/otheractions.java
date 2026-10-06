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
public class otheractions {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void otheractions() {
		tg.openDevice();
		tg.wait(2);
		tg.wait("ele_FormfullName", ComparisonType.IS_VISIBLE);
		tg.typeEncrypted("ele_Formfieldpassword", "4LlEC0F1NHwTDpLoS++pAA==:MTIzNDU2Nzg5MTAxMTEyMQ==", false);
		tg.wait(1);
		// [DISABLED] tg.click("ele_DoneButton", 1);
		tg.wait("ele_ShowPass", ComparisonType.IS_VISIBLE);
		tg.click("ele_ShowPass", 1);
		tg.wait(5);
		tg.printLogs("RELAUNCH APP ACTION DONE......");
		START_CUSTOM_SCRIPT;
		driver.findElement(By.xpath("//XCUIElementTypeTextField[@name='field.fullName']")).sendKeys("DwayneJohnson");
		END_CUSTOM_SCRIPT;
		tg.wait(1);
		START_CUSTOM_SCRIPT;
		driver.findElement(By.xpath("//XCUIElementTypeTextField[@name='field.firstName']")).sendKeys("Dwayne");
		END_CUSTOM_SCRIPT;
		tg.wait("ele_DoneButton", ComparisonType.IS_VISIBLE);
		tg.click("ele_DoneButton", 1);
		tg.printLogs("CUSTOM SCRIPT ACTION DONE......");
		tg.wait(2);
		tg.declare("ele_declarekey", "(//XCUIElementTypeButton[@name='section.clear'])[1]");
		tg.click("ele_declarekey", 1);
		tg.wait(1);
		tg.printLogs("DECLARE KEY ACTION DONE........");
		tg_int var_NUM = 99999;
		tg.printLogs(var_NUM);
		var_NUM = tg.saveToVariable(77777, var_NUM);
		tg.printLogs(var_NUM);
		tg_String var_Str = "TestingDocumentLog";
		tg.printLogs(var_Str);
		tg_Double var_Dbl = 99.00;
		tg.printLogs(var_Dbl);
		var_Dbl = tg.saveToVariable(999000.9999, var_Dbl);
		tg.printLogs(var_Dbl);
		tg.pullToRefresh("ele_ClearDataButton");
		tg.wait(1);
		tg.printLogs("PULL DOWN TO REFRESH ACTION DONE........");
		tg.close();
	}
}