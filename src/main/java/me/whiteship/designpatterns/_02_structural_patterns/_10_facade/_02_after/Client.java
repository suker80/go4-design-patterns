package me.whiteship.designpatterns._02_structural_patterns._10_facade._02_after;

public class Client {
    public static void main(String[] args) {

        EmailSettings emailSettings = new EmailSettings("127.0.0.1");
        EmailSender sender = new EmailSender(emailSettings);

        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setTo("keesun@whiteship.me");
        emailMessage.setFrom("whiteship@whiteship.me");
        emailMessage.setSubject("방가방가 디자인패턴");
        emailMessage.setText("반가워요 디자인패턴!");
        sender.sendEmail(emailMessage);

    }
}

