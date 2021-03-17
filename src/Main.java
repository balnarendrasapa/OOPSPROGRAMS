package hoho;
class A
{
    A()
    {
        System.out.println("Hai");
    }
    void m1()
    {
        System.out.println("Class A");
    }
}
class B extends A
{
    B()
    {
        System.out.println("Hello");
    }
    void m2()
    {
        System.out.println("Class B");
    }
}
public class Main {
    public static void main(String[] args) {
        B b= new B();
        b.m2();
        b.m1();
    }
}
