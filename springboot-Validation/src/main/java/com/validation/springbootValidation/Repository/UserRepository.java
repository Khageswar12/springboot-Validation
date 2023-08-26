package com.validation.springbootValidation.Repository;

import com.validation.springbootValidation.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
