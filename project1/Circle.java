//Johnathan Pham: pham0549
//Andi Nguyen: nguy5131
import java.awt.Color;

public class Circle{
    public Color color;
    public double x;
    public double y;
    public double radius;

    //constructor
    public Circle(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double calculatePerimeter(){
        return 2*(Math.PI*this.radius);
    }

    //helps calculate the total area of the circles 
    public double calculateArea(){
        return Math.PI*(Math.pow(this.radius, 2));
    }

    //All methods under are getters and setters
    public void setColor(Color color){
        this.color = color;
    }

    public void setPos(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public Color getColor(){
        return this.color;
    }

    public double getXPos(){
        return this.x;
    }
    public double getYPos(){
        return this.y;
    }

    public double getRadius(){
        return this.radius;
    }
}