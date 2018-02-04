package LinkedLists;

public class GetNthFromLastNode {
    public static void main(String[] args){
        SinglyLinkedList list = SinglyLinkedList.newList(15);
        SinglyLinkedList.printList(list);
        list = getNthFromLast(list, 4);
        SinglyLinkedList.printList(list);
    }

    public static SinglyLinkedList getNthFromLast(SinglyLinkedList root, int n){
        SinglyLinkedList current = root;
        SinglyLinkedList runner = root.next;
        // set runner position
        for(int i = 0; i < n; i++){
            if (runner == null)
                return current;
            else
                runner = runner.next;
        }
        // traverse till end
        while(runner != null){
            runner = runner.next;
            current = current.next;
        }
        // this is the nth element from the end
        return current;
    }
}
