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
public class SecondClass {
    private double C ;
    private double D ;
    
    public SecondClass (){
        
    }
    public SecondClass (double C, double D){
        this.C = C ;
        this.D = D ;
    }
    public void setC (double C){
        this.C = C ;
    }
    public double getC (){
        return C ;
    }
    public void setD (double D) {
        this.D = D ;
    }
    public double getD (){
        return D ;
    }
    
    public double division () {
        double division;
        division = C / D ;
        return division ;
    }
    
    public void printDivision(){
        System.out.println(" The result of the division is "+division());
        
    }
   
}
