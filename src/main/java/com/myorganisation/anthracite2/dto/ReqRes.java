package com.myorganisation.anthracite2.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.myorganisation.anthracite2.domain.Gender;
import com.myorganisation.anthracite2.domain.Role;
import com.myorganisation.anthracite2.entity.Employee;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReqRes {

    private Integer statusCode;
    private String error;
    private String message;
    private String token;
    private String refreshToken;
    private String expirationTime;
    private String name;
    private String address;
    private Role role;
    private String email;
    private String password;
    private Gender gender;
    private Date dob;
    private Date doj;
    private Long salary;
    private Employee employee;
    private List<Employee> employeeList;
}
