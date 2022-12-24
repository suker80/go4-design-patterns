package me.whiteship.designpatterns._02_structural_patterns._06_adapter._02_after;

import me.whiteship.designpatterns._02_structural_patterns._06_adapter._01_before.Account;
import me.whiteship.designpatterns._02_structural_patterns._06_adapter._01_before.AccountService;
import me.whiteship.designpatterns._02_structural_patterns._06_adapter._01_before.security.UserDetails;
import me.whiteship.designpatterns._02_structural_patterns._06_adapter._01_before.security.UserDetailsService;

public class AccountUserDetailsService implements UserDetailsService {
    private final AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account accountByUsername = accountService.findAccountByUsername(username);
        return new AccountUserDetails(accountByUsername);
    }

}
