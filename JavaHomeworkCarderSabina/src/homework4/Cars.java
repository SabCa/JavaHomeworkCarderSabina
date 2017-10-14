/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework4;

/**
 *
 * @author lenovo
 */
public class Cars {
    public static void main(String[] args) {
        Car mercedes;
        short mercedesSpeed = 230;
        mercedes = new Car("Mercedes", mercedesSpeed, Car.Color.YELLOW, 300, 15000);
        Car renault;
        short renaultSpeed = 120;
        renault = new Car("Renault", renaultSpeed, Car.Color.BLACK, 250, 12000);
        Car logan;
        short loganSpeed = 120;
        logan = new Car("Logan", loganSpeed, Car.Color.GRAY, 150, 6000);
    }
    
}
