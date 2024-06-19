package datastructures;
class LinkedList{
	Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
public static LinkedList insert(LinkedList List,int data){
	Node new_node = new Node (data);
	if(List.head == null) {
		List.head = new_node;
	}else {
Node last = List.head;
while(last.next != null) {
	last = last.next;
	
		}
last.next = new_node;
	} 
	return List;
}

public static void printList(LinkedList list) {
Node currNode = list.head;
System.out.println("LinkedList:");
while (currNode != null) {
	System.out.println(currNode.data + " ");
	currNode = currNode.next;
}}}
public class Test11 {
	public static void main(String[] args) {
LinkedList list = new LinkedList();
list = list.insert(list,10);
list = list.insert(list,20);
list = list.insert(list,30);
list = list.insert(list,40);
list = list.insert(list,50);
list = list.insert(list,60);
list = list.insert(list,70);
list = list.insert(list,80);
list = list.insert(list,90);
list = list.insert(list,100);
list.printList(list);
	}}
