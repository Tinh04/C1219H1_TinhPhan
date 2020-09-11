package B6_DataStructureAndAlgorithmBasic.Practices.DeloyingLinkedListBasicClass;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList(10);
        linkedList.addFirst(11);
        linkedList.addFirst(12);
        linkedList.addFirst(13);

        linkedList.add(2, 5);
        linkedList.add(4, 9);
        linkedList.printList();
    }
}
