/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thiwanka
 */
public class classdiagram_code {
    public static void main(String[] args) {
        
        SubPrototype s1 = new SubPrototype(10);
        System.out.println(s1);
        
        //SubPrototype s2 = new SubPrototype(10);
        SubPrototype s2 = s1.clone();
        System.out.println(s2);
    }
}

interface prototype{
    public abstract SubPrototype clone();
}
class SubPrototype implements prototype{

    private int data;
    
    public SubPrototype(int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
    
    @Override
    public SubPrototype clone() {
        return new SubPrototype(this.data);
    }

    @Override
    public String toString() {
        return String.valueOf(this.data);
    }
}
