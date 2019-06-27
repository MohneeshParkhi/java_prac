package com.mohneesh.CollectionsPackage.sortingCollection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClassExample {
 public static void main(String[] args) throws IOException, FileNotFoundException {
	FileReader fileReader = new FileReader("db.properties");
	
	Properties prop = new Properties();
	prop.load(fileReader);
	
	System.out.println(prop.get("user"));
	System.out.println(prop.getProperty("user"));
}
}
