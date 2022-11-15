/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollectionMap;

import java.util.HashMap;

/**
 *
 * @author USER
 */
public class FruitTest {
    public static void main(String[] args) {
        HashMap<String,String> fruitBowl = new HashMap<>();
        addElements("Grape", "Green", fruitBowl);
        addElements("Cherry", "Red", fruitBowl);
        addElements("Orange", "Orange", fruitBowl);
        
        fruitBowl.replace("Orange", "Orange", "Yellow");
        displayElements(fruitBowl);
        getValue("banana", fruitBowl);
    }
    
    static void addElements(String key, String value, HashMap<String, String> fruitBowl){
        fruitBowl.put(key, value);
    }
    
    static void getValue(String key, HashMap<String, String> fruitBowl){
        if(fruitBowl.get(key) == null)
            System.out.println("not found");
        else
            System.out.println(fruitBowl.get(key));
    }
    
    static void displayElements(HashMap<String, String> fruitBowl){
        //System.out.println(fruitBowl);
        for(HashMap.Entry<String, String> fruit : fruitBowl.entrySet()){
            System.out.println("Fruit: " + fruit.getKey()
                                + " - Color: " + fruit.getValue());
        }
    }
}
