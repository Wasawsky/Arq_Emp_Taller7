package edu.escuelaing.arep;

/**
 * Estructura de datos encadenada por nodos
 */
public class LinkedList 
{
    private Node firstNode;
    private Node lastNode;

    public LinkedList() {
        this.firstNode = null;
        this.lastNode = null;
    }

    /**
     * Constructor que permite construir una LinkedList apartir de un array con valores de tipo Double
     * @param array donde estan los elementos que queremos convertir a LinkedList
     */
    public LinkedList(Double[] array){
        for (int i=0;i<array.length;i++){
            this.add(array[i]);
        }
    }

    /**
     * Agrega un nuevo nodo a la LinkedList
     * @param n el valor que tendra el nuevo nodo
     */
    public void add(Double n){
        Node t = new Node(n);
        if (this.isEmpty()){
            t.setNextNode(t);
            this.firstNode = this.lastNode = t;
        }else{
            this.lastNode.setNextNode(t);
            this.lastNode = t;
            this.lastNode.setNextNode(this.firstNode);
        }
    }

    /**
     * Permite consultar el tamaño de la LinkedList
     * @return un entero que indica el tamaño de la Linkedlist
     */
    public int size(){
        int length = 1;
        Node temp = firstNode;
        while (temp.getNextNode()!=lastNode.getNextNode()){
            length++;
            temp=temp.getNextNode();
        }
        return length;
    }

    /**
     * Permite eliminar un nodo en la LinkedList
     * @param node el nodo que se quiere eliminar de la estructura
     */
    public void remove(int node){
        Node temp = firstNode;
        int flag = 1;
        while (flag<=node){
            if(flag==node-1){
                temp.setNextNode(temp.getNextNode().getNextNode());
            }else{
                temp=temp.getNextNode();
            }
            flag++;
        }
    }

    /**
     * Este metodo permite pasar de una LinkedList a representarla en un arreglo 
     * @return Un arreglo con los valores que pertenecen a la LinkedList
     */
    public Double[] toArray(){
        Node temp = firstNode;
        Double[] array = new Double[this.size()];
        for (int i = 0; i<this.size();i++){
            array[i] = temp.getValue();
            temp=temp.getNextNode();
        }
        return array;
    }

    /**
     * Permite saber si la LinkedList esta vacia o no
     * @return boolean Si esta vacia o no
     */
    public boolean isEmpty(){
        return firstNode == lastNode && lastNode == null;
    }

    /**
     * Permite visualizar la LinkedList
     */
    public void preview(){
        Node temp = firstNode;
        for (int i = 0; i<this.size();i++){
            System.out.println(temp.getNextNode().getValue());
            temp=temp.getNextNode();
        }
    }

    public Node getFirstNode() {
        return firstNode;
    }

    public void setFirstNode(Node firstNode) {
        this.firstNode = firstNode;
    }

    public Node getLastNode() {
        return lastNode;
    }

    public void setLastNode(Node lastNode) {
        this.lastNode = lastNode;
    }
    
    @Override
    public String toString() {
        return "Primer Nodo: " + firstNode.getValue() + " Ultimo Nodo: " + lastNode.getValue();
    }
}

