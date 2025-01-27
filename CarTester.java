class Car{
    private String make;
    private String model;

    public Car(String make, String model) {
        this.make=make;
        this.model=model;
    }

    public String getMake(){
        return make;
    }
    
    public String getModel(){
        return model;
    }
}

public class CarTester{
    public static void main(String[] args) {
        Car mycar1 = new Car("Maruti suzuki", "rt5678");
        Car mycar2 = new Car("Tata", "mjhy76");
        System.out.println("My car 1 " + mycar1.getMake() + " ,Model= " + mycar1.getModel());
        System.out.println("My car 2 " + mycar2.getMake() + " ,Model= " + mycar2.getModel());
    }
}