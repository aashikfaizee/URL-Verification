package com.tutorilaninja.qa.test.utils;

import java.util.Date;

public class Utilities {

	public static String genereateTimestamp() {

		Date date = new Date();
		String timestamp= date.toString().replace(" ", "_").replace(":", "");
		return "rpradeepsrinivasan"+timestamp+"@gmail.com";

	}
}
