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
public class dateutility {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void dateutility() {
		tg.openDevice();
		tg_String var_ans1 = "Null";
		tg_String var_ans2 = "demotext";
		tg_int var_one = 10;
		tg_int var_two = 10;
		tg_int var_three = 10;
		var_dateutility = tg.dateUtilities("{DATE}");
		tg.printLogs(var_dateutility);
		var_dateutility = tg.dateUtilities("{DATETIME}");
		tg.printLogs(var_dateutility);
		var_dateutility = tg.dateUtilities("{LDATE}");
		tg.printLogs(var_dateutility);
		var_dateutility = tg.dateUtilities("{DATE[ADDDAYS][25.05.2026,14][dd-MM-yyyy]}");
		tg.printLogs(var_dateutility);
		var_ans1 = tg.performCalculations("{MATH["+var_one+" + "+var_two+" * 4]}").toString();
		tg.printLogs(var_ans1);
		var_ans1 = tg.performCalculations("{MATH[("+var_one+" + "+var_two+") * 2]}").toString();
		tg.printLogs(var_ans1);
		var_ans1 = tg.performCalculations("{MATH["+var_one+" / "+var_two+"]}").toString();
		tg.printLogs(var_ans1);
		var_ans1 = tg.performCalculations("{MATH["+var_one+" % "+var_two+"]}").toString();
		tg.printLogs(var_ans1);
		var_ans1 = tg.performCalculations("{MATH["+var_one+" > "+var_two+"]}").toString();
		tg.printLogs(var_ans1);
		var_ans1 = tg.performCalculations("{MATH["+var_one+" == "+var_two+"]}").toString();
		tg.printLogs(var_ans1);
		var_ans1 = tg.performCalculations("{MATH["+var_one+" != "+var_two+"]}").toString();
		tg.printLogs(var_ans1);
		var_ans1 = tg.performCalculations("{MATH[1 && 0]}").toString();
		tg.printLogs(var_ans1);
		var_ans1 = tg.performCalculations("{MATH[1 || 0]}").toString();
		tg.printLogs(var_ans1);
		var_ans1 = tg.performCalculations("{MATH[!"+var_one+"]}").toString();
		tg.printLogs(var_ans1);
		var_ans1 = tg.performCalculations("{MATH["+var_one+" > "+var_two+" && "+var_two+" > "+var_two+"]}").toString();
		tg.printLogs(var_ans1);
		var_ans1 = tg.performCalculations("{MATH["+var_one+" & "+var_two+"]}").toString();
		tg.printLogs(var_ans1);
		var_ans1 = tg.performCalculations("{MATH["+var_one+" | "+var_two+"]}").toString();
		tg.printLogs(var_ans1);
		var_ans1 = tg.performCalculations("{MATH["+var_one+" ^ "+var_two+"]}").toString();
		tg.printLogs(var_ans1);
		var_ans1 = tg.performCalculations("{MATH[~"+var_one+"]}").toString();
		tg.printLogs(var_ans1);
		var_ans1 = tg.performCalculations("{MATH["+var_one+" << "+var_two+"]}").toString();
		tg.printLogs(var_ans1);
		var_ans1 = tg.performCalculations("{MATH["+var_one+" >> "+var_two+"]}").toString();
		tg.printLogs(var_ans1);
		var_dateutility = tg.saveToVariable("Null", var_dateutility);
		tg.close();
	}
}