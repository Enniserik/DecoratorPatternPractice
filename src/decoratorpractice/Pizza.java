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
public abstract class Pizza {
    
    String description = "";
    
    public String getDescription() {
        return description;
    }

    public abstract double calculateCost();
    
    @Override
    public String toString() {
        return "Pizza";
    }
        
}
