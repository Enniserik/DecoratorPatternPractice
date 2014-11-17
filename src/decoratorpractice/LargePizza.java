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
public class LargePizza extends Pizza {
    
    public LargePizza(){
        description = "Large";
    }
    
    @Override
    public double calculateCost() {
        return 13.99;
    }
    
}

