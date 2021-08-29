package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import beans.Contact;
import tools.ReadProperties;

public class ContactList {
	private static ReadProperties config = new ReadProperties();
	private static String driver = config.getDriver();
	private String url = config.getUrl();
	private String user = config.getUser();
	private String pass = config.getPass();
	
	static {
		try {
			Class.forName(driver);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void addContact(Contact contact) {
		try (Connection cn = DriverManager.getConnection(url, user, pass);) {

			String sql = "Insert into contactos (name, email, phoneNumber)";
			sql += "values(?, ?, ?)";

			// Make query
			PreparedStatement ps = cn.prepareStatement(sql);

			// Pass values
			ps.setString(1, contact.getName());
			ps.setString(2, contact.getEmail());
			ps.setInt(3, contact.getNumberPhone());

			// Run query
			ps.execute();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	
	public void deleteContact(int id) {
		try (Connection cn = DriverManager.getConnection(url, user, pass);) {
            String sql="Delete from contact where id = ?";
            
            PreparedStatement ps=cn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
        }  catch (SQLException ex) {
            ex.printStackTrace();
        }     
    }
}
