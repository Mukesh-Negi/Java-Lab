import java.lang.System;
import java.util.Scanner;
class box
{
        protected l,w,h;
        public box()  // base constr : Non - parameterised 
        {
                l = 0;
                w = 0;
                h = 0;
        }
        public box(int x1, int x2, int x3) // base constr : parameterised
        {
                l = x1;
                w = x2;
                h = x3;
        }
        public void input() // base input() : non - parameterised
        {
                l = 0;
                w = 0;
                h = 0;
        }
        public void input(int x1, int x2, int x3) // base input() : parameterised
        {
                l = x1;
                w = x2;
                h = x3;
        }
        public void display() // base display()
        {
                System.out.println(" the l, w, h  are : " l + " " + w + " " + h " "); 
        }
}
class derived extends box
{
        protected int wt;
        public derived () // derived constr : non - parameterised
        {
                this(0,0,0,0); // calls the parameterised constr of this class
                wt = 0;
        }
        public derived (int x1, int x2, int x3, int x4)
        {
                super(x1, x2, x3); // calls the parameterised constr of base class
                wt = x4;
        }
        public void input(int x1, int x2, int x3, int x4)
        {
                super.input(x1, x2, x3); // calls the parameterised input() of base class
                wt = x4;
        }
        public void display()
        {
                super.display(); // calls the diplay function of base class
                System.out.println(" And the l, w, h, wt are :" l + " " w + " " + h + " " + wt);
        }
}
public class box_demo
{
        public static void main(String args[])
        {
                box obj1 = new box(10, 20, 30);
                obj1.display();
                
                derived obj2 = new derived (1, 2, 3, 4);
                obj2.display();
                obj2.input(100, 200, 300, 400);
                obj2.display();
                
                System.out.println("Function overriding : ");
                box ref = new derived (5, 6, 7, 8);
                ref.display();
        }
}
