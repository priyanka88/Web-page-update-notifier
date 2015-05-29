package com.company;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * Created by priyankachavan on 4/28/15.
 */
public class SendEmail {
     String to;
     String from;
     String host;
     String port;
     String messageContent;
    public boolean sendingMessage()
    {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        Session session = Session.getInstance(props,null);

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("priyankachavan924@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse("priyankachavan88@gmail.com"));
            message.setSubject("CS635");
            message.setText("Testing web site updater");
            Transport.send(message, "priyankachavan924@gmail.com", "Ashapri88");
            System.out.println("Sent message successfully....");
            return true;
        } catch (MessagingException e) {
            System.out.println(e.toString());
            return false;
        }
    }
}
