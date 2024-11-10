package in.sp.main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.sp.main.model.User;

@Controller
public class MyController
{
	@GetMapping("/accessVariable1")
	public String accessVariableOne(Model model)
	{
		String name = "Deepak Panwar";
		
		model.addAttribute("modelName", name);
		
		return "access-variable-one";
	}
	
	@GetMapping("/accessVariable2")
	public String accessVariableTwo(Model model)
	{
		String name = "Amit Chaudhary";
		String email = "amit@gmail.com";
		String city = "Delhi";
		
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setCity(city);
		
		model.addAttribute("model_user", user);
		
		return "access-variable-two";
	}
}
