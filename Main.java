class A1{
    int a,b;
    A1(){
        a=1; b=2;
    }
   void Sum(){
    System.out.println(a+b);
   }
}

class B1 extends A1{
    B1(){
        a=1; b=2;
    }
    void Sum(){
        System.out.println(a+b);
    }

    void Prod(){
        System.out.println(a*b);
    }
}

class C1 extends A1{
    C1(){
        a=1;b=2;
    }
    void Sum(){
        System.out.println(a+b);
    }

    void Div(){
        System.out.println(a/b);
    }
}

public class Main{
    public static void main(String[] args) {
        A1 obj = new A1();
        obj.Sum();
    }
}