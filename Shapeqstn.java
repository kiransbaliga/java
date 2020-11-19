abstract class shape{
    void numberOfSides(){}
}
class Rectangle extends shape{
    void numberOfSides(){
        System.out.println("NO of sides: 4");
    }
}
class Triangle extends shape{
    void numberOfSides(){
        System.out.println("NO of sides: 3");
    }
}
class Hexagon extends shape{
    void numberOfSides(){
        System.out.println("NO of sides: 6");
    }
}
public class Shapeqstn
{
    public static void main(String[] args){
        Hexagon hex=new Hexagon();
        Triangle tri=new Triangle();
        Rectangle rec=new Rectangle();
        rec.numberOfSides();
        tri.numberOfSides();
        hex.numberOfSides();

    }
}
