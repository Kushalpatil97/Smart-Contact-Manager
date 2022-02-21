package com.smartcntmgr.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Contacts")
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Cid;
	private String name;
	private String secondname;
	private String work;
	@Column(unique = true)
	private String email;
	private String phone;
	private String image;
	@Column(length =1000)
	private String description;
	
	@ManyToOne
	public User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Long getCid() {
		return Cid;
	}
	public void setCid(Long cid) {
		Cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSecondname() {
		return secondname;
	}
	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Contact(Long cid, String name, String secondname, String work, String email, String phone, String image,
			String description) {
		super();
		Cid = cid;
		this.name = name;
		this.secondname = secondname;
		this.work = work;
		this.email = email;
		this.phone = phone;
		this.image = image;
		this.description = description;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
