package edu.escuelaing.arep.taller1.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.escuelaing.arep.LinkedList;

import static org.junit.Assert.assertEquals;

public class LinkedListTest  {
    /**
     * Rigourous Test :-)
     */
    @Test
    public void sizeTest(){
        final LinkedList list = new LinkedList();
        assertTrue(list.isEmpty());
        list.add(3.0);
        assertEquals(1, list.size());
        list.add(5.5);
        assertEquals(2, list.size());
        list.add(3.1);
        assertEquals(3, list.size());
        list.remove(2);
        assertEquals(2, list.size());
    }

    @Test
    public void arrayToLinkedTest(){
        final Double[] olist = {1.0,5.1,8.1,7.5};
        final LinkedList list = new LinkedList(olist);
        assertEquals(list.toArray(), olist);
    }
}