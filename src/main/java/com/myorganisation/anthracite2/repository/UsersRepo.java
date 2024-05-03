package com.myorganisation.anthracite2.repository;

import com.myorganisation.anthracite2.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


//@Repository
public interface UsersRepo extends JpaRepository<Employee, Integer> {

    Optional<Employee> findByEmail(String email);


}
