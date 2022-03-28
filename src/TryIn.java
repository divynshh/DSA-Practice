
class Animal{

    int root;

    void voice(){
        System.out.println("Animal Sound");
    }

}


class Dog extends  Animal{

    void voice(){
        System.out.println("Barks");
    }


}


class pup extends  Dog{

    void voice(){
        System.out.println("cute Barks");
    }


}

class Cat extends  Animal{

    void voice(){
        System.out.println("Meows");
    }


}

public class TryIn {

    public static void main(String[] args){

       Animal n = new Dog();
       Animal n2 = new pup();
       Animal n3 = new Animal();
       Animal n4 = new Cat();
       Dog n5 = new pup();




       n.voice();
       n2.voice();
       n3.voice();
       n4.voice();
       n5.voice();



    }
}



//

