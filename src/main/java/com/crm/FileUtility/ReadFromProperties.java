package com.crm.FileUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromProperties {
  public static String readProperty(String key) throws IOException {
    Properties prop = new Properties();
    File path = new File("C:\\Users\\Aniket Sandbhor\\eclipse-workspace2\\com.crm.AdvSeleniumA10\\src\\test\\resources\\OrangeHRM.properties");
    FileInputStream fis = new FileInputStream(path);
    prop.load(fis);
    String data = prop.getProperty(key);
    return data;
  }
}