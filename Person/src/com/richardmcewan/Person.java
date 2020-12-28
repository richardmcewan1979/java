package com.richardmcewan;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if(age < 0 || age > 100) {
            this.age = 0;
        }
        else {
            this.age = age;
        }
    }

    public boolean isTeen(){
        return age > 12 && age < 20;
    }

    public String getFullName(){
        if(lastName.isEmpty()){
            return firstName;
        }
        else if(firstName.isEmpty()){
            return lastName;
        }
        return firstName+" "+lastName;
    }

    //end curly
}


/*

*Method named getFullName without any parameters, it needs to return the full name of the person.
    *In case both firstName and lastName fields are empty, Strings return an empty String.
    *In case lastName is an empty String, return firstName.
    *In case firstName is an empty String, return lastName.

To check if s String is empty, use the method isEmpty from the String class.
For example, firstName.isEmpty() returns true if the String is empty or in other words,
when the String does not contain any characters.


TEST EXAMPLE

TEST CODE:

Person person = new Person();
person.setFirstName("");   // firstName is set to empty string
person.setLastName("");    // lastName is set to empty string
person.setAge(10);
System.out.println("fullName= " + person.getFullName());
System.out.println("teen= " + person.isTeen());
person.setFirstName("John");    // firstName is set to John
person.setAge(18);
System.out.println("fullName= " + person.getFullName());
System.out.println("teen= " + person.isTeen());
person.setLastName("Smith");    // lastName is set to Smith
System.out.println("fullName= " + person.getFullName());

OUTPUT

fullName=
teen= false
fullName= John
teen= true
fullName= John Smith


NOTE: All methods should be defined as public NOT public static.

NOTE: In total, you have to write 8 methods.

NOTE: Do not add the main method to the solution code.
 */