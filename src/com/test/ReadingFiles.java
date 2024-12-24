package com.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingFiles {

	public static void main(String[] args) throws IOException {

		System.out.println(System.getProperty("user.dir"));
		
		Properties prop = new Properties();

		String path = System.getProperty("user.dir")+"/project.properties";

		FileInputStream fs = new FileInputStream(path);
		prop.load(fs);
		
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("url"));

	}

}
