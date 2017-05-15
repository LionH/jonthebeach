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
    private String language;
	@Column(nullable = false)
	private String email;
	@Column(nullable = true)
    private String role;
    @Column(nullable = true)
    private String company;
	@Column(nullable = true)
	private Boolean contact;
	@Column(nullable = true, length=4096)
	private String topic;
	
	//Workshop
	@Column(nullable = true, length=4096)
    private String opinionBefore;
    @Column(nullable = true, length=4096)
    private String opinionNow;
    @Column(nullable = true, length=4096)
    private String opinionLike;
    @Column(nullable = true, length=4096)
    private String opinionImprove;
	
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
	public String getOpinionBefore() {
        return opinionBefore;
    }
    public void setOpinionBefore(String opinionBefore) {
        this.opinionBefore = opinionBefore;
    }
    public String getOpinionNow() {
        return opinionNow;
    }
    public void setOpinionNow(String opinionNow) {
        this.opinionNow = opinionNow;
    }
    public String getOpinionLike() {
        return opinionLike;
    }
    public void setOpinionLike(String opinionLike) {
        this.opinionLike = opinionLike;
    }
    public String getOpinionImprove() {
        return opinionImprove;
    }
    public void setOpinionImprove(String opinionImprove) {
        this.opinionImprove = opinionImprove;
    }
	
}
