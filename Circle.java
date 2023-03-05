
package Lab4;
 
public class Circle {
    // property
    public double radius;
    public String color;
    //method
    //method co tham so
    public Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }      

    //methob get tra ve gia tri
    public double getRadius(){
        return this.radius;
    }
    //methob set thay doi gia tri
    public void setRadius(double radius){
        this.radius=radius;
    }
    //method getColor tra ve gia tri
    public String getColor(){
        return this.color;
    }
    //methob setColor thay doi gia tri
    public void setColor(String color){
        this.color=color;
        
    }
    //methob getArea thay doi gia tri
    public double getArea(){
       return this.radius*radius*3.14;
    }
    //hien thi thong tin
    @Override
    public String toString(){
        return "(area="+getArea()+")";
    }
}
