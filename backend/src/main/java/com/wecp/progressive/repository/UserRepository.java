package com.wecp.progressive.repository;


<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository;

import com.wecp.progressive.entity.User;

public interface UserRepository extends JpaRepository<User,Integer>{

    User findByUsername(String username);

    User findByEmail(String email);
=======
public interface UserRepository {
>>>>>>> 1e477257c951fd34a277dae7c497465b61ae0a5b
}
