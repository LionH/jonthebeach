package com.oracle.tesolin.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="User")
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3679909999869704383L;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
	
	@Column(nullable = false)
	private String firstname;
	@Column(nullable = false)
	private String lastname;
	@Column(nullable = false)
	private String role;
	@Column(nullable = true)
	private String company;
	@Column(nullable = true)
	private String email;
	@Column(nullable = false)
	private Boolean contact;
	@Column(nullable = false)
	private String language;
	@Column(nullable = true)
	private String topic;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Boolean getContact() {
		return contact;
	}
	public void setContact(Boolean contact) {
		this.contact = contact;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	
}
