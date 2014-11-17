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
public class MediumPizza extends Pizza {
    
    public MediumPizza(){
        description = "Medium";
    }
    
    @Override
    public double calculateCost() {
        return 9.99;
    }
    
}

