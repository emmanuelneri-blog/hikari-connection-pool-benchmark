package br.com.emmanuelneri.repository;

import br.com.emmanuelneri.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findAllByName(String name);
}
