package com.example.cyberSecurity.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "EmpSchedule")
public class Schedule implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@NonNull
	@Column(name = "startDate")
	@Temporal(TemporalType.DATE)
	private Date startDate;
	@NonNull
	@Column(name = "endDate")
	@Temporal(TemporalType.DATE)
	private Date endDate;
	@NonNull
	@Column(name = "time")
	@Temporal(TemporalType.TIME)
	@JsonFormat(pattern = "HH:mm:ss")
	private Date time;

	@NonNull
	@Column(name = "duration")
	private Integer duration;
	@NonNull
	@Column(name = "repeatflag")
	private Boolean repeat;

	@Enumerated
	@Column(name = "frequency")
	private FrequencyType frequency;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="employeeid")
	@JsonIgnore
	private Employee empSchedule;

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Boolean getRepeat() {
		return repeat;
	}

	public void setRepeat(Boolean repeat) {
		this.repeat = repeat;
	}

	public FrequencyType getFrequency() {
		return frequency;
	}

	public void setFrequency(FrequencyType frequency) {
		this.frequency = frequency;
	}

	public Employee getEmpSchedule() {
		return empSchedule;
	}

	public void setEmpSchedule(Employee empSchedule) {
		this.empSchedule = empSchedule;
	}

	public Schedule(Date startDate, Date endDate, Date time, Integer duration, Boolean repeat, FrequencyType frequency,
			Employee empSchedule) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.time = time;
		this.duration = duration;
		this.repeat = repeat;
		this.frequency = frequency;
		this.empSchedule = empSchedule;
	}

	@Override
	public String toString() {
		return "Schedule [startDate=" + startDate + ", endDate=" + endDate + ", time=" + time + ", duration=" + duration
				+ ", repeat=" + repeat + ", frequency=" + frequency + ", empSchedule=" + empSchedule + "]";
	}

	public Schedule() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}}
