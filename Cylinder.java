
package Lab4;

public class Cylinder extends Circle{
     // property
    public double height;
    //add contructor
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height=height;
    }  
    //get tra ve gia tri
    public double getHeight(){
        return this.height;
    }
    //set thay doi gia tri
     public void setHeight(double height){
        this.height=height;
    }
     public double getVolume(){
         return getArea()*height;
     }
    
}
