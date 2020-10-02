package edu.escuelaing.arep;

/**
 * Tipo de objeto donde se guardaran los datos
 * Posee el valor y el nodo siguiente para su uso en la LinkedList
 */
public class Node
{
    private Double value;
    private Node nextNode;

    /**
     * Constructor
     * @param n donde n representa el numero real a asignar al nodo
     */
    public Node(Double n){
        this.value = n;
        this.nextNode = null;
    }

    /**
     * Consulta el nodo adyacente al actual
     * @return nodo adyacente
     */
    public Node getNextNode(){
        return nextNode;
    }

    /**
     * Modifica el nodo adyacente
     * @param node nodo a modificar
     */
    public void setNextNode(Node node){
        nextNode = node;
    }

    public Double getValue(){
        return value;
    }

    public void setValue(Double n){
        value = n;
    }
    @Override
    public String toString() {
        return "Valor: " + value + " Siguiente Nodo: " + nextNode;
    }

}