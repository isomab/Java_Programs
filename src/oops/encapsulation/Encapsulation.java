package oops.encapsulation;


public class Encapsulation {
    public static void main(String[] args) {
        Details details = new Details();
        details.setName("Vishal");
        details.setAge(-23);
        details.setCollege("NT College");

        System.out.println(details);

    }
}

//Encapsulation is nothing but binding data and methods in single entity.
//Declare variables private and use setter and getter to access those private variables
//Encapsulation helps to get controlled access and validation before setting value of variables.
