package pjelovnici.profesionalni_jelovnici.service.impl;



import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import pjelovnici.profesionalni_jelovnici.dto.EmailMessageDto;
import pjelovnici.profesionalni_jelovnici.service.EmailService;

@Service
public class EmailServiceImpl implements EmailService {

    private final JavaMailSender emailSender;

    public EmailServiceImpl(JavaMailSender emailSender) {
        this.emailSender = emailSender;
    }

    @Override
    public void sendEmail(EmailMessageDto emailMessage) {
        MimeMessage message = emailSender.createMimeMessage(); // MimeMessage object is used to send email with attachments
        try {
            MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8"); 

            helper.setFrom("nivancev02@gmail.com");
            helper.setTo(emailMessage.getEmail());
            helper.setSubject(emailMessage.getSubject());

            String htmlContent = "<html><body>"
                    + "<h1 style='color: navy;'>Profesionalni jelovnici</h1>"
                    + "<p>Poštovani " + emailMessage.getName() + ",</p>"
                    + "<p>Hvala Vam što ste nas kontaktirali. Vaša poruka je uspešno poslata sa sledećim sadržajem: </p>"
                    + "<br>"
                    + "<h3 style='color: navy;'>" + emailMessage.getSubject() + "</h3>"
                    + "<p><b>Name:</b> " + emailMessage.getName() + "</p>"
                    + "<p><b>Email:</b> " + emailMessage.getEmail() + "</p>"
                    + "<p><b>Message:</b></p><p>" + emailMessage.getMessage() + "</p>"
                    + "<p style='color: grey;'>Očekujte odgovor u najkraćem mogućem roku. Hvala!</p>"
                    + "<br>"
                    + "<p>Srdačan pozdrav,</p>"
                    + "<p>Profesionalni jelovnici</p>"
                    + "</body></html>";

            helper.setText(htmlContent, true); // true indicates HTML
            // continue with sending the email...
            emailSender.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
