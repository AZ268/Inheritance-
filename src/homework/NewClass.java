/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

/**
 *
 * @author User
 */
public class NewClass extends SecondClass {
    private double A ;
    private double B ;
    
    public NewClass (){
        
    }
    public NewClass (double A, double B){
        this.A = A ;
        this.B = B ;
    }
    public void setA (double A){
        this.A = A ;
    }
    public double getA (){
        return A ;
    }
    public void setB (double B) {
        this.B = B ;
    }
    public double getB (){
        return B ;
    }
    
    public double sum () {
        double sum;
        sum = A + B ;
        return sum ;
    }
    public double sub () {
        double sub;
        sub = A - B;
        return sub ;
    }
    public void printSum(double sum){
        System.out.println(sum);
        
    }
    public void printSub(double sub){
        System.out.println(sub);
    }
    
    
    public void printDivision (){
        System.out.println("The operation's result is: "+division());
    }
}
