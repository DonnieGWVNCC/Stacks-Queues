public class Main{
    public static void main(String[] args) {
        testStack();
        testQueue();
    }

    public static void testStack(){
        Stack<String> myStack = new Stack<>();
        myStack.push("Luke");
        myStack.push("Leia");
        myStack.push("Yoda");
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }

    public static void testQueue(){
        Queue<String> myQueue = new Queue<>();
        myQueue.enqueue("Luke");
        myQueue.enqueue("Leia");
        myQueue.enqueue("Yoda");
        System.out.println(myQueue.look());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
    }
}