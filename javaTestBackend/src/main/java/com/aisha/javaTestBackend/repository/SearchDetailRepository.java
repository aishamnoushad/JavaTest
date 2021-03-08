package com.aisha.javaTestBackend.repository;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aisha.javaTestBackend.model.SearchDetail;
import com.aisha.javaTestBackend.model.Statement;
@Repository
public interface SearchDetailRepository  {
	
	
	public List<Statement> getSatementsOfTheGivenSearchCriteria (SearchDetail searchCriteria); 
	
//	}
	
	

}
