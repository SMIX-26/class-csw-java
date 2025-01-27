class areaperimeter{
    
    private double length;
    private double width;

    public areaperimeter(double length, double width){
        this.length=length;
        this.width=width;
    }

    public double getlenth(){
        return length;
    }

    public void setlength(double length){
        this.length=length;
    }

    public double getwidth(){
        return width;
    }

    public void setwidth(double width){
        this.width=width;
    }

    public double calculatePerimeter(){
    return 2*(length + width) ;
    }

    public double calculateArea(){
        return length*width ;
    }

}

public class Rectangle {
    public static void main(String[] args) {
        areaperimeter ap1 = new areaperimeter(2, 4);

        // System.out.println("initial length: "+ ap1.getlenth());
        // System.out.println("width: "+ ap1.getwidth());
        System.out.println("the perimeter is: " + ap1.calculatePerimeter());
        System.out.println("the area is: " + ap1.calculateArea());
    }
}
