package com.mkyong.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class App {
	
	@Autowired
	private Environment env;
	
	public String test(){

	Properties prop = new Properties();
	Properties properties = new Properties();
	/*InputStream input = null;

	try {

		input = new FileInputStream("config.properties");

		// load a properties file
		prop.load(input);

		// get the property value and print it out
		System.out.println(prop.getProperty("database"));
		System.out.println(prop.getProperty("dbuser"));
		System.out.println(prop.getProperty("dbpassword"));

	} catch (IOException ex) {
		ex.printStackTrace();
	} finally {
		if (input != null) {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}*/
/*	String fileName = System.getProperty("jboss.server.config.dir/system.properties");*/
    /*    try (FileInputStream fis = new FileInputStream("\\opt\\system.properties")) {
            prop.load(fis);
        	System.out.println(prop.getProperty("jdbc.password"));
            
        }*/
	try {
		File file = new File( System.getenv("FILE_PATH") + "\\opt\\system.properties");
	/*	File file = new File( "/opt/system.properties");*/
		FileInputStream fileInput = new FileInputStream(file);
		
		properties.load(fileInput);
		fileInput.close();
		System.out.println("jdbc.username:"+properties.getProperty("jdbc.username"));
		System.out.println("password:"+properties.getProperty("jdbc.password"));
		System.out.println("url:"+properties.getProperty("jdbc.url"));
		
		}
	
        catch (Exception e) {
            e.printStackTrace();
            
        }
	return properties.getProperty("jdbc.url");
	}
  
}
