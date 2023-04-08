class Demo
{
    protected int l, w, h;
    public Demo( int x1, int x2, int x3)
    {
        l = x1;
        w = x2;
        h = x3;
    }
    public Demo()
    {
        this(0, 0, 0);
    }
    
    public void input(int l, int w, int h)
    {
        this.l = l;
        this.w = w;
        this.h = h;
    }
    public void get()
    {
        System.out.println(l + " " + w + " " + h);
    }
}
public class Main {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.input(1, 2, 3);
        obj.get();
    }
}
