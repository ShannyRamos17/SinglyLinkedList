public class App {
    public static void main(String[] args) throws Exception {
        SinglyLinkedList list = new SinglyLinkedList();
        list.printList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.printList();
        list.remove(3);
        list.contains(1);
        System.out.println(list.contains(5));
        int suma = list.contador(5);
        System.out.println("Tienes " + suma  + " veces, el numero 5 "); 
        list.printList();
    }
}
