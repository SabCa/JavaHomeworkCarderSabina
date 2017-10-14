/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package homework4;
/**
* @author gheorgheaurelpacurar
*/
public class Car implements Saleable, Rentable{

    Car(String mercedes, short mercedesSpeed, Color color, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
/**
@enum enumeration of accepted car colors
*/
public enum Color { WHITE, RED, YELLOW, GREEN, GRAY, BLACK };
/**
Internal hidden fields / attributes
*/
private Color color;
private String name;
private short speed;
/**
Constructors
*/
public Car(){
name = "Default car name";
speed = 90;
}
public Car(String carName, short carSpeed, Color carColor){
name = carName;
speed = carSpeed;
color = carColor;
}
/*get-ers and set-ers*/
public String getName(){
return(name);
}
public Color getColor(){
return(color);
}
public short getSpeed(){
return(speed);
}
public void setName(String newName){
name = newName;
}
public void setColor(Color newColor){
color = newColor;
}
public void setSpeed(short newSpeed){
speed = newSpeed;
}
/**
The method increase actual speed of Car until final speed specified.
* @param newSpeed is new speed
*/
public void increaseSpeed(short newSpeed){
if(newSpeed > speed){
speed = newSpeed;
}
else if (newSpeed < speed){
decreaseSpeed(newSpeed);
}
}
/**
The method decrease actual speed of Car until final speed specified.
* @param newSpeed is new speed
*/
public void decreaseSpeed(short newSpeed){
if(newSpeed < speed){
speed = newSpeed;
}
else if (newSpeed < speed){
increaseSpeed(newSpeed);
}
}
/**
Abstract method defined in Saleable interface implemented by class car
* is implemented here.
* @override Saleable.getSalePrice() method
*/
@Override
public int getSalePrice(){
        int salePrice = 0;
    return salePrice;
}

@Override
public void setSalePrice(int price){
        int salePrice = price;
}

@Override
public int getDailyRentPrice(){
        int rentPrice = 0;
    return rentPrice;
}

@Override
public void setDailyRentPrice(int rent){
        int rentPrice = rent;
}
}
