//Johnathan Pham: pham0549
//Andi Nguyen: nguy5131
import java.awt.Color;

public class Rectangle{
    public Color color;
    public double x;
    public double y;
    public double width;
    public double height;

    //constructor
    public Rectangle(double x, double y, double width, double height){ 
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double calculatePerimeter(){
        return (this.height*2)+(2*this.width);
    }

    //helps calculate the total area of the rectangles
    public double calculateArea(){
        return (this.width*this.height);
    }

    //All methods under are getters and setters
    public void setColor(Color color){
        this.color = color;
    }

    public void setPos(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public Color getColor(){
        return color;
    }

    public double getXPos(){
        return this.x;
    }

    public double getYPos(){
        return this.y;
    }

    public double getHeight(){
        return this.height;
    }

    public double getWidth(){
        return this.width;
    }
}