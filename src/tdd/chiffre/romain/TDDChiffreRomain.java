/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tdd.chiffre.romain;

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
        
        if(number == 1)
            return "I";
        
        if(number == 5)
            return "V";
        
        if(number == 10)
            return "X";
        
        if(number == 50)
            return "L";
        
        if(number == 100)
            return "C";
        
        return "D";
    }
}
