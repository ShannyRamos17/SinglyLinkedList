public class SinglyLinkedList {
    private Node head;

    public void add(int data){
        //crecion del nodo
        Node newNode = new Node(data);
        //verificacion si la lista esta vacia, entonces el nuevo nodo es la cabeza
        if (head == null) {
            head = newNode;
            return;
        }

        //si no esta vacia, recorremos todos los nodos hasta encontrar el que tenga la referencia (next)
        Node current = head;
        //vamos recorriendo los nodos,hasta que la referencia (next) sea didferente de null
        //si la referencia
        while (current.next!=null) {
          current= current.next;  
        }
        //se agrega el nuevo nnodo en la referencia del ultimo nodo
        current.next=newNode;
    }

    public boolean contains(int data){
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int contador(int data) {
    int contador = 0;
    Node current = head;
    while (current != null) {
        if (current.data == data) {
            contador++;
        }
        current = current.next; 
    }

    return contador;
}



    public void printList(){
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("null");
    }

    public void remove(int data){
        if(head == null)return;
        if(head.data == data){
            head = head.next;
        }
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        //para eliminar no el que sigue,si no,el que sigue del que sigue
        current.next = current.next.next;
    }


}
