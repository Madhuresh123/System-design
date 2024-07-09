package Polymorphimus;

public class CompileTimePolymorphism {

    public void add(int a, int b){
        System.out.println("area = " + a*b);
    }

    public void add(int a, int b, int c){
        System.out.println("area = " + a*b*c);
    }

    public static void main(String[] args){

        CompileTimePolymorphism obj = new CompileTimePolymorphism();
        obj.add(1,2);
        obj.add(2,3,4);

    }

}