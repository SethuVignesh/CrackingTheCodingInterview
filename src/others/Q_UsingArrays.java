package others;

class Test {
    public static void main(String[] args) {
        Q_UsingArrays q = new Q_UsingArrays(5);
        q.enque(1);
//        q.traverse();
        q.enque(2);
//        q.traverse();
        q.enque(3);
//        q.traverse();
        q.enque(4);
//        q.traverse();
        q.enque(5);
//        q.traverse();
        q.enque(6);
        q.traverse();
        q.deque();
        q.traverse();
        q.deque();
        q.traverse();
        q.deque();
        q.traverse();
        q.deque();
        q.traverse();
        q.deque();
        q.traverse();


    }
}

public class Q_UsingArrays {
    int size;
    int[] arr;
    int front = 0;
    int rear;
    int capacity;

    Q_UsingArrays(int size) {
        this.capacity = size;
        arr = new int[capacity];
        rear = capacity - 1;
        this.size = 0;
        front = 0;
    }

    //crud
    public boolean enque(int data) {
        if (isFull()) {
            System.out.println("\nQ is full");
            return false;
        } else {
            rear = (rear + 1) % capacity;
            arr[rear] = data;
            size++;
            return true;
        }

    }

    public int deque() {
        if (isEmpty()) {
            return -1;
        } else {
            int data = arr[front];
            arr[front] = 0;
            front = (front + 1) % capacity;
            return data;
        }
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean isFull() {
        if (this.size == this.capacity) return true;
        return false;
    }

    public void traverse() {

        System.out.println("\nQ structure\n");
        int count = size;
        int start = front;
        if (!isEmpty()) {
            while (count != 0) {
                System.out.print(arr[start % capacity] + "---->");
                start++;
                count--;
            }
        }
    }
}
