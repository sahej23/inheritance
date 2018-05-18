/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author BAGGAS
 */
class A {
    
    int a;
    int b;
    int c;
    
    A(int a,int b){
        this.a=a;
        this.b=b;
        c=0;
    }
    
    void addNo()
    {
        c=a+b;
    }
    void displayNo()
    {
        System.out.println("sum is: "+c);
    }
    
}
class B extends A{
    B(int a, int b)
    {
        super(a, b);
    }
    
    @Override
    void addNo()
    {
        c=a*b;
    }
    
    @Override
    void displayNo()
    {
        System.out.println("after overriding: "+c);
    }
}

public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
   
        public static void main(String[] args){
        B obj = new B(10, 20);
        obj.addNo();
        obj.displayNo();
    }
    
}
