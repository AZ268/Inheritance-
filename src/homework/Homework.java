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
public class Homework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        NewClass calc = new NewClass (10 , 5);
        //calc.setA(10);
        //
        //calc.setB(5);
        double sum = calc.sum();
            System.out.println(sum);
        double sub = calc.sub () ;
            System.out.println(sub);
        calc.setC(15.0);
        calc.setD(3.0);
        double division = calc.division();
            System.out.println(division);
        calc.printDivision();
        
    }
    
}
