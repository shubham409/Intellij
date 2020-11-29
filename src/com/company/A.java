package com.company;

class Code1 {
    public static void main(String[] args) {
        B b = new B();
        b.show();
        C c = new C();
        c.show();
        c.gety();
        c.getx();
        c.getw();
    }
}
public class A
{
    int w= 10;
    public int x=30;
    protected  int y=50;
    private int z =70;
    void getw()
    {
        System.out.println(w);
    }
    public void getx()
    {
        System.out.println(x);
    }
    protected void gety()
    {
        System.out.println(y);
    }
    private void getz()
    {
        System.out.println(z);
    }
}
class B
{
    A obj = new A();
    void show(){
//        defalut
        obj.getw();
//        public
        obj.getx();
//        protected
        obj.gety();
    }
}
class C extends A{
    void show(){
//        default
        getw();
//        public
        getx();
//        protected
        gety();
    }
}
