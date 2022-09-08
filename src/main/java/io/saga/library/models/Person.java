package io.saga.library.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Person {
    private int id;
    @NotEmpty(message = "Name can't be empty")
    @Size(min = 2,max = 50)
    private String fullName;
    @Min(value = 1900,message = "Wrong age!")
    private int yearOfBirth;

    public Person(String fullName, int yearOfBirth) {this.fullName = fullName;this.yearOfBirth = yearOfBirth;}
    public Person(){}
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getFullName() {return fullName;}
    public void setFullName(String fullName) {this.fullName = fullName;}
    public int getYearOfBirth() {return yearOfBirth;}
    public void setYearOfBirth(int yearOfBirth) {this.yearOfBirth = yearOfBirth;
    }
}
