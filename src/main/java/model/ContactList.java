package model;

import tools.ReadProperties;

public class ContactList {
	private static ReadProperties config = new ReadProperties();
	private static String driver = config.getDriver();

	static {
		try {
			Class.forName(driver);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
