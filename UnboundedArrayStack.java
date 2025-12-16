/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UnboundedArrayStack;

/**
 *
 * @author Prabashi
 */
/*
 * Unbounded Array Stack
 * Dynamically increases and decreases size
 */
public class UnboundedArrayStack {

    private int[] stackArray;
    private int topIndex;

    public UnboundedArrayStack() {
        stackArray = new int[2]; // initial capacity
        topIndex = -1;
    }

    // PUSH operation
    public void push(int value) {
        if (topIndex == stackArray.length - 1) {
            resize(stackArray.length * 2);
        }

        stackArray[++topIndex] = value;
        System.out.println("Pushed: " + value);
    }

    // POP operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }

        int poppedElement = stackArray[topIndex--];
        System.out.println("Popped: " + poppedElement);

        // Shrink array if needed
        if (topIndex > 0 && topIndex == stackArray.length / 4) {
            resize(stackArray.length / 2);
        }

        return poppedElement;
    }

    // TOP operation
    public int top() {
        if (isEmpty()) {
            return -1;
        }
        return stackArray[topIndex];
    }

    // EMPTY check
    public boolean isEmpty() {
        return topIndex == -1;
    }

    // Resize helper
    private void resize(int newCapacity) {
        int[] newArray = new int[newCapacity];
        for (int i = 0; i <= topIndex; i++) {
            newArray[i] = stackArray[i];
        }
        stackArray = newArray;
        System.out.println("Resized stack to capacity: " + newCapacity);
    }

    public static void main(String[] args) {
        UnboundedArrayStack stack = new UnboundedArrayStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.pop();
        stack.pop();
        stack.pop();
    }
}

