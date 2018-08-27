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
public class Customer {
    public Integer id;
      public String nombre;
        public String genero;
        public String tipo;
        
        public Customer(Integer id, String nombre, String genero, String tipo){
            this.id = id;
            this.nombre = nombre;
            this.genero = genero;
            this.tipo = tipo;
        }
    
}
