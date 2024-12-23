//Johnathan Pham: pham0549
//Andi Nguyen: nguy5131
import java.awt.Color;

public class Triangle {
    public Color color;
    public double x;
    public double y;
    public double width;
    public double height;

    //constructor
    public Triangle(double x, double y, double width, double height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double calculatePerimeter(){
        double side = Math.pow(((Math.pow((this.width*0.5), 2)) + (Math.pow(this.height, 2))), 1/2);
        return (this.width+(2*side));
    }

    //helped calculate the total area of the triangles
    public double calculateArea(){
        return (this.width*this.height)/2;
    }

    //All methods under are setters and getters
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