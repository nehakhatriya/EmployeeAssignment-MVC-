package com.Employee.Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Employee.Entity.Employee;
import com.Employee.Service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@GetMapping
	public String inputEmployee(Model model) {
		List<Employee> employees=service.listEmployees();
		model.addAttribute("employees",employees);
		model.addAttribute("employee",new Employee());
		return "form";
	}
	
	@PostMapping()
	public String saveEmployee(Employee employee){
		service.saveEmployee(employee);
		return "redirect:employee"; 
	}
	
	@RequestMapping("/delete")
	public String deleteEmployee(@RequestParam("empid") int empid,Employee employee) {
		service.deleteEmployee(empid);
		return "redirect:/app/employee"; 
	}	
	
	@GetMapping("/update")
	public String displayUpdateForm(Model model) {
		model.addAttribute("employee",new Employee());
		return "update-form";
	}
	
	@PostMapping("/update")
	public String UpdateEmployee(Employee employee) {
		service.updateEmployee(employee);
		return "redirect:/app/employee";
	}
		
	
}
