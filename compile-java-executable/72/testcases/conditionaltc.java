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
public class conditionaltc {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void conditionaltc() {
		tg.openDevice();
		tg.wait(2);
		tg.wait("ele_FormfullName", ComparisonType.IS_VISIBLE);
		tg.type("ele_FormfullName", "40", false);
		tg.wait(1);
		tg.type("ele_FormfirstName", "Dwayne", false);
		tg.wait(1);
		tg.click("ele_DoneButton", 1);
		while(tg.verify.isEqualTo("ele_FormfullName", 40)){
		while(tg.verify.isEqualTo("ele_FormfirstName", "Dwayne")){
		while(tg.verify.isGreaterThan("ele_FormfullName", 30)){
		while(tg.verify.contains("ele_FormfirstName", "yne")){
		// [DISABLED] tg.swipe(Direction.DOWN);
		// [DISABLED] tg.swipe(Direction.DOWN);
		tg.wait(2);
		tg.click("ele_ClearDataButton", 1);
		tg.wait("ele_FormfullName", ComparisonType.IS_VISIBLE);
		tg.type("ele_FormfullName", "10", false);
		tg.wait(1);
		// [DISABLED] tg.click("ele_DoneButton", 1);
		tg.wait("ele_FormfirstName", ComparisonType.IS_VISIBLE);
		tg.type("ele_FormfirstName", "Johnson", false);
		tg.wait(1);
		tg.click("ele_DoneButton", 1);
		}
		}
		}
		}
		tg.printLogs("REPEAT IF with ELEMENT DONE..........");
		tg_int var_NUM = 40;
		tg_String var_TEXT = "Dwayne";
		while(tg.verify.isEqualTo(var_NUM, 40)){
		while(tg.verify.isEqualTo(var_TEXT, "Dwayne")){
		while(tg.verify.contains(var_TEXT, "yne")){
		while(tg.verify.isGreaterThanOrEqualTo(var_NUM, 40)){
		while(tg.verify.isGreaterThanOrEqualTo(var_NUM, 30)){
		while(tg.verify.isGreaterThan(var_NUM, 30)){
		var_NUM = tg.saveToVariable(10, var_NUM);
		var_TEXT = tg.saveToVariable("Johnson", var_TEXT);
		}
		}
		}
		}
		}
		}
		tg.printLogs("REPEAT IF VARIABLE ACTION SUCCESSSSS........");
		if(tg.performAssert("ele_FormfullName", ComparisonType.EQUAL_TO, 40)){
		if(tg.performAssert("ele_FormfullName", ComparisonType.NOT_EQUAL_TO, 54)){
		if(tg.performAssert("ele_FormfirstName", ComparisonType.EQUAL_TO, "Johnson")){
		if(tg.performAssert("ele_FormfirstName", ComparisonType.NOT_EQUAL_TO, "5tefdg")){
		if(tg.performAssert("ele_FormfullName", ComparisonType.GREATER_THAN_OR_EQUAL_TO, 40)){
		if(tg.performAssert("ele_FormfullName", ComparisonType.GREATER_THAN_OR_EQUAL_TO, 33)){
		if(tg.performAssert("ele_FormfullName", ComparisonType.LESS_THAN_OR_EQUAL_TO , 40)){
		if(tg.performAssert("ele_FormfullName", ComparisonType.LESS_THAN_OR_EQUAL_TO , 67)){
		if(tg.performAssert("ele_FormfullName", ComparisonType.GREATER_THAN , 15)){
		if(tg.performAssert("ele_FormfullName", ComparisonType.LESS_THAN , 76)){
		if(tg.performAssert("ele_FormfirstName", ComparisonType.CONTAINS , "Kar")){
		if(tg.performAssert("ele_FormfullName", ComparisonType.IS_ENABLE)){
		tg.swipe(Direction.DOWN);
		tg.wait(2);
		}
		}
		}
		}
		}
		}
		}
		}
		}
		}
		}
		}
		tg.printLogs("START IF ACTION SUCCESSSS........");
		if(tg.performAssert(var_NUM, ComparisonType.EQUAL_TO, 11)){
		tg.printLogs("Start IF insideee");
		} else {
		tg.printLogs("START ELSE ACTION DONE........");
		}
		tg.click("ele_ClearDataButton", 1);
		tg.close();
	}
}