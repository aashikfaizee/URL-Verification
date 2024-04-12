package data_Driven;


import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.search.SubjectTerm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import javax.mail.internet.*;




public class Forgot_password {

	public static void main(String[] args) {
		final String username ="rpradeepsrinivasan@yahoo.com";
		final String password = "Ph307$308";

		//setup javamail properties
		Properties prop= new Properties();
		prop.put("mail.imap.host","imap.mail.yahoo.com");
		prop.put("mail.imap.port", "993");
		//prop.put("mail.imap.ssl.enable","true");
		// Disable SSL certificate validation
		prop.put("mail.imap.ssl.trust", "*");


		Session session = Session.getInstance(prop,
				new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});


		try {
			// Connect to the email server
			Store store = session.getStore("imap");
			store.connect();

			// Open the inbox folder
			Folder inbox = store.getFolder("INBOX");
			inbox.open(Folder.READ_ONLY);

			// Search for emails containing the "Forgot Password" subject
			Message[] messages = inbox.search(new SubjectTerm("Forgot Password"));

			// Assuming there's only one email with the subject "Forgot Password"
			Message message = messages[0];

			// Extract the link from the email content (parsing HTML content)
			String content = (String) message.getContent();
			// Parse the content to find the "Forgot Password" link

			// Close the connection
			inbox.close(false);
			store.close();


			// Use Selenium to automate a web browser and click the link
			WebDriver driver = new ChromeDriver();
			String forgotPasswordLink = null;
			driver.get(forgotPasswordLink);
			// Click the link and perform further actions as needed
        
			// Close the browser
			driver.quit();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
