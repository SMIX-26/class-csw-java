class A2{
    
    public void  Sum(int a, int b){
        System.out.println("Sum with Integer");
        System.out.println(a+b);
    }

    public void Sum(float a, float b){
        System.out.println("Sum with Integer");
        System.out.println(a+b);
    }

    public void doubleSum(double a, double b){
        System.out.println("Sum with Integer");
        System.out.println(a+b);
    }
}
class B2 extends A2{
    public void  intSum(int a, int b){
        System.out.println("Sum with Integer");
        System.out.println(a+b);
    }
    public void  intSum(int a){
        System.out.println("Sum with Integer");
        System.out.println(a+a);
    }
    public void  floatSum(float a, float b){
        System.out.println("Product with Integer");
        System.out.println(a*b);
    }
}





public class over {
    public static void main(String[] args) {
        A2 obja2= new A2();
        obja2.Sum(1, 2);
        obja2.Sum(1, 0);
        obja2.doubleSum(1.015, 1.00);
        obja2.Sum(1000, 22);

        B2 objb2 = new B2();
        objb2.intSum(1, 3);
        objb2.floatSum(1000, 2);



        
    }

}