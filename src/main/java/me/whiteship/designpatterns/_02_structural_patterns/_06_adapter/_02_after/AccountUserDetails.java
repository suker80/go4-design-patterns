package me.whiteship.designpatterns._02_structural_patterns._06_adapter._02_after;

import me.whiteship.designpatterns._02_structural_patterns._06_adapter._01_before.Account;
import me.whiteship.designpatterns._02_structural_patterns._06_adapter._01_before.security.UserDetails;

public class AccountUserDetails implements UserDetails {
    private final Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }

    @Override
    public String getUsername() {
        return account.getName();
    }

    @Override
    public String getPassword() {
        return account.getPassword();
    }

}
