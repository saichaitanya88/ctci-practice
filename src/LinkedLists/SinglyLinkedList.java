package LinkedLists;

public class SinglyLinkedList{
    public int data;
    public SinglyLinkedList next;

    public static SinglyLinkedList getLast(SinglyLinkedList node){
        if(node.next == null){
            return node;
        }
        return getLast(node.next);
    }

    public static SinglyLinkedList newList(int size){
        SinglyLinkedList list = new SinglyLinkedList(nextNum());
        for(int i = 0; i < size; i ++){
            SinglyLinkedList.getLast(list).next = new SinglyLinkedList(nextNum());
        }
        return list;
    }
    public static void printList(SinglyLinkedList list){
        SinglyLinkedList node = list;
        while(node.next != null){
            System.out.print("" + node.data + " -> ");
            node = node.next;
        }
        System.out.println("");
    }
    public static int nextNum(){
        return (int)(Math.random() * 10) + 1;
    }

    public SinglyLinkedList(int d){
        data = d;
    }
}