import java.util.Scanner;
class Rectangle
{
	 double length,breadth,area;
	 void setdata(double l,double b)
	 {
		 length=l;
		 breadth=b;
	 }	
	 void calculateArea()
	 {
		 
		area=length*breadth; 
	 }
     void getdata()
	 {
		 
		System.out.println("Area = "+area); 
	 }		 
	
	
	
}

class Area_of_rectangle_using_class
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter length and breadth");
		int l=s.nextInt();
		int b=s.nextInt();
		Rectangle q=new Rectangle();
		q.setdata(l,b);
		q.calculateArea();
		q.getdata(); 
		
		
		
	}
	
	
	
}