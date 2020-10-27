 package org.hcl.controller;  
 import java.util.HashSet; 
 import java.util.Set; 
  
  
  import org.hcl.entities.BloodGroup; 
  import org.hcl.entities.User; 
  import org.hcl.services.UserService; 
 import org.springframework.beans.factory.annotation.Autowired; 
  import org.springframework.stereotype.Controller; 
  import org.springframework.ui.Model; 
  import org.springframework.web.bind.annotation.GetMapping; 
  import org.springframework.web.bind.annotation.PostMapping; 
  import org.springframework.web.bind.annotation.RequestParam; 

  
  @Controller 
  public class BloodBankController { 
  	@Autowired 
  	private UserService service; 
  	@GetMapping("/") 
  	public String showHome() { 
  		return "home"; 
  	} 

  
  	@PostMapping("/req") 
  	public String showForm(@RequestParam("reqType") String reqType, Model model) { 
  		if (reqType.equals("donor")) 
  		{ 
  			System.out.println(reqType); 
  			model.addAttribute("donor", reqType); 
  		} 
  		if (reqType.equals("requestor")) 
  			model.addAttribute("requestor", reqType); 
  		return"registration"; 
  	} 
  	@PostMapping("/process") 
  	public String processForm(@RequestParam("FirstName") String FirstName, @RequestParam("LastName") String LastName, 
  			@RequestParam("city") String city, @RequestParam("bg") String bloodGroup,Model model) { 
  		User user=new User(); 
  		user.setFirstName(FirstName); 
  		user.setLastName(LastName); 
  		user.setBloodGroup(bloodGroup); 
 		user.setCity(city); 
 		BloodGroup bg=new BloodGroup(); 
 		setBloodGroup(user.getBloodGroup()); 
  		user.add(bg); 
  		bg.add(user); 
  		Set<User> users=new HashSet<>(); 
  		Set<BloodGroup> bloodGroups=new HashSet<>(); 
  		users.add(user); 
  		bloodGroups.add(bg); 
  		user.setBloodGroups(bloodGroups); 
  		bg.setUsers(users); 
  		 
  		model.addAttribute("generatedId",user.getFirstName()+user.getLastName()+user.getBloodGroup()); 
  		service.insertUser(user); 
  		return "registration"; 
  	}


 	private void setBloodGroup(String bloodGroup) {
 		// TODO Auto-generated method stub
 		
 	} 
  } 