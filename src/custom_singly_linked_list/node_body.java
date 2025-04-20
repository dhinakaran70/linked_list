package custom_singly_linked_list;
public class node_body {

     node head;

    //this funtion here is used to insert elements
    public void add(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newnode;
    }
//this function is used to display the elements in it

    public  void display() {
        System.out.println("the Inserted elements are...");
        node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

//this function is used to delete elements in it

public void delete(int key){
        if(head==null)return ;

        if(head.data==key){
            head=head.next;
            return;
        }
        node current=head;
        while(current!=null && current.next.data!=key){
            current=current.next;
        }
        if(current.next!=null){
            current.next=current.next.next;
        }



}
}