package com.vishu.lab8;

import com.vishu.lab8.Employee;


public class Employee {

  private String name;
  private int age;
  private String city;
  
  public Employee(String n,int a,String c)
  {
    name = n;
    age = a;
    city = c;
  }
  
  public void display()
  {
    System.out.println("The name is "+name);
    System.out.println("The age is "+age);
    System.out.println("The name is "+city);
  }
  
  

}
