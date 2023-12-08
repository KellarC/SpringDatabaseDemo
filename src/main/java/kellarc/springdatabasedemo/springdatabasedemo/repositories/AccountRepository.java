package kellarc.springdatabasedemo.springdatabasedemo.repositories;

import kellarc.springdatabasedemo.springdatabasedemo.model.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
}