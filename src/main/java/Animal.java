/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Se crea la clase Animal con un atributo public, un constructor y un metodo sanimalType.
 * @author rolin
 */
public class Animal {
    public String type;
    public String name;
    
    public Animal(String type){
        this.type = type;
    }
    
    public void animalType(){
        Animal dog;
        dog = new Animal("domestic");
        System.out.println("The type of animal is"+ dog);
    }
}
