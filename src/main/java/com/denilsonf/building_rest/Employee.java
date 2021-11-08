package com.denilsonf.building_rest;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
    
    private @Id @GeneratedValue Long id;
    private String name;
    private String role;

    Employee(){

    }

    Employee(String name, String role){
        this.name = name;
        this.role = role;
    }

    public Long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getRole(){
        return this.role;
    }

    public void setId(Long newId){
        this.id = newId;
    }
    
    public void setName(String newName){
        this.name = newName;
    }

    public void setRole(String newRole){
        this.role = newRole;
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(!(o instanceof Employee)){
            return false;
        }
        Employee employee = (Employee) o;
        return Objects.equals(this.id, employee.id) && 
    Objects.equals(this.name, employee.name)
            && Objects.equals(this.role, employee.role);
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.id, this.name, this.role);
    }

    @Override
    public String toString(){
        return "Employee{" + "id=" + this.id + ", name='" + this.name + 
        '\'' + ", role='" + this.role + '\'' + '}';
    }
}