package Mail;

import javax.mail.internet.AddressException;

/**
 *
 * @author Dell
 */
public class JavaMail {
    
    public static void main(String args[]) throws AddressException, Exception
    {
        MailUtil.sendMail("hotellysanderinfo@gmail.com");
    }
    
}
