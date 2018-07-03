package com.mycompany.myapp.users;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;



public class MailService {

	public static void mailsend(MailVO vo) {
		// 받는 사람의 전자 메일 ID를 언급해야합니다.

		String to = vo.getTo(); // 적절하게 변경

		// 발신자의 이메일 ID를 언급해야합니다.
		String from = vo.getFrom();// 적절게 변경
		final String username = vo.getUsername();// 적절하게 변경
		final String password = vo.getPassword();// 절하게 변경

		// relay.jangosmtp.net을 통해 전자 메일을 보내고 있다고 가정합니다.
		String host = "smtp.gmail.com";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", "587");

		// Session 객체를 가져옵니다.
		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {
			// 디폴트의 ​​MimeMessage 오브젝트를 작성합니다.
			Message message = new MimeMessage(session);

			// 머리글의 From : 헤더 필드를 설정합니다.
			message.setFrom(new InternetAddress(from));

			// 헤더의 Set To : 헤더 필드.
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));

			// 제목 설정 : 헤더 필드
			message.setSubject(vo.getSubject());

			// 이제 실제 메시지를 설정하십시오.
			message.setText(vo.getText());

			// Send message
			Transport.send(message);

			System.out.println("Sent message successfully....");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}
