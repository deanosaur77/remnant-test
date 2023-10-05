package com.remnant.lms.db.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "application")
public class Application implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "client_id", nullable = false)
	private Client client;

	@Column
	private LocalDateTime dateTime;

	@Column
	private long term;

	@Column
	private String applicationType;

	@Column
	private double creditLimit;

	@Column(nullable = true)
	private double btcPrice;

	@Column(nullable = true)
	private double btcCollateral;

	@OneToOne
	@JoinColumn(name = "account_id")
	private Account account;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public LocalDateTime getApplicationDateTime() {
		return dateTime;
	}

	public void setApplicationDateTime(LocalDateTime applicationDateTime) {
		this.dateTime = applicationDateTime;
	}

	public long getApplicationTerm() {
		return term;
	}

	public void setApplicationTerm(long applicationTerm) {
		this.term = applicationTerm;
	}

	public double getApplicationCreditLimit() {
		return creditLimit;
	}

	public void setApplicationCreditLimit(double applicationCreditLimit) {
		this.creditLimit = applicationCreditLimit;
	}

	public double getBtcPriceAtApplication() {
		return btcPrice;
	}

	public void setBtcPriceAtApplication(double btcPriceAtApplication) {
		this.btcPrice = btcPriceAtApplication;
	}

	public double getBtcCollateralAtApplication() {
		return btcCollateral;
	}

	public void setBtcCollateralAtApplication(double btcCollateralAtApplication) {
		this.btcCollateral = btcCollateralAtApplication;
	}

	public String getApplicationType() {
		return applicationType;
	}

	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
