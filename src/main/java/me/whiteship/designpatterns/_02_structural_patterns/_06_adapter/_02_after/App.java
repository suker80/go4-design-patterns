package me.whiteship.designpatterns._02_structural_patterns._06_adapter._02_after;

import me.whiteship.designpatterns._02_structural_patterns._06_adapter._01_before.AccountService;

public class App {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        AccountUserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);

        String login = loginHandler.login("태규", "태규");
        System.out.println(login);

    }
}
