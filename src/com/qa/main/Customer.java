package com.qa.main;

public class Customer {
	
	String name;  //declared
	int birthDay;
    String birthMonth;
    int birthYear;
    String email; 

    // public Customer() {}
    

    public String getName() {
    	return name;
    }
    public void setName(String newName) {
    	this.name = newName;
    }
    public int getBirthday() {
    	 return birthDay;
    	 
    }
   public void setBirthday(int newBirthday) {
	   this.birthDay = newBirthday;
   }

   public String getbirthMonth() {
	   return birthMonth;
  
   } public void setbirthMonth(String newbirthMonth) {
	   this.birthMonth = newbirthMonth;
	   
   }

}


