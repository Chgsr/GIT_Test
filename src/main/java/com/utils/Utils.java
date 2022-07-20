package com.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utils {

	public  static String getPropertyValue(String Key) throws IOException {

		Properties pr = new Properties();
		FileInputStream FIS = new FileInputStream(System.getProperty("user.dir") + "\\Data.properties");
		pr.load(FIS);
		return pr.getProperty(Key);
	}

}
