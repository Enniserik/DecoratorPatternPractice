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
public class Pepperoni extends PizzaToppingDecorator {
    
    Pizza pizza;
    
    public Pepperoni(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", pepperoni";
    }

    @Override
    public double calculateCost() {
        return pizza.calculateCost() + .19;
    }
   
}
