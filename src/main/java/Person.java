
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Se crea clase Person con 4 atributos public y uno private con su respectivo set y get. 
 * @author rolin
 */
public class Person {
    private String name;
    public String lastName;
    public String lastName2;
    public Date dateBirth;
    public float heigth;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
