package fr.formation.smellyspring.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class SmellyUserInDto {

    @Size(min = 6, max = 255)
    private String username;
    @NotBlank
    @Size(min = 8, max = 12)
    private String password;

    public SmellyUserInDto() {
    }

    public SmellyUserInDto(String username, String password) {
	this.username = username;
	this.password = password;
    }

    public String getUsername() {
	return username;
    }

    public void setUsername(String username) {
	this.username = username;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }
}
