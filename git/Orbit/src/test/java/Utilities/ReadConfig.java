package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	public ReadConfig() {
		File f =new File("C:\\Users\\white\\git\\Orbit\\target\\Config.properties");

		try {
			FileInputStream fis=new FileInputStream(f);//convert file data into reading mode
			pro=new Properties();
			pro.load(fis);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

		
		
		
	

	}
	
	//associated methods
	public String getApplicationURL() {
		String url= pro.getProperty("url");
		return url;
		
	}
	public String getemailid() {
		String usr= pro.getProperty("emailid");
		return usr;
		
	}
    public String getPassword() {
    	String password=pro.getProperty("password");
    	return password;
    }

}
