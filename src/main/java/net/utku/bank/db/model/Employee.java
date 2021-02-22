package net.utku.bank.db.model;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.utku.bank.db.model.enumaration.EmployeeRoleType;
import net.utku.bank.db.model.enumaration.EmployeeStatusType;

@Getter
@Setter
@ToString
public class Employee {
	private Long id;

    private String citizenNumber;
    
    @NotEmpty
    @Size(min = 2 , max =32)
    private String firstName;
    
    private String middleName;

    @NotEmpty
    @Size(min = 2 , max =32)
    private String lastName;    
    
    @NotEmpty
    @Size(min = 2 , max =32)
    private String email;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthDate;
    
    private String phoneNumber;

    private String password;
    
    private EmployeeStatusType status;
    
    private EmployeeRoleType role = EmployeeRoleType.USER;


}
