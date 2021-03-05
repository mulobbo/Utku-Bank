package net.utku.bank.backoffice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;

import net.utku.bank.db.dao.EmployeeDao;
import net.utku.bank.db.model.Employee;
import net.utku.bank.db.model.enumaration.EmployeeRoleType;

@Controller
public abstract class AbstractController {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	public boolean canModifyData() {
		return hasRole(EmployeeRoleType.ADMIN);
	}
	

	public boolean hasRole(EmployeeRoleType role) {
		return SecurityContextHolder.getContext().getAuthentication().getAuthorities().stream()
				.anyMatch(grantedAuthority -> grantedAuthority.getAuthority().equals(role.name()));
	}
	
	public boolean isLogginUser(Long id) {
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		Employee employee = employeeDao.findByEmail(user.getUsername());
		
		return id == employee.getId(); 
		
	}
}
