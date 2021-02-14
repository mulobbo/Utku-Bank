package net.utku.bank.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.utku.bank.db.model.Employee;

@Getter
@Setter
@ToString
public class EmployeeDto extends Employee {
private String confirmPassword;
}
