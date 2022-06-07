package com.covid.vaccination.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;


@ToString
@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @JsonIgnore
    private Integer user_id;
    private String firstName;
    private String lastName;
    @Column(unique = true,columnDefinition = "integer default 0")
    private String mobile;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    private String password;
    private String gender;
    @Column(unique = true,columnDefinition = "integer default 0")
    private String aadharNo;
    private String pinCode;
    private String city;
}
