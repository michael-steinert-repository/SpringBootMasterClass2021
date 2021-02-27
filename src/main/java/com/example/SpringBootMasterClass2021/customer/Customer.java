package com.example.SpringBootMasterClass2021.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
@Table
public class Customer {
    @Id
    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    @NotBlank
    @Email
    private String email;

    @JsonProperty("customerId")
    public Long getId() {
        return id;
    }

    @JsonIgnore
    public String getPassword() {
        return password;
    }
}
