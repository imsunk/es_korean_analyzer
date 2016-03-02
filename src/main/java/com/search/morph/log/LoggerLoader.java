package com.search.morph.log;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;

import com.search.morph.conf.Configuration;

public class LoggerLoader {
	public static void load(){
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(new File(Configuration.LOG_CONF_FILE)));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		PropertyConfigurator.configure(prop);
	}
	
	public static void load(String path) {
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(new File(path)));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		PropertyConfigurator.configure(prop);
	}

}
