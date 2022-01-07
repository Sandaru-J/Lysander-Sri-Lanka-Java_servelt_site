/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Verification;

import java.util.Properties;
import java.util.Random;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Dell
 */
public class SendEmail {
    
     public String getRandom()
     {
         Random rand = new Random();
         int number = rand.nextInt(999999);
         
         return String.format("%06d", number);
     }
     
     public boolean sendEmail(User user)
     {
         boolean test = false;
         
         String toEmail = user.getEmail();
         String fromEmail = "hotellysanderinfo@gmail.com";
         String password = "lysander123";
         
         try
         {
            Properties pr = new Properties();
            
            pr.setProperty("mail.smtp.starttls.enale","true");
            pr.setProperty("mail.smtp.auth","true");
            pr.setProperty("mail.smtp.host","smtp.gmail.com");
            pr.setProperty("mail.smtp.port","465");
            pr.put("mail.smtp.socketFactory.port", "465");
            pr.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
         
         
         
         //get session
         Session session = Session.getDefaultInstance(pr, new Authenticator() 
         {
             protected PasswordAuthentication getPAsswordAuthentication()
             {
                 return new PasswordAuthentication(fromEmail,password);
             } 
         });
         
         Message message = new MimeMessage(session);
         
         message.setFrom(new InternetAddress(fromEmail));
         message.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
         message.setSubject("User Email VErfication");
         message.setText("Verify your Account.\nCode : "+user.getCode());
         
             Transport.send(message);
         
         }
         
         catch(Exception e)
         {
            e.printStackTrace();
         }
         
         
         
         return test;
     }
}
