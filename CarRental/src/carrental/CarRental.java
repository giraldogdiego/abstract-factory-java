/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrental;

import carrental.AbstractsContainer.*;

/**
 *
 * @author user
 */
public class CarRental {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AbstractsContainer ab = new AbstractsContainer();
        AbstractsContainer.Car fa = CarFactory.createCar(ab.new FamilyCarFactory("IOR473", 2000.0, "BMW", "Blue", "AT", 5, 5.0, "Equidad", 5));
        Customer customer = new Customer(23234, "Diego", "M", "VIP");
        App.getInstance().createRental(customer, fa, "", "", "");
    }
    
}
