/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollectionSet;

import java.util.HashSet;

/**
 *
 * @author USER
 */
public class CoinTest {
    public static void main(String[] args) {
        HashSet<Coin> bagOfCoins = new HashSet<>();
        Coin coin1 = new Coin(1);
        Coin coin2 = new Coin(2);
        Coin coin5 = new Coin(5);
        
        bagOfCoins.add(coin1);
        bagOfCoins.add(coin2);
        bagOfCoins.add(coin5);
        displayBagContents(bagOfCoins);
        
        findCoin(bagOfCoins, coin5);
        displayBagDetails(bagOfCoins);
        
        bagOfCoins.clear();
        displayBagDetails(bagOfCoins);
    }
    
    static void findCoin(HashSet<Coin> bagOfCoins, Coin coin){
        if(bagOfCoins.contains(coin))
            System.out.println("There is a coin " +
                                coin.getDenomination() + " in the bag");
        else
            System.out.println("There is no coin " +
                                coin.getDenomination() + " in the bag");
    }
    
    static void displayBagContents(HashSet<Coin> bagOfCoins){
        for(Coin coin: bagOfCoins)
            System.out.println(coin.getDenomination());
    }
    
    static void displayBagDetails(HashSet<Coin> bagOfCoins){
        if(bagOfCoins.isEmpty())
            System.out.println("There are no coins in the bag");
        else
            System.out.println("There are " + bagOfCoins.size()
                                + " coins in the bag");
    }
}