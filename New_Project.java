import java.util.*;
import java.io.*;
interface Color  
{
	default void ShowColor()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the color of object");
		String color = sc.nextLine();
		System.out.println("Color of the object is:" + color);
	}
	double area(); //by default area() method is public and abstract
	double perimeter();//by default perimeter() method is public and abstract
}
class Rectangle implements Color,Serializable
{
	private double length, width;
	Scanner sc = new Scanner(System.in);
	void setter()
	{
		try
		{
			System.out.print("Enter the length of object :");
			this.length = sc.nextDouble();
			System.out.print("Enter the width of object :");
			this.width = sc.nextDouble();
		}	
		catch(InputMismatchException e)
		{
			System.out.println("Invalid input type");
			System.exit(0);
		}
		catch(Exception e)
		{
			System.out.println("Fatal error");
			System.exit(0);
		}
	}
	void getter()
	{
		System.out.println("Length of object: " + this.length);
		System.out.println("width of object: " + this.width);
	}
	public double area()
	{
		return this.length*this.width;
	}
	public double perimeter()
	{
		return 2*(this.length+this.width);
	}
	public String toString()
	{
		String str = "length is " + this.length +"\nwidth is " + this.width+ "\narea is " + area() + "\n Perimeter is "+perimeter() ;
		return str;
	}

}
class Test
{
	static int num;
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter the number of objects");
			num= sc.nextInt();
			if(num<0)
			{
				throw new IllegalArgumentException();
			}
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Value less than zero is no valid.");
			System.exit(0);
		}
		Rectangle obj[] = new Rectangle[num];
		for(int i =0 ; i< num; i++)
		{
			obj[i] = new Rectangle();
			System.out.println("*************************");
			obj[i].setter();
			obj[i].ShowColor();
			obj[i].getter();				
			System.out.println("Area of object " +(i+1)+" : " + obj[i].area());
		    System.out.println("Perimeter of object " +(i+1)+" : " +obj[i].perimeter());
		    
		} 
		for(int i =0 ; i< num ; i++)
		{
			if(obj[i].area()>100)
		    {
		    	SaveRecord(obj[i]);//Serialize all those objects whose area exceed value 100
		    }
		}
		for(int i =0 ; i< num ; i++)  
			ShowRecords(); //performs de-serilization and display all the records of all objects
	}   
	static void SaveRecord(Rectangle ob)
	{
		File f1 = new File("C:/Users/SMART/Desktop/My_file.txt");
		try(FileOutputStream fout = new FileOutputStream(f1,true);
			ObjectOutputStream oos = new ObjectOutputStream(fout))
		{			
			oos.writeObject(ob);
			System.out.println("Serialization successfull...Checkout the specific output file.");
		}
		catch(IOException e)
		{
			System.out.println("Error occured while writing in the file.");
		}
	} 
	static void ShowRecords()
	{
		File f1 = new File("C:/Users/SMART/Desktop/My_file.txt");
		try(FileInputStream fin = new FileInputStream(f1);
			ObjectInputStream ois = new ObjectInputStream(fin);)  //try with resource block , no need to close the resouces explicitly
		{	
			Rectangle p1 = (Rectangle)ois.readObject();
			//System.out.println(p1);
			System.out.println("de-serilized data:");
			System.out.println(p1.toString());
		}
		catch(IOException e)
		{
			System.out.println("Error occured while reading from the file.");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Cannot rad the file......");
		}
    }
 
}
