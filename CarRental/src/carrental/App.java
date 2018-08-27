/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrental;

import carrental.AbstractsContainer.Car;

/**
 *
 * @author user
 */
public class App {
    private static App sharedInstance;
    
    public Rental createRental(Customer customer, Car car, String date, String pickup_date, String return_date){
        return new Rental(customer.id, "26/08/2018", "26/08/2018", "28/08/2018", car.getVal(), car.getVal()*3);
    }
    
    private App(){}
    
    public static App getInstance(){
        if (sharedInstance == null){
            sharedInstance =  new App();
        }
        return sharedInstance;
    }
    
}
