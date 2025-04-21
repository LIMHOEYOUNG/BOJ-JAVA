class A{
    static int aA= 10;
    static void meA(){

        System.out.println("A랑께");
    }
    static void calc(){
        System.out.println(aA);
    }
}

class B extends A{
    static void meA(){
        System.out.println("B랑께");
    }
    static void calc(){

    }
}

public class Tt{
    public static void main(String[] args) {
        A a= new B();

        a.meA();
        System.out.println(a.aA);

        ((B)a).meA();

    }
}