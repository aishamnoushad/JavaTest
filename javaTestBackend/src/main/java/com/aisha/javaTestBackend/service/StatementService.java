package com.aisha.javaTestBackend.service;

import java.time.LocalDate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aisha.javaTestBackend.model.SearchDetail;
import com.aisha.javaTestBackend.model.Statement;
import com.aisha.javaTestBackend.repository.SearchDetailRepository;
import com.aisha.javaTestBackend.repository.StatementRepository;
@Service
public class StatementService implements SearchDetailRepository{
	@Autowired
	private StatementRepository StatementRepository;
	private List<Statement> filteredstatementList;
	
	@Override
	public List<Statement> getSatementsOfTheGivenSearchCriteria(SearchDetail searchCriteria) {
			List<Statement> statementList = null;
			List<Statement> statementListFilterBasedOnDate = null;
			List<Statement> statementListFilterBasedOnAmount = null;
			Set<Statement> statementSet =null;
			List<Statement> filteredstatementList =null;
			

//		         
//		        System.out.println(combinedList);
//			List<Statement> filteredstatementList = new ArrayList<Statement>();
			
			
		try {
//			if(searchCriteria.getAccount_id()!=0 &&searchCriteria.getFromDate()!=null &&
//					searchCriteria.getToDate()!=null && searchCriteria.getFromAmount()!=0 && searchCriteria.getToAmount()!=0 ) {
//			   LocalDate FromdateTosearch=localDateConverter.convertToEntityAttribute(searchCriteria.getStrFromDate());
//			   LocalDate Todate =localDateConverter.convertToEntityAttribute(searchCriteria.getStrToDate());
			if(searchCriteria.getAccount_id()!=0 ) {
				statementList = StatementRepository.findAllByAccountIid(searchCriteria.getAccount_id());
				if(searchCriteria.getStrFromDate()!="" && searchCriteria.getStrToDate()!="") {
					if(searchCriteria.getFromAmount()!=0 && searchCriteria.getToAmount()!=0 ) {
						statementListFilterBasedOnDate = getStatementwithdateFiltering(searchCriteria,statementList);
						statementListFilterBasedOnAmount = getStatementwithamountFiltering(searchCriteria,statementListFilterBasedOnDate);
						statementSet = new HashSet<Statement>(statementListFilterBasedOnDate);
						statementSet.addAll(statementListFilterBasedOnAmount);
						filteredstatementList = new ArrayList<>(statementSet);
					}else{
						statementListFilterBasedOnDate = getStatementwithdateFiltering(searchCriteria,statementList);
						statementSet = new HashSet<Statement>(statementListFilterBasedOnDate);
						filteredstatementList = new ArrayList<>(statementSet);
					}
					
					
					
				}else if(searchCriteria.getFromAmount()!=0 && searchCriteria.getToAmount()!=0 ) {
					statementListFilterBasedOnAmount = getStatementwithamountFiltering(searchCriteria,statementList);
					statementSet = new HashSet<Statement>(statementListFilterBasedOnAmount);
					filteredstatementList = new ArrayList<>(statementSet);
				}else {
					LocalDate toDate = LocalDate.now();
					LocalDate start = toDate.minusMonths(3);
					
					System.out.println("date empty,and amount zero case fromdate"+start);
					System.out.println("date empty,and amount zero case todate"+toDate);
					statementListFilterBasedOnDate=getStatementwithdateFilteringDefault(start,toDate,statementList);
					statementSet = new HashSet<Statement>(statementListFilterBasedOnDate);
					filteredstatementList = new ArrayList<>(statementSet);
				}
			}
			
				
			
		}catch(Exception E){
			throw E;
			
		}
		return filteredstatementList;
	}
	
	public List<Statement> getStatementwithdateFiltering (SearchDetail searchCriteria,List<Statement> statementList ){
		
		List<Statement> filteredstatementList = new ArrayList<Statement>();
		
		
	try {
//		
			LocalDate FromdateTosearch = LocalDate.parse(searchCriteria.getStrFromDate());
			LocalDate Todate = LocalDate.parse(searchCriteria.getStrToDate());
			System.out.println(searchCriteria.getStrFromDate());
			System.out.println(searchCriteria.getStrToDate());
			System.out.println(FromdateTosearch);
			System.out.println(Todate);
			
			for (Statement statement : statementList) {
				if((statement.getDatefield().compareTo(Todate) < 0 ) && (statement.getDatefield().compareTo( FromdateTosearch ) > 0)) {
					
					System.out.println("db Date"+statement.getDatefield());
					System.out.println("json date"+Todate);
					System.out.println("compare value "+statement.getDatefield()+"is"+Todate+"a="+(statement.getDatefield().compareTo(Todate)));
					filteredstatementList.add(statement);
				}
			}
//			statementList.forEach(statement -> {
//				if((statement.getDatefield().compareTo(Todate)< 0 )) {
//					filteredstatementList.add(statement);
//				}else if(statement.getDatefield().compareTo( FromdateTosearch ) > 0) {
//					filteredstatementList.add(statement);
//				} 
//				
//			});
//			
			
//		}
		
		
		}catch(Exception E){
			throw E;
		}
		return filteredstatementList;
	}
	
public List<Statement> getStatementwithdateFilteringDefault (LocalDate fromdate,LocalDate toDate,List<Statement> statementList ){
		
		List<Statement> filteredstatementList = new ArrayList<Statement>();
		
		
	try {
//		
			
			
			System.out.println(fromdate);
			System.out.println(toDate);
			
			for (Statement statement : statementList) {
				if((statement.getDatefield().compareTo(toDate) < 0 ) && (statement.getDatefield().compareTo( fromdate ) > 0)) {
					
					System.out.println("db Date"+statement.getDatefield());
					System.out.println("json date"+toDate);
					System.out.println("compare value "+statement.getDatefield()+"is"+toDate+"a="+(statement.getDatefield().compareTo(toDate)));
					filteredstatementList.add(statement);
				}
			}
//			statementList.forEach(statement -> {
//				if((statement.getDatefield().compareTo(Todate)< 0 )) {
//					filteredstatementList.add(statement);
//				}else if(statement.getDatefield().compareTo( FromdateTosearch ) > 0) {
//					filteredstatementList.add(statement);
//				} 
//				
//			});
//			
			
//		}
		
		
		}catch(Exception E){
			throw E;
		}
		return filteredstatementList;
	}
	
	
	public List<Statement> getStatementwithamountFiltering (SearchDetail searchCriteria,List<Statement> statementList){
		
		List<Statement> filteredstatementList = new ArrayList<Statement>();
		
		
	try {
		for (Statement statement : statementList) {
		if(statement.getAmount() >= searchCriteria.getFromAmount() && statement.getAmount() <= searchCriteria.getToAmount()) {
			
			System.out.println("db Date"+statement.getAmount());
			System.out.println("json date"+searchCriteria.getFromAmount());
			System.out.println("compare value "+statement.getAmount()+"is"+searchCriteria.getFromAmount()+"a="+(statement.getAmount()-searchCriteria.getFromAmount()));
			filteredstatementList.add(statement);
		}
	}
		
		
		}catch(Exception E){
			throw E;
		}
		return filteredstatementList;
	}
	
	
	
	

}
