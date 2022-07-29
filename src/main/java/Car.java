/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Se crea la clase Car con un atributo public, un contructor y un metodo startCar.
 * @author rolin
 */
public class Car {
    public String color;
    public boolean start;
    
    public Car(boolean start){
        this.start=start;
        
    }
    
    private void  startCar (){       
        System.out.println("The car is start");
    }
}
