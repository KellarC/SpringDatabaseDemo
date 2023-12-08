package kellarc.springdatabasedemo.springdatabasedemo.controllers;

import kellarc.springdatabasedemo.springdatabasedemo.model.entities.Account;
import kellarc.springdatabasedemo.springdatabasedemo.services.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/account")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    public List<Account> getAllAccounts() {
        return accountService.getAllAccounts();
    }

    @GetMapping("/{id}")
    public Optional<Account> getAccountById(@PathVariable("id") Long id){
        return accountService.getById(id);
    }

    @PostMapping
    public Account postAccount(@RequestBody Account account) {
        return accountService.postAccount(account);
    }

    @PutMapping
    public Account updateEmployee(@RequestBody Account account) {
        return accountService.updateAccount(account);
    }

    @DeleteMapping("/{id}")
    public void deleteAccount(@PathVariable("id") Long id) {
        accountService.deleteAccount(id);
    }
}
