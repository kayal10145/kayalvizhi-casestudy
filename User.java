package org.hcl.entities; 


 import java.util.HashSet; 
 import java.util.Set; 
 

import javax.persistence.CascadeType; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
 import javax.persistence.Id; 
 import javax.persistence.JoinColumn; 
 import javax.persistence.JoinTable; 
 import javax.persistence.ManyToMany; 
 @Entity 
 public class User { 
 	@Id 
 	@GeneratedValue(strategy = GenerationType.IDENTITY) 
 	private int Userid; 
 	private String FirstName; 
 	private String LastName;  
 	private String bloodGroup; 
 	private String city;
 	@ManyToMany(cascade = CascadeType.ALL) 
 	@JoinTable(name = "user_blood",joinColumns = {@JoinColumn(name="user_id")}, 
 	inverseJoinColumns = {@JoinColumn(name="bid")}) 
 	private Set<BloodGroup> bloodGroups=new HashSet<>(); 
 	public User() { 
 		// TODO Auto-generated constructor stub 
 	} 
 	
 	public int getUserid() {
		return Userid;
	}

	public void setUserid(int userid) {
		Userid = userid;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Set<BloodGroup> getBloodGroups() {
		return bloodGroups;
	}

	public void setBloodGroups(Set<BloodGroup> bloodGroups) {
		this.bloodGroups = bloodGroups;
	}

	public void add(BloodGroup bg) 
 	{ 
	bloodGroups.add(bg); 
 	}

	public void add(User user) {
		// TODO Auto-generated method stub
		
	}

	public void setPassword(String pwd) {
		// TODO Auto-generated method stub
		
	} 
 } 
