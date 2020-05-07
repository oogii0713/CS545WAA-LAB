package edu.miu.lab10.domain;

import java.io.Serializable;
import java.time.LocalDate;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

@Entity
public class Employee implements Serializable {
    private static final long serialVersionUID = -908L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    @Size(min = 4, max = 50, message = "{Size.name.validation}")
    private String firstName;

    @NotEmpty(message = "Enter the last name")
    private String lastName;

    @Range(min = 1, message = "Employee Number must be greater than 0.")
    private int employeeNumber;

    @NotNull
    @DateTimeFormat(pattern = "MM-dd-yyyy")
    @Past
    private LocalDate birthDate;

    @NotNull
    private Integer salaryLevel;

    @Valid
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false)
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public Integer getSalaryLevel() {
        return salaryLevel;
    }

    public void setSalaryLevel(Integer salaryLevel) {
        this.salaryLevel = salaryLevel;
    }

}
