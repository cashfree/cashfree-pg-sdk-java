package com.cashfree.pg;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestConfig {

  private static final Properties localProps = new Properties();

  static {
    try {
      FileInputStream fis = new FileInputStream("local.properties");
      localProps.load(fis);
    } catch (IOException ignored) {
    }
  }

  public static String get(String key) {
    String value = System.getenv(key);
    return value != null ? value : localProps.getProperty(key);
  }
}

