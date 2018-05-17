public class ReverseSLL {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {
        Node head;
        int size;

        private void append(int data) {
            Node node = new Node(data);

            if (head == null) head = node;

            else {
                Node temp = head;
                while (temp.next != null) temp = temp.next;

                temp.next = node;
            }
        }

        private void traverse() {
            System.out.println("Linked List structure");
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "---->");
                temp = temp.next;
            }
        }

        private void reverse() {
            reverse(head);
        }

        private Node reverse(Node head) {
            if (head == null) return null;
            if (head.next == null) {
                this.head = head;
                return head;
            }

            Node prev = head;
            Node curr = prev.next;
            reverse(curr);
            curr.next = prev;
            prev.next = null;
            return prev;

        }
    }


    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
        linkedList.traverse();

        linkedList.reverse();
        linkedList.traverse();

    }
}
