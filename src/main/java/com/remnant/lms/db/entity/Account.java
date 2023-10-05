package com.remnant.lms.db.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = true)
	private String accountNumber;

	@Column(nullable = false)
	private String accountName;

	@Column(nullable = true)
	private Double balance;

	@Column(nullable = true)
	private Double initialAmount;

	@OneToOne(mappedBy = "account", cascade = CascadeType.ALL)
    private Schedule schedule;
	
	@OneToOne(mappedBy = "account", cascade = CascadeType.ALL)
    private Application application;
	
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client; // Reference to the Client owning the account

	@Column
	@OneToMany(mappedBy = "account")
	private List<Transaction> transaction = new ArrayList<>();
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getInitialAmount() {
		return initialAmount;
	}

	public void setInitialAmount(Double initialAmount) {
		this.initialAmount = initialAmount;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", accountNumber=" + accountNumber + ", accountName=" + accountName + ", balance="
				+ balance + ", initialAmount=" + initialAmount + ", schedule=" + schedule + ", application="
				+ application + ", client=" + client + ", transaction=" + transaction + "]";
	}
	
}
