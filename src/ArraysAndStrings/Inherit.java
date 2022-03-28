package ArraysAndStrings;

public class Inherit {

    public static void main(String[] args) {

        Parent p = new Child();
        p.run();


    }


}

class Parent{

    void run(){
        System.out.println("Parent Run ");
        walk();
    }

    void walk(){
        System.out.println("Parent walk ");
    }
}

class Child extends Parent{

    @Override
    void run(){
        System.out.println("Child Run ");
        super.run();
    }
    @Override
    void walk(){
        System.out.println("Child walk ");
        super.walk();
    }
}
