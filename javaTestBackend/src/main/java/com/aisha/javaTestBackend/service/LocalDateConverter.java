package com.aisha.javaTestBackend.service;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.sun.el.parser.ParseException;

@Converter(autoApply = true)
public class LocalDateConverter implements AttributeConverter<LocalDate, String> {

    @Override
    public String convertToDatabaseColumn(LocalDate date) {    
    	String formattedDate = date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    	return formattedDate;
    }

    @Override
    public LocalDate convertToEntityAttribute(String value) {
//    	SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
//        String dateInString = "7-Jun-2013";
       LocalDate date= null;
        //            date = (Date) formatter.parse(value);
		            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		        	date = LocalDate.parse(value, formatter);
		            System.out.println(date);
		            System.out.println(formatter.format(date));
    	
////    	java.sql.Date sqlDate = java.sql.Date.valueOf(date);
        return date;
    }
}
