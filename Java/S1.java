class S1{
    String name;
    String address;
    public void display()
    {
        System.out.println(name);
        System.out.println(address);

    }
}
class S2 extends S1{
    int age;
    public S2(String name,String address,int age)
    {
        this.name=name;
        this.address=address;
        this.age=age;
    }
    public void display()
    {
        super.display();
        System.out.println(this.age);
    
    }
    public static void main(String[] args)
    {
        S2 a=new S2("rani","hyd",20);
        a.display();
    }

}
