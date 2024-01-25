/*
    Modify this to use a generic type and the generic Node
*/

public class Stack<T>{
    private Node<T> top;

    public Stack(){
        top = null; // What should top be initialized to?
                    
    }

    // Replace ??? with the proper return type
    // Add parameters with valid types, if necessary
    public void push(T item){
        // Create new node with provided data parameter
        // Set new Node's next to current top
        // Set top to new Node
        Node<T> temp = new Node<>(item);
        temp.setNext(top);
        top.getData().equals(temp);
    }

    // Replace ??? with the proper return type
    // Add parameters with valid types, if necessary
    public T pop(){
        // if stack is empty
        //      return null
        // else
        //      Get data from top Node, assign to variable
        //      Move top to top's next pointer
        //      return the data
        if (isEmpty()){
            return(null);
        } else {
            
            Node<T> cursor = top;
            cursor.getData();
            top = top.getNext();
            return(cursor.getData());
        }
    }

    // Replace ??? with the proper return type
    // Add parameters with valid types, if necessary
    public T peek(){
         // if stack is empty
        //      return null
        // else
        //      Get data from top Node, assign to variable
        //      return the data
        if (isEmpty()){
            return(null);
        } else {
           Node<T> cursor = top;
           cursor.getData();
           return(cursor.getData());
         }
    }

    // Replace ??? with the proper return type
    // Add parameters with valid types, if necessary
    public boolean isEmpty(){
        // if stack is empty
        //      return true
        //  else
        //      return false
        if (isEmpty()){
            return(true);
        } else {
            return(false);
        }
    }

    public String toString(){
        String output = "";
        if (isEmpty()){
            return(output + "");
        }else{
            Node<T> cursor = top;
            while (cursor.getNext() != null){
                output += cursor.getData().toString() + " ";
            }
        return(output + "");    
        }
    }
}