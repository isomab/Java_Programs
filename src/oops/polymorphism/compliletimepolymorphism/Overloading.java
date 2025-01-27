package oops.polymorphism.compliletimepolymorphism;

public class Overloading {
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }

    int add(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Overloading overloading=new Overloading();
        System.out.println(overloading.add(3,6));
        System.out.println(overloading.add(4d,6d));
        System.out.println(overloading.add(9,4,1));
    }
}

//Compile-time polymorphism occurs when multiple methods in the same class share the same name but differ in their method signatures (i.e., parameter count or types).
// The method call is resolved at compile time based on the method signature.