package com.aisha.javaTestBackend.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aisha.javaTestBackend.model.Statement;
@Repository
public interface StatementRepository extends JpaRepository<Statement, Integer>{
	
	List<Statement> findAllByAccountIid(int accound_id);
}
