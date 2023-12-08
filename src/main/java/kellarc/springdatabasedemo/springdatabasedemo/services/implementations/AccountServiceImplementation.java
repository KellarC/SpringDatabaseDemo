package kellarc.springdatabasedemo.springdatabasedemo.services.implementations;

import kellarc.springdatabasedemo.springdatabasedemo.model.entities.Account;
import kellarc.springdatabasedemo.springdatabasedemo.repositories.AccountRepository;
import kellarc.springdatabasedemo.springdatabasedemo.services.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImplementation implements AccountService {

    private final AccountRepository accountRepository;

    public AccountServiceImplementation(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public Optional<Account> getById(Long id) {
        return accountRepository.findById(id);
    }

    @Override
    public Account postAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Account updateAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public void deleteAccount(Long id) {
        accountRepository.deleteById(id);
    }
}
