package whiz.quiz_6_Methods_and_Encapsulation;
class Animal{
    Animal(){
        super();
    }
}

class Bird extends Animal{
    public Bird(String name){   //would not compile if Private
        System.out.print(name);
    }
    Bird(){
        System.out.print("unknown");
    }
}

class Whiz{
    public static void main(String args[]){
        new Bird("parrot");
    }
}