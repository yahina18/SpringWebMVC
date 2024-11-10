package in.sp.main.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController 
{
	@GetMapping("/ifdemo")
	public String ifDemo(Model model)
	{
		boolean isAdmin = true;
		
		model.addAttribute("modelIsAdmin", isAdmin);
		
		return "profile";
	}
	
	@GetMapping("/unlessdemo")
	public String unlessDemo(Model model)
	{
		boolean isAdmin = true;
		
		model.addAttribute("modelIsAdmin", isAdmin);
		
		return "unless-page";
	}
	
	@GetMapping("/switchcasedemo")
	public String switchCaseDemo(Model model)
	{
		String day = "Monday";
		
		model.addAttribute("modelDay", day);
		
		return "switch-page";
	}
	
	@GetMapping("/eachdemo")
	public String eachDemo(Model model)
	{
		List<String> list = new ArrayList<>();
		list.add("Deepak");
		list.add("Amit");
		list.add("Rahul");
		list.add("Kamal");
		
		model.addAttribute("modelNamesList", list);
		
		return "each-page";
	}
}
