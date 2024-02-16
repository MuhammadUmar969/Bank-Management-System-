import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class Mail {
    public static void send( String to, String sub, String msg) {
        String from = "digitalbankmanagementsystem@gmail.com";
        String password = "project@1";
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
        props.put("mail.smtp.starttls", "true");
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");
        // get Session
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(from, password);
                    }
                });
        // compose message
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(sub);
            message.setContent(msg,"text/html");
            // send message
            Transport.send(message);
        } catch (MessagingException mex) {
            throw new RuntimeException(mex);
        }

    }


}