package com.mypakage;

import com.company.A;

public class Demo1 {
    public static void main(String[] args) {
        Demo1 obj = new Demo1();
        obj.show();
        Demo2 demo2 = new Demo2();
        demo2.getx();
//        demo2.gety();
    }
    void show(){
        A obj = new A();
//        public
        obj.getx();
    };
}
class Demo2 extends A{
//    protected void gety(){
//        super.gety();
//    }
    void show(){
//        public
        getx();
//        protected
        gety();
    }
}
