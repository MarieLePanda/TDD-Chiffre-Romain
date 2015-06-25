/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tdd.chiffre.romain.TDDChiffreRomain;


/**
 *
 * @author Lucas
 */
public class TestConvertRomanNumber {
    
    public TestConvertRomanNumber() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void number1() {
        String expect = "I";
        String result = TDDChiffreRomain.ConvertRomanNumber(1);
        assertEquals(expect, result);
    }
    
    @Test
    public void number5(){         
        String expect = "V";
        String result = TDDChiffreRomain.ConvertRomanNumber(5);
        assertEquals(expect, result);
    }

    @Test
    public void number10(){         
        String expect = "X";
        String result = TDDChiffreRomain.ConvertRomanNumber(10);
        assertEquals(expect, result);
    }
    
    @Test
    public void number50(){         
        String expect = "L";
        String result = TDDChiffreRomain.ConvertRomanNumber(50);
        assertEquals(expect, result);
    }
    
    @Test
    public void number100(){         
        String expect = "C";
        String result = TDDChiffreRomain.ConvertRomanNumber(100);
        assertEquals(expect, result);
    }
    
    @Test
    public void number500(){         
        String expect = "D";
        String result = TDDChiffreRomain.ConvertRomanNumber(500);
        assertEquals(expect, result);
    }
    
    @Test
    public void number1000(){         
        String expect = "M";
        String result = TDDChiffreRomain.ConvertRomanNumber(1000);
        assertEquals(expect, result);
    }
    
    @Test
    public void number2(){         
        String expect = "II";
        String result = TDDChiffreRomain.ConvertRomanNumber(1000);
        assertEquals(expect, result);
    }
}
