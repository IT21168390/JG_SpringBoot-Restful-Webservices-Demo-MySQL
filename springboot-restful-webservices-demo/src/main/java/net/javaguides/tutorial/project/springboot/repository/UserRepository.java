package net.javaguides.tutorial.project.springboot.repository;

import net.javaguides.tutorial.project.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
