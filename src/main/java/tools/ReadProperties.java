package tools;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	private String driver;
	private String url;
	private String user;
	private String pass;
	
	public ReadProperties() {
		this.readData();		
	}	

	private void readData() {
		Properties properties= new Properties();
	    try {
	    	properties.load(new FileInputStream(new File("config.properties")));
      
			this.driver = properties.getProperty("DB_DRIVER");
			this.url = properties.getProperty("DB_URL");
			this.user = properties.getProperty("DB_USER");
			this.pass = properties.getProperty("DB_PASS");

	    } catch (IOException e) {
	      e.printStackTrace();
	    } 		
	}

	public String getDriver() {
		return driver;
	}

	public String getUrl() {
		return url;
	}

	public String getUser() {
		return user;
	}

	public String getPass() {
		return pass;
	}
}


