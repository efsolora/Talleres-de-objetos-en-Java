/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Se crea la clase House con un atributo protected, un contructor y un metodo numberRooms.
 * @author rolin
 */
public class House {
    protected int rooms;
    
    public House(int rooms){
        this.rooms = rooms;
    }
    
    protected void numberRooms(){
        House house1;
        house1 = new House(5);
        System.out.println("the number of rooms is"+house1);
              
    }
}
