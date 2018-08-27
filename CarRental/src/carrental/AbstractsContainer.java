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
public class AbstractsContainer {

    public interface Car {

        public Double getVal();

        public String getIns();

        public Integer getStock();

    }

    public interface CarAbstractFactory {

        public Car createCar();
    }

    public static class CarFactory {

        public static  Car createCar(CarAbstractFactory caf) {
            return caf.createCar();
        }
    }

    public class SportCar implements Car {

        public String plate;
        public Double cc;
        public String brand;
        public String color;
        public String transmision;
        public Integer people;
        public Double hour_value;
        public String insurance;
        public Integer stock;

        public SportCar(String plate, Double cc, String brand, String color, String transmision, Integer people, Double hour_value, String insurance, Integer stock) {
            this.plate = plate;
            this.cc = cc;
            this.brand = brand;
            this.color = color;
            this.transmision = transmision;
            this.people = people;
            this.hour_value = hour_value;
            this.insurance = insurance;
            this.stock = stock;
        }

        @Override
        public Double getVal() {
            return this.hour_value;
        }

        @Override
        public String getIns() {
            return this.insurance;
        }

        @Override
        public Integer getStock() {
            return this.stock;
        }
    }

    public class SportCarFactory implements CarAbstractFactory {

        public String plate;
        public Double cc;
        public String brand;
        public String color;
        public String transmision;
        public Integer people;
        public Double hour_value;
        public String insurance;
        public Integer stock;

        public SportCarFactory(String plate, Double cc, String brand, String color, String transmision, Integer people, Double hour_value, String insurance, Integer stock) {
            this.plate = plate;
            this.cc = cc;
            this.brand = brand;
            this.color = color;
            this.transmision = transmision;
            this.people = people;
            this.hour_value = hour_value;
            this.insurance = insurance;
            this.stock = stock;
        }

        @Override
        public SportCar createCar() {
            return new SportCar(this.plate, this.cc, this.brand, this.color, this.transmision, this.people, this.hour_value, this.insurance, this.stock);
        }
    }
    
    public class StandardCar implements Car {

        public String plate;
        public Double cc;
        public String brand;
        public String color;
        public String transmision;
        public Integer people;
        public Double hour_value;
        public String insurance;
        public Integer stock;

        public StandardCar(String plate, Double cc, String brand, String color, String transmision, Integer people, Double hour_value, String insurance, Integer stock) {
            this.plate = plate;
            this.cc = cc;
            this.brand = brand;
            this.color = color;
            this.transmision = transmision;
            this.people = people;
            this.hour_value = hour_value;
            this.insurance = insurance;
            this.stock = stock;
        }

        @Override
        public Double getVal() {
            return this.hour_value;
        }

        @Override
        public String getIns() {
            return this.insurance;
        }

        @Override
        public Integer getStock() {
            return this.stock;
        }
    }

    public class StandardCarFactory implements CarAbstractFactory {

        public String plate;
        public Double cc;
        public String brand;
        public String color;
        public String transmision;
        public Integer people;
        public Double hour_value;
        public String insurance;
        public Integer stock;

        public StandardCarFactory(String plate, Double cc, String brand, String color, String transmision, Integer people, Double hour_value, String insurance, Integer stock) {
            this.plate = plate;
            this.cc = cc;
            this.brand = brand;
            this.color = color;
            this.transmision = transmision;
            this.people = people;
            this.hour_value = hour_value;
            this.insurance = insurance;
            this.stock = stock;
        }

        @Override
        public StandardCar createCar() {
            return new StandardCar(this.plate, this.cc, this.brand, this.color, this.transmision, this.people, this.hour_value, this.insurance, this.stock);
        }
    }
    
    public class FamilyCar implements Car {

        public String plate;
        public Double cc;
        public String brand;
        public String color;
        public String transmision;
        public Integer people;
        public Double hour_value;
        public String insurance;
        public Integer stock;

        public FamilyCar(String plate, Double cc, String brand, String color, String transmision, Integer people, Double hour_value, String insurance, Integer stock) {
            this.plate = plate;
            this.cc = cc;
            this.brand = brand;
            this.color = color;
            this.transmision = transmision;
            this.people = people;
            this.hour_value = hour_value;
            this.insurance = insurance;
            this.stock = stock;
        }

        @Override
        public Double getVal() {
            return this.hour_value;
        }

        @Override
        public String getIns() {
            return this.insurance;
        }

        @Override
        public Integer getStock() {
            return this.stock;
        }
    }

    public class FamilyCarFactory implements CarAbstractFactory {

        public String plate;
        public Double cc;
        public String brand;
        public String color;
        public String transmision;
        public Integer people;
        public Double hour_value;
        public String insurance;
        public Integer stock;

        public FamilyCarFactory(String plate, Double cc, String brand, String color, String transmision, Integer people, Double hour_value, String insurance, Integer stock) {
            this.plate = plate;
            this.cc = cc;
            this.brand = brand;
            this.color = color;
            this.transmision = transmision;
            this.people = people;
            this.hour_value = hour_value;
            this.insurance = insurance;
            this.stock = stock;
        }

        @Override
        public FamilyCar createCar() {
            return new FamilyCar(this.plate, this.cc, this.brand, this.color, this.transmision, this.people, this.hour_value, this.insurance, this.stock);
        }
    }

}
