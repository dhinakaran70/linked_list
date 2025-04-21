package singlyWithGUI;

public class nod_body {
    nod head;
    public void add(int data) {
        nod newNode = new nod (data);
        if (head == null) {
            head = newNode;
            return;
        }
        nod  current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void delete(int key) {
        if (head == null) return;

        if (head.data == key) {
            head = head.next;
            return;
        }

        nod  current = head;
        while (current.next != null && current.next.data != key) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        nod  current = head;
        while (current != null) {
            sb.append(current.data).append(" -> ");
            current = current.next;
        }
        sb.append("null");
        return sb.toString();
    }
}
