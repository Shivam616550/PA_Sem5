
class stack_impliment1 {

    public int[] arr;
    public int size;
    public int top = 0;

    stack_impliment1(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    public void push(int number) {
        if (top < size - 1) {
            arr[++top] = number;
        } else {
            System.out.println("Stakc is full");
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow---not enough elements");
            return -1;
        } else {
            // Fixed: Save the value, clear the slot, and decrement 'top' using top--
            int a = arr[top];
            arr[top] = 0;
            top--; // Critical step: move the pointer down
            return a;
        }
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return arr[top];
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(arr[i]).append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        stack_impliment1 st = new stack_impliment1(10);
        st.push(5);
        st.push(10);
        st.push(15);
        st.push(20);

        System.out.println(st);
        System.out.println(st.pop());

        System.out.println(st);
        System.out.println(st.peek());

    }
}
