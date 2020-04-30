package edu.miu.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.time.LocalDate;


public class Student {

	@NotNull
	private Integer id;

	@NotEmpty
	@Size(min = 4, max = 50, message = "{Size.name.validation}")
 	private String firstName = null;

	@NotEmpty
	@Size(min = 4, max = 50, message = "{Size.name.validation}")
 	private  String lastName  = null;

	@NotEmpty @Email
 	private String email = null;

	@NotBlank
 	private String gender = null;

	@NotNull
	@Past
	@DateTimeFormat(pattern = "MM/dd/yyyy")
    private LocalDate birthday;

	@NotNull
	private Phone phone;

  	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
}
