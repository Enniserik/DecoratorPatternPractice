/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpractice;

/**
 *
 * @author Erik
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pizza p1 = new SmallPizza();
        
        p1 = new Pepperoni(p1);
        p1 = new Olives(p1);
        
        System.out.println(p1.getDescription() + "\n" + p1.calculateCost());
        
    }
    
}
