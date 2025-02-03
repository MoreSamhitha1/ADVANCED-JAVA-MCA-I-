class Person
 {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display()
     {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

class Student extends Person 
{
    int rollNo;
    Student(String name, int age, int rollNo)
     {
        super(name, age);
        this.rollNo = rollNo;
    }
void display() 
{
        super.display();
        System.out.println(this.rollNo);
    }
}

class Lecturer extends Person {
    String subject;
Lecturer(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
 void display() 
 {
        super.display();
        System.out.println(this.subject);
    }
}

class hierarchial
 {
    public static void main(String[] args) 
    {
        Student S1 = new Student("Samhitha", 20, 123);
        Lecturer L1 = new Lecturer("Hemanth", 25, "Advanced Java Programming");
        S1.display();
        System.out.println();
        L1.display();
    }
}
