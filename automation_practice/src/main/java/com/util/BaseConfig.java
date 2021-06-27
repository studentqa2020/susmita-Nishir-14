package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseConfig {
 public static String getConfigValue() {
	 
	File file = new File("./ConfigFile");
	
	FileInputStream fis = null ;
	try {
		fis = new FileInputStream(file);
	} catch (FileNotFoundException e) {
				e.printStackTrace();
	}
	 
	Properties pro = new Properties();
	try {
		pro.load(fis);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	System.out.println(pro.getProperty(value));
	System.out.println("");
	System.out.println("");
	return pro.getProperty(value); 
 }
 
 public static void main(String[] args) {
	 BaseConfig.getConfigValue();	
}
}
