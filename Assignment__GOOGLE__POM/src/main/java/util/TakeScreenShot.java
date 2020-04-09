package util;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import base.TestBase;



public class TakeScreenShot extends TestBase {

	public String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}

	public static void getscreenshot() throws IOException {
		File srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String CurrentDIr = System.getProperty("user.dir");
		FileHandler.copy(srcfile, new File(CurrentDIr + "/Screenshot/" + System.currentTimeMillis() + ".png"));

	}

}
