/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thiwanka
 */
public class Test {

  
    public static void main(String[] args) {
        
        A a = new A(10,20);
        System.out.println(a.x + a.y);
        
        try {
            A a1 = (A)a.clone();
            System.out.println("a1.x+a1.y");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}

class A implements Cloneable{
    int x;
    int y;

    public A(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    
}
