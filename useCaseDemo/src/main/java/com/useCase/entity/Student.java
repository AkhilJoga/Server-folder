package com.useCase.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Table(name ="STUDENT")
public class Student {
	
	@Id
	@Column
	Integer  id;
	@Column
	String sname;
	@Column
	Integer m_mks;
	@Column
	Integer p_mks;
	@Column
	Integer c_mks;
	@Column
	Integer tot;
	@Column
	String faculty;
	public Integer getId() {
		return id;
	}
	public String getSname() {
		return sname;
	}
	public Integer getM_mks() {
		return m_mks;
	}
	public Integer getP_mks() {
		return p_mks;
	}
	public Integer getC_mks() {
		return c_mks;
	}
	public Integer getTot() {
		return tot;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setM_mks(Integer m_mks) {
		this.m_mks = m_mks;
	}
	public void setP_mks(Integer p_mks) {
		this.p_mks = p_mks;
	}
	public void setC_mks(Integer c_mks) {
		this.c_mks = c_mks;
	}
	public void setTot(Integer tot) {
		this.tot = tot;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public Student(Integer id, String sname, Integer m_mks, Integer p_mks, Integer c_mks, Integer tot, String faculty) {
		super();
		this.id = id;
		this.sname = sname;
		this.m_mks = m_mks;
		this.p_mks = p_mks;
		this.c_mks = c_mks;
		this.tot = tot;
		this.faculty = faculty;
	}
	
	
	
}
