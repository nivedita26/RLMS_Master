package com.rlms.model;

// Generated 2 Aug, 2014 1:44:14 PM by Hibernate Tools 4.0.0

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * CbUsersMaster generated by hbm2java
 */
@Entity
@Table(name = "rlms_users_master")
public class RlmsUsersMaster implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer userId;
	private Integer enabled;
	private RlmsCompanyMaster rlmsCompanyMaster;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String address;
	private String contactNumber;
	private String emailId;
	private String city;
	private String area;
	private Integer pincode;
	private Integer activeFlag;
	private Date createdDate;
	private Integer createdBy;
	private Date updatedDate;
	private Integer updatedBy;

	public RlmsUsersMaster() {
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "user_id", unique = true, nullable = false)
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	

	

	@Column(name = "enabled", unique = true, nullable = false)
	public Integer getEnabled() {
		return enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "company_id")
	public RlmsCompanyMaster getRlmsCompanyMaster() {
		return rlmsCompanyMaster;
	}

	public void setRlmsCompanyMaster(RlmsCompanyMaster rlmsCompanyMaster) {
		this.rlmsCompanyMaster = rlmsCompanyMaster;
	}

	@Column(name = "first_name", unique = true, nullable = false)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "last_name", unique = true, nullable = false)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "address", unique = true, nullable = true)
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "contact_number", unique = true, nullable = false)
	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Column(name = "email_id", unique = true, nullable = false)
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Column(name = "active_flag", unique = true, nullable = false)
	public Integer getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(Integer activeFlag) {
		this.activeFlag = activeFlag;
	}

	@Column(name = "username", unique = true, nullable = true)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password", unique = true, nullable = true)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "created_date", unique = true, nullable = false)
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "created_by", unique = true, nullable = false)
	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	@Column(name = "updated_date", unique = true, nullable = false)
	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Column(name = "updated_by", unique = true, nullable = false)
	public Integer getUpdatedBy() {
		return updatedBy;
	}
	
	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Column(name = "city", unique = true, nullable = true)
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "area", unique = true, nullable = true)
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Column(name = "pincode", unique = true, nullable = true)
	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	

	
	
	
}
