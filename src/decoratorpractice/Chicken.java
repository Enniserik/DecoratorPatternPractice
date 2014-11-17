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
public class Chicken extends PizzaToppingDecorator {
    
    Pizza pizza;
    
    public Chicken(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", chicken";
    }

    @Override
    public double calculateCost() {
        return pizza.calculateCost() + .29;
    }
   
}
