package pjelovnici.profesionalni_jelovnici.service;

import pjelovnici.profesionalni_jelovnici.dto.EmailMessageDto;

public interface EmailService {

    public void sendEmail(EmailMessageDto emailMessage);

}
