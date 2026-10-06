package com.sam.springsecex.Repo;

import com.sam.springsecex.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepo extends JpaRepository<Users, Integer> {

    Users findByUsername(String username);

}