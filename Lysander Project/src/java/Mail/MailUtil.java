package Mail;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import java.util.Properties;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Dell
 */
public class MailUtil {
private String message;
    
    
    public String getmesage()
    {
        return message;
    }
    
    public void setmessage(String message)
    {
        this.message = message;
    }
    
    
    
    
    public static void sendMail(String recepient) throws Exception
    {
        System.out.println("Preparing to send email");
        Properties properties = new Properties();
        
        properties.put("mail.smtp.starttls.enale","true");
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port","465");
        properties.put("mail.smtp.socketFactory.port", "465");
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        
        String myAccountEmail = "hotellysanderinfo@gmail.com";
        String password = "lysander123";
        
        Session session = Session.getInstance(properties, new Authenticator()
        {
            @Override
            protected PasswordAuthentication getPasswordAuthentication()
            {
                return new PasswordAuthentication(myAccountEmail,password);
            }
        });
        
        Message message = prepareMessage(session, myAccountEmail, recepient);
    
        Transport.send(message);
        System.out.println("Message sent Successfully");
    }

    private static Message prepareMessage(Session session, String myAccountEmail, String recepient) throws AddressException, MessagingException {
        try{
            Message message =  new MimeMessage(session);
            message.setFrom(new InternetAddress("myAccountEmail"));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject("Hotel Lysander");
            String htmlCode = "<h1>Hello</h1>";
            message.setContent(htmlCode,"text/html");
            return message;
            
                         
            
        }
        catch(AddressException ex)
        {
            
    }
    
    return  null;
        
            
  
    }



  

 
}
