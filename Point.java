class markers{
    private int X;
    private int Y;

    public markers(int X, int Y){
        this.X=X;
        this.Y=Y;
    }
    
    public markers(markers other){
        this.X=other.X;
        this.Y=other.Y;
    }

    public int getX(){
        return X;
    }

    public void setX(int X){
        this.X=X;
    }

    public int getY(){
        return Y;
    }

    public void setY(int Y){
        this.Y=Y;
    }

    public void display(){
        System.out.println("point x: " + X + "point y: "+ Y);
    }
}

public class Point {
    public static void main(String[] args) {
        markers m1 = new markers(2, 3);
        System.out.println("Original points");
        m1.display();
        
        markers m2 = new markers(m1);
        System.out.println("copied points");
        m2.display();

        m1.setX(7);
        m1.setY(8);
        System.out.println("Modified original points");
        m1.display();

        System.out.println("copied the modified original products");
        m2.display();
    }
}
