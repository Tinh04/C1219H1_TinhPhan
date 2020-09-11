package B4_Inheritances;

class Parent1
{
    public void disp()
    {
        System.out.println("Parent disp called");
    }
}
public class Child1 extends Parent1
{
    public void disp()
    {
        System.out.println("Child disp called");
    }
    public static void main(String args[])
    {
        Parent1 p = new Child1();
        p.disp();
        Child1 c = (Child1) p;
        c.disp();
    }
}