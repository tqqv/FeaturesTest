package mailer;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mailer {
	static String host = "smtp.gmail.com";
	static String port = "587";
	static String username = "trinhquang96vu@gmail.com";
	static String password = "ojczliwiidcoeeje";

	String subject;
	String recipient;
	String message;

	public Mailer(String subject, String recipient, String message) {
		this.subject = subject;
		this.recipient = recipient;
		this.message = message;
	}

	public void send() {
		
		Properties props = new Properties();

		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", 587);
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.ssl.protocols", "TLSv1.2");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.ssl.trust", "smtp.gmail.com");

		System.out.println(props);
		Session session = Session.getInstance(props, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});
		try {
			System.out.println("check");
			Message msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(username));
			msg.setRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
			msg.setSubject(subject);
			msg.setText(message);
			System.out.println("check");
			Transport.send(msg);
			System.out.println("Email sent successfully.");
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static void main(String[] args) {
		new Mailer("Helloo", "nomnom15062002@gmail.com","hi").send();
	}

	
}