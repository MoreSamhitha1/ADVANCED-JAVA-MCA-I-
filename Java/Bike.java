class Bike
{
String name;
String color;
double price;
int mileage;
public Bike()
{
    System.out.println("Object is created");

}
public Bike(String name,String color)
{
    this();
    this.name=name;
    this.color=color;
}
public Bike(String name,String color,double price,int mileage)
{
    this(name,color);
    this.price=price;
    this.mileage=mileage;

}
public void display()
{
    System.out.println(name);
    System.out.println(color);
    System.out.println(price);
    System.out.println(mileage);
}
public static void main(String args[])
{
    Bike B1=new Bike("Glamour","Red",110000,60);
    B1.display();
    Bike B2=new Bike();
    Bike B3=new Bike("Honda","blue");
    B2.display();
    B3.display();
    
}
}

