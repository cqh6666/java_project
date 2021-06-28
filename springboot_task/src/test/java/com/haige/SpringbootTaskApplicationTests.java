package com.haige;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@SpringBootTest
class SpringbootTaskApplicationTests {

    @Resource
    JavaMailSenderImpl mailSender;
    @Test
    void sendSimpleMail() {

        // 简单的邮件
        SimpleMailMessage mailMessage = new SimpleMailMessage();

        mailMessage.setSubject("简单邮件主题");
        mailMessage.setText("简单邮件文本");

        mailMessage.setTo("1103878898@qq.com");
        mailMessage.setFrom("1103878898@qq.com");

        mailSender.send(mailMessage);

    }

    @Test
    void sendMimeMail() throws MessagingException {

        // 复杂的邮件
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        // 组装
        MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true);
        messageHelper.setSubject("复杂邮件主题");
        messageHelper.setText("<p style='color:red'>复杂邮件文本</p>",true);
        // 附件
        messageHelper.addAttachment("1.jpg",new File("path"));

        messageHelper.setTo("1103878898@qq.com");
        messageHelper.setFrom("1103878898@qq.com");

        mailSender.send(mimeMessage);

    }

}
