//Johnathan Pham: pham0549
//Andi Nguyen: nguy5131

// FractalDrawer class draws a fractal of a shape indicated by user input
import java.util.Scanner;
import java.awt.Color;

public class FractalDrawer {
    private double totalArea=0;  // member variable for tracking the total area

    public FractalDrawer() {}  // contructor


    //TODO:
    // drawFractal creates a new Canvas object
    // and determines which shapes to draw a fractal by calling appropriate helper function
    // drawFractal returns the area of the fractal
    public double drawFractal(String type) {
        Canvas drawing = new Canvas(1500, 1500);
        if (type.equals("circle")){                                 //determines what kind of fractal to make based off of user input
            drawCircleFractal(100, 500, 500, Color.BLUE, drawing, 0);
            
        }
        else if (type.equals("triangle")){
            drawTriangleFractal(100, 100, 500, 500, Color.YELLOW, drawing, 0);

        }
        else if (type.equals("rectangle")){
            drawRectangleFractal(100, 100, 450, 450, Color.RED, drawing, 0);
            
        }
        return totalArea;
    }


    //TODO:
    // drawTriangleFractal draws a triangle fractal using recursive techniques
    public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level){
        Triangle myTriangle = new Triangle(x, y, width, height);

        Color[] colorArray = new Color[]{Color.BLACK, Color.CYAN, Color.PINK}; //Creates an array to cycle through 3 unique colors

        if (c.equals(colorArray[0])){ //cycles through the colors in colorArray
            c = colorArray[1];
        }
        else if (c.equals(colorArray[1])){
            c = colorArray[2];
        }
        else{
            c = colorArray[0];
        }
        myTriangle.setColor(c); //changes the triangle's color 

        totalArea += myTriangle.calculateArea(); //adds up total area of the fractal

        if (level >= 7){ //allows 7 different recusrsive calls
            return;
        }
        else{
            can.drawShape(myTriangle); //draws the circles by calling Canvas class
            drawTriangleFractal(width/2,height/2, x+width/4,y-height,c, can, level+1); //draws 3 triangles per layer
            drawTriangleFractal(width/2,height/2, x-width/2,y,c, can, level+1);
            drawTriangleFractal(width/2,height/2, x+width,y,c, can, level+1);

        }
    } 


    // TODO:
    // drawCircleFractal draws a circle fractal using recursive techniques
    public void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level){
        Circle myCircle = new Circle(x, y, radius);

        Color[] colorArray = new Color[]{Color.BLACK, Color.CYAN, Color.PINK}; //Creates an array to cycle through 3 unique colors
        if (c.equals(colorArray[0])){ //cycles through the colors in colorArray
            c = colorArray[1];
        }
        else if (c.equals(colorArray[1])){
            c = colorArray[2];
        }
        else{
            c = colorArray[0];
        }
        myCircle.setColor(c); //changes the circle's color 

        totalArea += myCircle.calculateArea(); //adds up total area of the fractal

        if (level >= 7){ //allows 7 different recusrsive calls
            return;
        }
        else{
            can.drawShape(myCircle); //draws the circles by calling Canvas class
            drawCircleFractal((radius/2), (x+radius), (y-radius), c, can, level+1); //draws 4 circles per layer
            drawCircleFractal((radius/2), (x-radius), (y-radius), c, can, level+1);
            drawCircleFractal((radius/2), (x+radius), (y+radius), c, can, level+1);
            drawCircleFractal((radius/2), (x-radius), (y+radius), c, can, level+1);
        }
    }


    //TODO:
    // drawRectangleFractal draws a rectangle fractal using recursive techniques
    public void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {

        Rectangle myRectangle = new Rectangle(x, y, width, height);

        Color[] colorArray = new Color[]{Color.BLACK, Color.CYAN, Color.PINK}; //Creates an array to cycle through 3 unique colors
        if (c.equals(colorArray[0])){ //cycles through the colors in colorArray
            c = colorArray[1];
        }
        else if (c.equals(colorArray[1])){
            c = colorArray[2];
        }
        else{
            c = colorArray[0];
        }
        myRectangle.setColor(c); //changes the rectangle's color 

        totalArea += myRectangle.calculateArea(); //adds up total area of the fractal

        if (level >= 7){ //allows 7 different recusrsive calls
            return;
        }
        else{
            can.drawShape(myRectangle); //draws the rectangles by calling Canvas class
            drawRectangleFractal(width/2, height/2, (x+width), (y+height), c, can, level+1); //draws 4 rectangles per layer
            drawRectangleFractal(width/2, height/2, (x-width/2), (y+height), c, can, level+1);
            drawRectangleFractal(width/2, height/2, (x-width/2), (y-height/2), c, can, level+1);
            drawRectangleFractal(width/2, height/2, (x+width), (y-height/2), c, can, level+1);
        }
    }

    //TODO:
    // main should ask user for shape input, and then draw the corresponding fractal.
    // should print area of fractal
    public static void main(String[] args){
        FractalDrawer fractal = new FractalDrawer();
        System.out.println("Choose one: circle, triangle, or rectangle");
        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.next();
        System.out.println(fractal.drawFractal(input)); //prints the total area of the fractal
    }
}
