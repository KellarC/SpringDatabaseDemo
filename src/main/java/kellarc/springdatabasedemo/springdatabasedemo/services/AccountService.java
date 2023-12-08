package kellarc.springdatabasedemo.springdatabasedemo.services;

import kellarc.springdatabasedemo.springdatabasedemo.model.entities.Account;

import java.util.List;
import java.util.Optional;

public interface AccountService {
    List<Account> getAllAccounts();
    Optional<Account> getById(Long id);
    Account postAccount(Account account);
    Account updateAccount(Account account);
    void deleteAccount(Long id);
}
