
package org.hcl.entities; 

 
 import java.util.HashSet; 
 import java.util.Set; 

 
 import javax.persistence.Entity; 
 import javax.persistence.GeneratedValue; 
 import javax.persistence.GenerationType; 
 import javax.persistence.Id; 
 import javax.persistence.ManyToMany; 
 
 @Entity 
 public class BloodGroup { 
 	@Id 
 	@GeneratedValue(strategy = GenerationType.IDENTITY) 
 	private String PatientName; 
 	private String BloodGroup; 
 	@ManyToMany(mappedBy = "bloodGroups") 
 	private Set<User> users=new HashSet<>(); 
 	private String City;
    private String doctorName;
    private String HospitalName;
    private String HospitalAddress;
    private String ContactName;
    private String ContactNumber;
    private String ContactEmailId;
    
 	public  BloodGroup() { 
 		 
 	} 
 	
 	
 	public String getPatientName() {
		return PatientName;
	}


	public void setPatientName(String patientName) {
		PatientName = patientName;
	}


	public String getBloodGroup() {
		return BloodGroup;
	}


	public void setBloodGroup(String bloodGroup) {
		BloodGroup = bloodGroup;
	}


	public String getCity() {
		return City;
	}


	public void setCity(String city) {
		City = city;
	}


	public String getDoctorName() {
		return doctorName;
	}


	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}


	public String getHospitalName() {
		return HospitalName;
	}


	public void setHospitalName(String hospitalName) {
		HospitalName = hospitalName;
	}


	public String getHospitalAddress() {
		return HospitalAddress;
	}


	public void setHospitalAddress(String hospitalAddress) {
		HospitalAddress = hospitalAddress;
	}


	public String getContactName() {
		return ContactName;
	}


	public void setContactName(String contactName) {
		ContactName = contactName;
	}


	public String getContactNumber() {
		return ContactNumber;
	}


	public void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}


	public String getContactEmailId() {
		return ContactEmailId;
	}


	public void setContactEmailId(String contactEmailId) {
		ContactEmailId = contactEmailId;
	}


	public Set<User> getUsers() { 
 		return users; 
 	} 
 	public void setUsers(Set<User> user) { 
 		this.users = user; 
 	} 
 	public void add(User user) 
 	{ 
 		user.add(user); 
 		} 
 } 
