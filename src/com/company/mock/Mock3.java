package com.company.mock;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}



public class Mock3 {

    public static Node findMiddleNode(Node node){
           //1-2-3-4-5
        if(node==null){
            return null;
        }

        Node slowPointer = node; // 1
        Node fastPointer = node; // 1

        while(fastPointer.next!=null && fastPointer.next.next!=null){
            slowPointer = slowPointer.next;//3
            fastPointer = fastPointer.next.next;//5
        }

        return slowPointer;
    }



    public static void main(String[] args) {
       System.out.println(findMiddleNode(createLinkedList(4)).data);
    }

    public static Node createLinkedListAddAtStart(int size){

        Node head = null;

        for(int i=1;i<=size;i++){
            Node newNode = new Node(i);

                newNode.next = head;
                head = newNode;

        }

        return head;
    }
    public static Node createLinkedList(int size){
        Node head = null;//1
        Node tail = null;
        for(int i=1;i<=size;i++){

            Node newNode = new Node(i);
            //Head -> 1-2-3
            if(i==1){
                head = newNode; //1
                tail = newNode; //1
            }
            else{
                tail.next = newNode; // 1-2-3
                tail = newNode; // 3

            }
        }

        return head;
    }

}
