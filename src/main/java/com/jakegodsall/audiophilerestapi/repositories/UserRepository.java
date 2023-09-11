package com.jakegodsall.audiophilerestapi.repositories;

import com.jakegodsall.audiophilerestapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
