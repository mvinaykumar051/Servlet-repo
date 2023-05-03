package dto;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
     
      
@Entity
public class Student {	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
int id;
String name;
long mobile;
String email;
String gender;
Date dob;
String address;
String[] languages;
String state;
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public long getMobile() {
return mobile;
}
public void setMobile(long mobile) {
this.mobile = mobile;
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
public Date getDob() {
return dob;
}
public void setDob(Date dob) {
this.dob = dob;
}
public String getAddress() {
return address;
}
public void setAddress(String address) {
this.address = address;
}
public String[] getLanguages() {
return languages;
}
public void setLanguages(String[] languages) {
this.languages = languages;
}
public String getState() {
return state;
}
public void setState(String state) {
this.state = state;
}
}
