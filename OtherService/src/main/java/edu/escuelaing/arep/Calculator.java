package edu.escuelaing.arep;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Calculadora con operaciones que se puede extender a otras funcionalidades
 */
public class Calculator {
    /**
     * Calcula la media de los datos
     * @param array array que representa la LinkedList
     * @return Promedio de datos
     */
    public static Double calculateMean(Double[] array) {
        Double sum = 0d;
        int n = array.length;
        for (Double x : array) {
            sum += x;
        }
        return sum / n;
    }

    /**
     * Calcula la desviacion estandar de una muestra de datos
     * 
     * @param array Array que contiene los datos
     * @param mean  Promedio de los datos
     * @return Desviacion estandar de los datos y la media
     */
    public static Double calculateDeviation(Double[] array, double mean) {
        Double sumax = 0d;
        int n = array.length;
        for (Double x : array) {
            sumax += Math.pow(x - mean, 2);
        }
        return Math.sqrt((sumax / (n - 1)));
    }

    /**
     * Calcula la desviacion estandar de los datos
     * 
     * @param array Array que representa los datos de la LinkedList
     * @return Desviacion estandar de los datos y la media
     */
    public static double calculateDeviation(Double[] array) {
        return calculateDeviation(array, calculateMean(array));
    }

    /**
     * Lee un archivo con muestra estadisticas para ser almacenadas en una coleccion
     * 
     * @param fileName Nombre del archivo a leer
     * @param list     LinkedList donde se van a guardar los datos
     */
    public static void readFile(String fileName, LinkedList list) {
        FileHandler handler = new FileHandler(fileName);
        try {
            handler.getLines(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readExternalWebFile(File file) {
        FileHandler handler = new FileHandler(file);
        LinkedList list = new LinkedList();
        try {
            handler.getLines(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Metodo Principal del Proyecto
     * 
     * @param args argumento
     */
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Direccion archivo:  ");
        String file = scanner.nextLine();
        scanner.close();
        LinkedList list = new LinkedList();
        readFile(file, list);
        //System.out.println("Promedio:" + calculateMean(list.toArray()) + " Desviacion estandar: "+ calculateDeviation(list.toArray()));
        
    }
}