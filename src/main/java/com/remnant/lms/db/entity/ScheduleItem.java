package com.remnant.lms.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.remnant.lms.enums.ScheduleStatus;

@Entity
public class ScheduleItem {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = true)
	private Integer month;
    
    @Column(nullable = true)
	private Double repaymentAmount;

    @Column
    @Enumerated(EnumType.STRING)
    private ScheduleStatus status;
    
    @ManyToOne
    @JoinColumn(name = "schedule_id")
    private Schedule schedule;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getMonth() {
		return month;
	}
	public void setMonth(Integer month) {
		this.month = month;
	}
	public Double getRepaymentAmount() {
		return repaymentAmount;
	}
	public void setRepaymentAmount(Double repaymentAmount) {
		this.repaymentAmount = repaymentAmount;
	}

}
