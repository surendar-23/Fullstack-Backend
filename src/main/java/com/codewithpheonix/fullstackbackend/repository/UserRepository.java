package com.codewithpheonix.fullstackbackend.repository;

import com.codewithpheonix.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
