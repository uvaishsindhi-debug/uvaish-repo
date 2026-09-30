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

@Listeners(TestListener.class)
public class suite5 {

    public static int var_gint = 2000;

    public static String var_dateutility = "dateutility";

    public static String var_ra_ra_str = "EFGH";

    public static String var_gstr = "ABCD";

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void call_function__copy() {
        tg.openDevice();
        tg.testFunction("check_func__copy");
        tg.customScriptStart();
        WebElement email = driver.findElement(By.xpath("(//android.widget.EditText[@resource-id='com.app.urunner:id/et_email'])[1]"));
        email.sendKeys("Demo_Email" + "\n");
        tg.customScriptEnd();
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void checkaction_copy() {
        tg.openDevice();
        tg.type("ele_EnteremailaddressEditText1782830312862", "40", false);
        tg.wait(1);
        tg.click("ele_EnteremailaddressEditText1782830312862", 1);
        tg.wait(2);
        tg.check.isEqualTo("ele_EnteremailaddressEditText1782830312862", "40");
        tg.check.isNotEqualTo("ele_EnteremailaddressEditText1782830312862", "41");
        tg.check.isGreaterThanOrEqualTo("ele_EnteremailaddressEditText1782830312862", "40");
        tg.check.isGreaterThan("ele_EnteremailaddressEditText1782830312862", "39");
        tg.check.isLessThan("ele_EnteremailaddressEditText1782830312862", "55");
        tg.check.isEnabled("ele_EnteremailaddressEditText1782830312862");
        tg.wait(3);
        tg.type("ele_EnteremailaddressEditText1782830312862", "Kartik", false);
        tg.wait(1);
        tg.click("ele_EnteremailaddressEditText1782830312862", 1);
        tg.check.contains("ele_EnteremailaddressEditText1782830312862", "Kar");
        tg.printLogs("DONE");
        tg.printLogs("ELEMENT CHECK ACTION SUCCESSSSS.......");
        int var_NUM = 40;
        String var_TEXT = "Kartik";
        tg.check.isEqualTo(var_NUM, "40");
        tg.check.isEqualTo(var_TEXT, "Kartik");
        tg.check.isNotEqualTo(var_NUM, "41");
        tg.check.isNotEqualTo(var_TEXT, var_NUM);
        tg.check.isGreaterThanOrEqualTo(var_NUM, "40");
        tg.check.isNotEqualTo(var_TEXT, "KartikM");
        tg.check.isGreaterThan(var_NUM, "39");
        tg.check.isLessThan(var_NUM, "55");
        tg.check.contains(var_TEXT, "Kar");
        tg.check.isEnabled("ele_EnteremailaddressEditText1782830312862");
        tg.printLogs(var_NUM);
        tg.printLogs(var_TEXT);
        tg.printLogs("VARIABLE CHECK ACTION SUCCESSSSS.....");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void dateutility_copy() {
        tg.openDevice();
        String var_ans1 = "Null";
        String var_ans2 = "demotext";
        int var_one = 10;
        int var_two = 10;
        int var_three = 10;
        var_dateutility = tg.dateUtilities("{DATE}");
        tg.printLogs(var_dateutility);
        var_dateutility = tg.dateUtilities("{DATETIME}");
        tg.printLogs(var_dateutility);
        var_dateutility = tg.dateUtilities("{LDATE}");
        tg.printLogs(var_dateutility);
        var_dateutility = tg.dateUtilities("{DATE[ADDDAYS][25.05.2026,14][dd-MM-yyyy]}");
        tg.printLogs(var_dateutility);
        var_ans1 = tg.performCalculations("{MATH[" + var_one + " + " + var_two + " * 4]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[(" + var_one + " + " + var_two + ") * 2]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_one + " / " + var_two + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_one + " % " + var_two + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_one + " > " + var_two + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_one + " == " + var_two + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_one + " != " + var_two + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[1 && 0]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[1 || 0]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[!" + var_one + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_one + " > " + var_two + " && " + var_two + " > " + var_two + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_one + " & " + var_two + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_one + " | " + var_two + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_one + " ^ " + var_two + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[~" + var_one + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_one + " << " + var_two + "]}").toString();
        tg.printLogs(var_ans1);
        var_ans1 = tg.performCalculations("{MATH[" + var_one + " >> " + var_two + "]}").toString();
        tg.printLogs(var_ans1);
        var_dateutility = tg.saveToVariable("Null", var_dateutility);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void stringutility_copy() {
        tg.openDevice();
        tg.wait(2);
        String var_dt = "Null";
        String var_strone = "Dwayne";
        String var_strtwo = "Joh-n-s-o-n";
        String var_strthree = "Null";
        int var_one = 10;
        int var_two = 10;
        int var_three = 10;
        var_dt = tg.dateUtilities("{DATE[ADDDAYS][25.05.2026,14][dd-MM-yyyy]}");
        tg.printLogs(var_dt);
        var_strthree = tg.stringUtilities("{STRING[TOUPPER][" + var_strone + "][" + var_strtwo + "]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[TOLOWER][" + var_strone + "][" + var_strtwo + "]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[TRIM][" + var_strone + "][]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[LENGTH][" + var_strone + "][]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[CHARAT][" + var_strone + "][2]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[SUBSTRING][" + var_strone + "][2,3]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[INDEXOF][" + var_strone + "][yne]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[STARTSWITH][" + var_strone + "][F]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[ENDSWITH][" + var_strone + "][e]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[REPLACE][" + var_strone + "][Dwayne,Hiii]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[SPLIT][" + var_strtwo + "][-]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[CONCAT][" + var_strtwo + "]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[COMPARE][" + var_strone + ",dwayne][]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[COMPAREIGNORECASE][" + var_strone + "][dwayne]}");
        tg.printLogs(var_strthree);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void code_1_copy() {
        tg.openDevice();
        tg.customScriptStart();
        driver.get("https://demoqa.com/automation-practice-form");
        tg.customScriptEnd();
        tg.wait(5);
        tg.pageLoadStart("demo_QA");
        tg.wait("ele_EditText1776156712780", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_EditText1776156712780", 1);
        String var_username = "test";
        tg.type("ele_EditText1776156712780", var_username, true);
        tg.wait("ele_EditText1776156804091", ComparisonType.IS_CLICKABLE, 10);
        tg.type("ele_EditText1776156804091", "grid", true);
        tg.wait("ele_EditText1776156834456", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_EditText1776156834456", 1);
        tg.type("ele_EditText1776156834456", "testgrid@testgrid.io", true);
        tg.click("ele_MaleRadioButton1776157210879", 1);
        tg.wait("ele_EditText1776156918136", ComparisonType.IS_CLICKABLE, 123);
        int var_phnum = 1234567890;
        tg.click("ele_EditText1776156918136", 1);
        tg.type("ele_EditText1776156918136", var_phnum, true);
        tg.check.isVisible("ele_EditText1776156918136");
        tg.check.isEqualTo(var_phnum, "1234567890");
        tg.check.isNotEqualTo(var_phnum, "125");
        tg.check.isGreaterThanOrEqualTo(var_phnum, "12345678");
        tg.check.isLessThanOrEqualTo(var_phnum, "1234567999");
        tg.check.isGreaterThan(var_phnum, "123");
        tg.check.isLessThan(var_phnum, "1234567999");
        // All conditions are checked......✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅
        // [DISABLED] tg.check.contains(var_phnum,"1234");
        tg.pageLoadEnd("demo_QA");
        tg.printLogs("emoji  🚀 Test started... 🔍 Running steps... 🧪 Validating results... ⚙️ Processing actions... ✅ All good... 🎯 Test passed! 🏁");
        tg.printPageSource();
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void code_2_copy() {
        tg.openDevice();
        tg.testFunction("launchdemoqa_copy");
        tg.wait("ele_EditText1776846706815", ComparisonType.IS_VISIBLE, 5);
        tg.click("ele_EditText1776846706815", 1);
        tg.typeEncrypted("ele_EditText1776846706815", "YQ8MK8lRZeDKYbe5X1ViYw==:MTIzNDU2Nzg5MTAxMTEyMQ==", true);
        tg.wait("ele_EditText1776861767562", ComparisonType.IS_CLICKABLE, 5);
        String var_lname = "";
        var_lname = tg.saveToVariable("#TGITVAR.name", var_lname);
        tg.click("ele_EditText1776156804091", 1);
        tg.type("ele_EditText1776156804091", var_lname, true);
        tg.declare("ele_email", "//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText");
        tg.type("ele_email", "test@gmail.com", true);
        tg.wait(2);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void condition_copy() {
        tg.openDevice();
        // [DISABLED] tg.click("ele_demoqacomautomationpracticeformEditText1776270170096", 1);
        // [DISABLED] tg.wait(2);
        // [DISABLED] tg.wait("ele_httpswwwrapidtablescomtoolsclickcounterhtmlc10TextView1776331733948", ComparisonType.IS_VISIBLE, 5);
        // [DISABLED] tg.click("ele_demoqacomautomationpracticeformEditText1776270756719", 1);
        // [DISABLED] tg.wait("ele_demoqacomautomationpracticeformEditText1776270756719", ComparisonType.IS_VISIBLE, 5);
        // [DISABLED] tg.click("ele_demoqacomautomationpracticeformEditText1776270756719", 1);
        // [DISABLED] tg.wait("ele_demoqacomautomationpracticeformEditText1776270756719", ComparisonType.IS_VISIBLE, 5);
        // [DISABLED] tg.type("ele_demoqacomautomationpracticeformEditText1776270756719", "https://www.rapidtables.com/tools/click-counter.html?c1=0", true);
        // [DISABLED] tg.wait("ele_WebViewFrameLayout1776270792707", ComparisonType.IS_VISIBLE, 10);
        // [DISABLED] tg.click("ele_httpswwwrapidtablescomtoolsclickcounterhtmlc10TextView1776331733948", 1);
        tg.customScriptStart();
        driver.get("https://www.rapidtables.com/tools/click-counter.html?c1=0");
        tg.customScriptEnd();
        tg.wait("ele_Button1776270824252", ComparisonType.IS_VISIBLE, 10);
        if (tg.performAssert("ele_EditText1776270813212", ComparisonType.EQUAL_TO, 0)) {
            tg.click("ele_Button1776270824252", 1);
            if (tg.performAssert("ele_EditText1776270813212", ComparisonType.EQUAL_TO, 0)) {
                tg.click("ele_Button1776270824252", 1);
            }
        } else {
            tg.click("ele_Button1776270824252", 1);
        }
        while (tg.verify.isEqualTo("ele_Button1776270824252", 2)) {
            tg.click("ele_Button1776270824252", 1);
        }
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void conditionaltc_copy() {
        tg.openDevice();
        tg.wait(2);
        tg.click("ele_SignUpTextView1782900340341");
        tg.wait(2);
        tg.wait("ele_EnterfirstnameEditText1782900364278", ComparisonType.IS_VISIBLE, 123);
        tg.type("ele_EnterfirstnameEditText1782900364278", "40", false);
        tg.wait(1);
        tg.type("ele_EnteremailaddressEditText1782830312862", "Dwayne", false);
        tg.wait(1);
        while (tg.verify.isEqualTo("ele_EnterfirstnameEditText1782900364278", 40)) {
            while (tg.verify.isEqualTo("ele_EnteremailaddressEditText1782830312862", "Dwayne")) {
                while (tg.verify.isGreaterThan("ele_EnterfirstnameEditText1782900364278", 30)) {
                    while (tg.verify.contains("ele_EnteremailaddressEditText1782830312862", "yne")) {
                        // [DISABLED] tg.swipe(Direction.DOWN);
                        // [DISABLED] tg.swipe(Direction.DOWN);
                        tg.wait(2);
                        tg.wait("ele_EnterfirstnameEditText1782900364278", ComparisonType.IS_VISIBLE, 123);
                        tg.type("ele_EnterfirstnameEditText1782900364278", "10", false);
                        tg.wait(1);
                        // [DISABLED] tg.click("ele_DoneButton", 1);
                        tg.wait("ele_EnteremailaddressEditText1782830312862", ComparisonType.IS_VISIBLE, 123);
                        tg.type("ele_EnteremailaddressEditText1782830312862", "Johnson", false);
                        tg.wait(1);
                    }
                }
            }
        }
        tg.printLogs("REPEAT IF with ELEMENT DONE..........");
        int var_NUM = 40;
        String var_TEXT = "Dwayne";
        while (tg.verify.isEqualTo(var_NUM, 40)) {
            while (tg.verify.isEqualTo(var_TEXT, "Dwayne")) {
                while (tg.verify.contains(var_TEXT, "yne")) {
                    while (tg.verify.isGreaterThanOrEqualTo(var_NUM, 40)) {
                        while (tg.verify.isGreaterThanOrEqualTo(var_NUM, 30)) {
                            while (tg.verify.isGreaterThan(var_NUM, 30)) {
                                var_NUM = tg.saveToVariable(10, var_NUM);
                                var_TEXT = tg.saveToVariable("Johnson", var_TEXT);
                            }
                        }
                    }
                }
            }
        }
        tg.printLogs("REPEAT IF VARIABLE ACTION SUCCESSSSS........");
        tg.type("ele_EnterfirstnameEditText1782900364278", "40", true);
        if (tg.performAssert("ele_EnterfirstnameEditText1782900364278", ComparisonType.EQUAL_TO, 40)) {
            if (tg.performAssert("ele_EnterfirstnameEditText1782900364278", ComparisonType.NOT_EQUAL_TO, 54)) {
                if (tg.performAssert("ele_EnteremailaddressEditText1782830312862", ComparisonType.EQUAL_TO, "Johnson")) {
                    if (tg.performAssert("ele_EnteremailaddressEditText1782830312862", ComparisonType.NOT_EQUAL_TO, "5tefdg")) {
                        if (tg.performAssert("ele_EnterfirstnameEditText1782900364278", ComparisonType.GREATER_THAN_OR_EQUAL_TO, 40)) {
                            if (tg.performAssert("ele_EnterfirstnameEditText1782900364278", ComparisonType.GREATER_THAN_OR_EQUAL_TO, 33)) {
                                if (tg.performAssert("ele_EnterfirstnameEditText1782900364278", ComparisonType.LESS_THAN_OR_EQUAL_TO, 40)) {
                                    if (tg.performAssert("ele_EnterfirstnameEditText1782900364278", ComparisonType.LESS_THAN_OR_EQUAL_TO, 67)) {
                                        if (tg.performAssert("ele_EnterfirstnameEditText1782900364278", ComparisonType.GREATER_THAN, 15)) {
                                            if (tg.performAssert("ele_EnterfirstnameEditText1782900364278", ComparisonType.LESS_THAN, 76)) {
                                                if (tg.performAssert("ele_EnteremailaddressEditText1782830312862", ComparisonType.CONTAINS, "Kar")) {
                                                    if (tg.performAssert("ele_EnterfirstnameEditText1782900364278", ComparisonType.IS_ENABLE)) {
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
        if (tg.performAssert(var_NUM, ComparisonType.EQUAL_TO, 11)) {
            tg.printLogs("Start IF insideee");
        } else {
            tg.printLogs("START ELSE ACTION DONE........");
        }
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void demo_copy() {
        tg.openDevice();
        tg.wait(2);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void dissmiss_alert_copy() {
        tg.openDevice();
        tg.wait(5);
        tg.tapByImage("ele_mainmenudetectlocationTextView1776866351598", 0.65);
        tg.wait(5);
        tg.alertButton("Don't Allow");
        tg.wait(10);
        tg.deactivateApp("org.asdtm.goodweather");
        tg.wait(5);
        tg.activateApp("org.asdtm.goodweather");
        tg.wait(10);
        // [DISABLED] tg.clearAppData("org.asdtm.goodweather");
        tg.wait(5);
        tg.activateApp("com.android.chrome");
        tg.wait(2);
        tg.setOrientation("LANDSCAPE");
        tg.wait(2);
        tg.clearAppData("com.android.chrome");
        tg.wait(5);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void networkasst_copy() {
        tg.openDevice();
        tg.wait("ele_OKButton1782897845098", ComparisonType.IS_VISIBLE, 123);
        tg.click("ele_OKButton1782897845098", 1);
        tg.wait("ele_mainmenurefreshTextView1782897866283", ComparisonType.IS_VISIBLE, 123);
        tg.click("ele_mainmenurefreshTextView1782897866283", 1);
        // [DISABLED] tg.wait("ele_mainmenudetectlocationTextView1782897852588", ComparisonType.IS_VISIBLE, 123);
        // [DISABLED] tg.click("ele_mainmenudetectlocationTextView1782897852588", 1);
        // [DISABLED] tg.wait("ele_WhileusingtheappButton1782897856747", ComparisonType.IS_VISIBLE, 123);
        // [DISABLED] tg.click("ele_WhileusingtheappButton1782897856747", 1);
        // [DISABLED] tg.wait("ele_mainmenurefreshTextView1782897866283", ComparisonType.IS_VISIBLE, 123);
        // [DISABLED] tg.click("ele_mainmenurefreshTextView1782897866283", 1);
        Double var_networkdata = .0;
        var_networkdata = tg.saveToVariable(51.51, var_networkdata);
        tg.networkAssert("NetworkAssert", var_networkdata);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void newkey01_copy() {
        tg.openDevice();
        tg.wait(2);
        tg.printPageSource();
        tg.pageLoadStart("Fullname");
        tg.wait("ele_EnteremailaddressEditText1782830312862", ComparisonType.IS_VISIBLE, 123);
        tg.type("ele_EnteremailaddressEditText1782830312862", "FullName", false);
        tg.pageLoadEnd("Fullname");
        tg.pageLoadStart("FirstName");
        tg.wait(1);
        tg.wait("ele_EnteremailaddressEditText1782830312862", ComparisonType.IS_VISIBLE, 123);
        tg.type("ele_EnteremailaddressEditText1782830312862", "FirstName", false);
        tg.pageLoadEnd("FirstName");
        tg.wait(1);
        tg.pageLoadStart("pageone");
        tg.wait("ele_EnteremailaddressEditText1782830312862", ComparisonType.IS_VISIBLE, 123);
        tg.type("ele_EnteremailaddressEditText1782830312862", "LastName", false);
        tg.pageLoadEnd("pageone");
        tg.pageLoadStart("ClearTap");
        tg.wait("ele_textinputendiconImageButton1782830338531", ComparisonType.IS_VISIBLE, 123);
        tg.click("ele_textinputendiconImageButton1782830338531", 1);
        tg.wait(2);
        tg.pageLoadEnd("ClearTap");
        String var_goodweather = "org.asdtm.goodweather";
        tg.pageLoadStart("ActivateApp");
        tg.activateApp(var_goodweather);
        tg.wait(2);
        tg.deactivateApp("org.asdtm.goodweather");
        tg.wait(2);
        tg.activateApp(var_goodweather);
        tg.wait(2);
        tg.pageLoadEnd("ActivateApp");
        tg.setOrientation("LANDSCAPE");
        tg.wait(2);
        tg.setOrientation("PORTRAIT");
        tg.printLogs("SUCESSS");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void otheractions_copy() {
        tg.openDevice();
        tg.wait(2);
        tg.wait("ele_EnteremailaddressEditText1782830312862", ComparisonType.IS_VISIBLE, 123);
        tg.typeEncrypted("ele_EnteremailaddressEditText1782830312862", "4LlEC0F1NHwTDpLoS++pAA==:MTIzNDU2Nzg5MTAxMTEyMQ==", false);
        tg.wait(1);
        // [DISABLED] tg.click("ele_DoneButton", 1);
        tg.wait("ele_textinputendiconImageButton1782830338531", ComparisonType.IS_VISIBLE, 123);
        tg.click("ele_textinputendiconImageButton1782830338531", 1);
        tg.wait(5);
        tg.customScriptStart();
        WebElement email = driver.findElement(By.xpath("(//android.widget.EditText[@resource-id='com.app.urunner:id/et_email'])[1]"));
        email.sendKeys("Demo_Email" + "\n");
        tg.customScriptEnd();
        tg.wait(1);
        tg.printLogs("CUSTOM SCRIPT ACTION DONE......");
        tg.wait(2);
        int var_count = 2;
        while (tg.verify.isLessThan(var_count, 4)) {
            tg.declare("ele_declarekey", "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[{$}]/android.widget.FrameLayout[1]/android.widget.EditText[1]", var_count);
            tg.type("ele_declarekey", var_gstr, true);
            var_count = tg.increments(var_count, 1);
        }
        tg.wait(1);
        tg.printLogs("DECLARE KEY ACTION DONE........");
        int var_NUM = 99999;
        tg.printLogs(var_NUM);
        var_NUM = tg.saveToVariable(77777, var_NUM);
        tg.printLogs(var_NUM);
        String var_Str = "TestingDocumentLog";
        tg.printLogs(var_Str);
        Double var_Dbl = 99.00;
        tg.printLogs(var_Dbl);
        var_Dbl = tg.saveToVariable(999000.9999, var_Dbl);
        tg.printLogs(var_Dbl);
        tg.wait(1);
        tg.printLogs("PULL DOWN TO REFRESH ACTION DONE........");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void register_copy() {
        tg.openDevice();
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void savetovariableactions_copy() {
        tg.openDevice();
        tg.wait(2);
        tg.swipe(Direction.DOWN);
        String var_elementdetails = "Null";
        var_elementdetails = tg.saveToVariable("ele_EnteremailaddressEditText1782830312862", var_elementdetails);
        tg.printLogs(var_elementdetails);
        var_elementdetails = tg.saveToVariable("ele_EnterpasswordEditText1782830323675", var_elementdetails);
        tg.printLogs(var_elementdetails);
        String var_v1 = "";
        var_v1 = tg.saveToVariable(var_v1, "capability", "platformName");
        String var_v2 = "";
        var_v2 = tg.saveToVariable(var_v2, "capability", "newCommandTimeout");
        String var_v3 = "";
        var_v3 = tg.saveToVariable(var_v3, "capability", "udid");
        String var_v4 = "";
        var_v4 = tg.saveToVariable(var_v4, "capability", "platformVersion");
        String var_v5 = "";
        var_v5 = tg.saveToVariable(var_v5, "capability", "automationName");
        String var_v6 = "";
        var_v6 = tg.saveToVariable(var_v6, "deviceinfo", "model");
        String var_v7 = "";
        var_v7 = tg.saveToVariable(var_v7, "deviceinfo", "manufacturer");
        String var_v8 = "";
        var_v8 = tg.saveToVariable(var_v8, "deviceinfo", "android version");
        String var_v9 = "";
        var_v9 = tg.saveToVariable(var_v9, "deviceinfo", "udid");
        String var_v10 = "";
        var_v10 = tg.saveToVariable(var_v10, "deviceinfo", "devicetime");
        String var_v11 = "";
        var_v11 = tg.saveToVariable(var_v11, "regex", "[A-Za-z]{5,10}");
        tg.wait(1);
        tg.customScriptStart();
        System.out.println("platForm : " + var_v1);
        System.out.println("newCommandTimout : " + var_v2);
        System.out.println("uDID : " + var_v3);
        System.out.println("platFormVer : " + var_v4);
        System.out.println("automationName : " + var_v5);
        System.out.println("Model : " + var_v6);
        System.out.println("Manufacture : " + var_v7);
        System.out.println("iOSVersion : " + var_v8);
        System.out.println("uDID : " + var_v9);
        System.out.println("DeviceTime : " + var_v10);
        System.out.println("Regex : " + var_v11);
        tg.customScriptEnd();
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void secureglobalruntime_copy() {
        tg.openDevice();
        tg.wait(2);
        tg.printLogs(var_gstr);
        tg.printLogs(var_gstr);
        String var_local1 = "null";
        String var_local2 = "null";
        var_gstr = tg.saveToVariable(var_local1, var_gstr);
        var_ra_ra_str = tg.saveToVariable(var_local2, var_ra_ra_str);
        tg.printLogs(var_gstr);
        tg.printLogs(var_ra_ra_str);
        tg.startSecureBlock();
        tg.wait("ele_EnteremailaddressEditText1782830312862", ComparisonType.IS_VISIBLE, 123);
        tg.type("ele_EnteremailaddressEditText1782830312862", "DemoTest", false);
        tg.printLogs(var_gstr);
        tg.endSecureBlock();
        tg.wait(2);
        tg.startSecureBlock();
        tg.wait("ele_EnterpasswordEditText1782830323675", ComparisonType.IS_VISIBLE, 123);
        tg.type("ele_EnterpasswordEditText1782830323675", "FirstName", false);
        tg.printLogs(var_ra_ra_str);
        tg.endSecureBlock();
        tg.wait(2);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void swipe_copy() {
        tg.openDevice();
        tg.customScriptStart();
        driver.get("https://www.amazon.in");
        tg.customScriptEnd();
        tg.wait(5);
        tg.swipe(Direction.LEFT);
        tg.wait(5);
        tg.swipe(Direction.RIGHT);
        tg.wait(5);
        tg.swipe(Direction.UP);
        tg.wait(5);
        tg.swipe(Direction.DOWN);
        tg.writeToCSV("text", "text", "swipe works perfectly....");
        tg.pullToRefresh("ele_View1776872579960");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tdpjson_copy() {
        tg.openDevice();
        tg.wait(2);
        JSONObject var_Data = tg.getJsonData("https://poc27.testgrid.io/s/csv-to-json/20260618/IHfGcT.json");
        int var_count = 0;
        String var_fname = "Null";
        String var_email = "Null";
        while (tg.verify.isLessThanOrEqualTo(var_count, 1)) {
            var_fname = tg.saveToVariable(var_fname, var_Data, "$.records[" + var_count + "].FirstName");
            tg.wait("ele_EnteremailaddressEditText1782830312862", ComparisonType.IS_VISIBLE, 123);
            tg.type("ele_EnteremailaddressEditText1782830312862", var_fname, false);
            tg.wait(2);
            var_email = tg.saveToVariable(var_email, var_Data, "$.records[" + var_count + "].LastName");
            tg.wait("ele_EnteremailaddressEditText1782830312862", ComparisonType.IS_VISIBLE, 123);
            tg.type("ele_EnteremailaddressEditText1782830312862", var_email, false);
            tg.wait(1);
            var_count = tg.increments(var_count, 1);
        }
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tdptgvar_copy() {
        tg.openDevice();
        tg.wait(2);
        tg.wait("ele_EnteremailaddressEditText1782830312862", ComparisonType.IS_VISIBLE, 123);
        tg.type("ele_EnteremailaddressEditText1782830312862", "DemoTest", false);
        tg.wait(2);
        tg.wait("ele_EnterpasswordEditText1782830323675", ComparisonType.IS_VISIBLE, 123);
        tg.type("ele_EnterpasswordEditText1782830323675", "EmailTest", false);
        tg.wait(1);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void wcsvtapbyimage_copy() {
        tg.openDevice();
        tg.wait(2);
        String var_name = "alice";
        tg.writeToCSV("var_name", var_name, "");
        tg.writeToCSV("var_gstr", var_gstr, "");
        var_name = tg.saveToVariable(var_gstr, var_name);
        tg.writeToCSV("var_name", var_name, "");
        tg.writeToCSV("text", "text", "text1");
        tg.tapByImage("ele_SignInButton1782900326059", 0.65);
        tg.wait(1);
        tg.close();
    }

    public static void check_func__copy() {
        tg.type("ele_EnteremailaddressEditText1782830312862", "40", false);
        tg.wait(1);
        tg.check.isEqualTo("ele_EnteremailaddressEditText1782830312862", "40");
        tg.check.isNotEqualTo("ele_EnteremailaddressEditText1782830312862", "44");
        tg.check.isGreaterThanOrEqualTo("ele_EnteremailaddressEditText1782830312862", "40");
        tg.check.isLessThanOrEqualTo("ele_EnteremailaddressEditText1782830312862", "44");
        tg.check.isGreaterThan("ele_EnteremailaddressEditText1782830312862", "38");
        tg.check.isLessThan("ele_EnteremailaddressEditText1782830312862", "42");
        tg.check.isEnabled("ele_EnteremailaddressEditText1782830312862");
        tg.wait(2);
        tg.printLogs("Done");
        tg.printLogs("Check Action Success..........!!!!!!!!!!!");
    }

    public static void launchdemoqa_copy() {
        tg.customScriptStart();
        driver.get("https://demoqa.com/automation-practice-form");
        tg.customScriptEnd();
        tg.wait(5);
    }
}
