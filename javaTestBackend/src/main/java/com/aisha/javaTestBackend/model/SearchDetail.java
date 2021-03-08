package com.aisha.javaTestBackend.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

//@Entity
//@Access(value=AccessType.PROPERTY)
public class SearchDetail {
		@Id
		@Column(name="account_id")
		private int account_id;
		private LocalDate FromDate;
		private LocalDate ToDate;
		private double fromAmount;
		private double toAmount;
		private String strFromDate;
		private String strToDate;
//		@OneToMany
//		@JoinColumn(name = "account_id", re)
//		private List<Statement> statementList;
		public SearchDetail() {
			
		}
		
		public SearchDetail(int account_id, LocalDate fromDate, LocalDate toDate, double fromAmount, double toAmount) {
			super();
			this.account_id = account_id;
			FromDate = fromDate;
			ToDate = toDate;
			this.fromAmount = fromAmount;
			this.toAmount = toAmount;
		}
		public int getAccount_id() {
			return account_id;
		}
		public void setAccount_id(int account_id) {
			this.account_id = account_id;
		}
		public LocalDate getFromDate() {
			return FromDate;
		}
		public void setFromDate(LocalDate fromDate) {
			FromDate = fromDate;
		}
		public LocalDate getToDate() {
			return ToDate;
		}
		public void setToDate(LocalDate toDate) {
			ToDate = toDate;
		}
		public double getFromAmount() {
			return fromAmount;
		}
		public void setFromAmount(double fromAmount) {
			this.fromAmount = fromAmount;
		}
		public double getToAmount() {
			return toAmount;
		}
		public void setToAmount(double toAmount) {
			this.toAmount = toAmount;
		}

		public String getStrFromDate() {
			return strFromDate;
		}

		public void setStrFromDate(String strFromDate) {
			this.strFromDate = strFromDate;
		}

		public String getStrToDate() {
			return strToDate;
		}

		public void setStrToDate(String strToDate) {
			this.strToDate = strToDate;
		}
		
		
}
