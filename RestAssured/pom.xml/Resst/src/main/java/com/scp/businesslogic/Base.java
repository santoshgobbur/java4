package com.scp.businesslogic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

//import org.testng.annotations.BeforeMethod;

public class Base {
 
	public Properties p;
	
	public Base(){
		
	    p = new Properties();
		//File f = new File ("Resources/Environment.properties");
		FileInputStream readpropertyfile = null;
		try {
			readpropertyfile = new FileInputStream("Resources/Environment.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			p.load(readpropertyfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
