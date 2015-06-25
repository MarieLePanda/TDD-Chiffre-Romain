/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tdd.chiffre.romain;

import java.util.HashMap;

/**
 *
 * @author Lucas
 */
public class TDDChiffreRomain {

    /**
     * @param args the command line arguments
     */
    /* Les chiffre romain à tester :
    
    
    */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    }
    
    public static String ConvertRomanNumber(int number){
        
        HashMap<Integer, String> baseRomanNumber = new HashMap<Integer, String>();
        baseRomanNumber.put(1, "I");
        baseRomanNumber.put(5, "V");
        baseRomanNumber.put(10, "X");
        baseRomanNumber.put(50, "L");
        baseRomanNumber.put(100, "C");
        baseRomanNumber.put(500, "D");
        baseRomanNumber.put(1000, "M");
        
        if(number <= 3){
            String result = "";
            for(int i = 0; i < number; i++ ){
                result += baseRomanNumber.get(1);
            }
            return result;
        }
        
        if(number == 6)
            return "VI";
        
        return baseRomanNumber.get(number);
    }
}
