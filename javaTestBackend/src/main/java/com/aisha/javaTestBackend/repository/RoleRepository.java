package com.aisha.javaTestBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aisha.javaTestBackend.model.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{

}
