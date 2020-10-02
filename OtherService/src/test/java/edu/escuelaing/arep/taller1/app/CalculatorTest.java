package edu.escuelaing.arep.taller1.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.escuelaing.arep.Calculator;
import edu.escuelaing.arep.LinkedList;

public class CalculatorTest {
    private static Double TOLERANCE=0.1d;

    @Test
    public void shouldCalculateMean(){
        String file = "src\\test\\resources\\data\\data1.txt";
        LinkedList list = new LinkedList();
        Calculator.readFile(file, list);
        Double errorAbsoluto=Math.abs(Calculator.calculateMean(list.toArray())- 550.6);
        assertTrue(errorAbsoluto < TOLERANCE);
    }
    @Test
    public void shouldCalculateMean2(){
        String file = "src\\test\\resources\\data\\data2.txt";
        LinkedList list = new LinkedList();
        Calculator.readFile(file, list);
        Double errorAbsoluto=Math.abs(Calculator.calculateMean(list.toArray())- 60.32);
        assertTrue(errorAbsoluto < TOLERANCE);
    }
    @Test
    public void shouldCalculateMean3(){
    
        String file = "src\\test\\resources\\data\\data3.txt";
        LinkedList list = new LinkedList();
        Calculator.readFile(file, list);
        Double errorAbsoluto=Math.abs(Calculator.calculateMean(list.toArray())- 638.9);
        assertTrue(errorAbsoluto < TOLERANCE);
    }


    @Test
    public void shouldCalculateDeviation1(){
        String file = "src\\test\\resources\\data\\data1.txt";
        LinkedList list = new LinkedList();
        Calculator.readFile(file, list);
        Double errorAbsoluto=Math.abs(Calculator.calculateDeviation(list.toArray())- 572.03);
        assertTrue(errorAbsoluto < TOLERANCE);
        
    }
    public void shouldCalculateDeviation2(){
        String file = "src\\test\\resources\\data\\data2.txt";
        LinkedList list = new LinkedList();
        Calculator.readFile(file, list);
        Double errorAbsoluto=Math.abs(Calculator.calculateDeviation(list.toArray())- 62.26);
        assertTrue(errorAbsoluto < TOLERANCE);
        
    }
    public void shouldCalculateDeviation3(){
        String file = "src\\test\\resources\\data\\data3.txt";
        LinkedList list = new LinkedList();
        Calculator.readFile(file, list);
        Double errorAbsoluto=Math.abs(Calculator.calculateDeviation(list.toArray())- 625.633981);
        assertTrue(errorAbsoluto < TOLERANCE);
    }
        
    
}




