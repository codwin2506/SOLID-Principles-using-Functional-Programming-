public class Open{

    public static double cuboid(double  length,double breadth, double height){
        return (double)(length*breadth*height);
    }

    public static double rectangle(double length,double breadth){
        return (length*breadth);
    }

    public static void main(String args[])
    {
        for(int i=0;i<5;i++){
            double cuboidArea1=cuboid(5,6,3);

            System.out.println("The total volume of cuboid is : "+cuboidArea1);
        }
        for(int i=0;i<5;i++){
            double rectangleArea1=rectangle(10,4);
            System.out.println("The total volume of cuboid is : "+rectangleArea1);
        }
    }
}