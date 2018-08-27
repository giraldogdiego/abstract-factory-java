/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrental;

/**
 *
 * @author user
 */
public class Rental {
    public Integer id;
      public String date;
      public String plate;
        public String pickup_date;
        public String return_date;
        public Double hour_value;
        public Double total_value;
        
        public Rental(Integer id, String date, String pickup_date, String return_date, Double hour_value, Double total_value){
            this.id = id;
            this.date = date;
            this.pickup_date = pickup_date;
            this.return_date = return_date;
            this.hour_value = hour_value;
            this.total_value = total_value;
        }
    
}
