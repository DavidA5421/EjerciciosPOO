package E19;


public class Triangulo {

    public static double cal_perimeter(double side){
        double perimeter;
        perimeter = 3*side;
        return perimeter;
    }
    
    public static double cal_height(double side){
        double height;
        height = (side*Math.sqrt(3))/2;
        return height;
    }
    
    public static double cal_area(double side){
        double area;
        area = (side*side)*Math.sqrt(3)/4;
        return area;
    }
}   
    


