
public class Queue<T> {
    private Node<T> end;
    
    public Queue(){
        end = null; // what should end be initialized to?
        
    }

    // Replace ??? with the proper return type
    // Add parameters with valid types, if necessary
    public void enqueue(T item){
        // create new Node with provided data
        // set new Node's next to current end
        // set end to new Node
        Node<T> temp = new Node<>(item);
        temp.setNext(end);
        end.getData().equals(temp);
    }

    // Replace ??? with the proper return type
    // Add parameters with valid types, if necessary
    public T dequeue(T item){
        // if Queue is empty
        //      return null
        // if it has only one item
        //      get data from end
        //      set end to null
        //      return data
        // else
        //      create cursor Node
        //      loop: move cursor until it reaches 2nd to last Node
        //          There are two ways to do this
        //          - check for cursor's next Node's next to be null
        //          - add a counter to the Queue class and use it
        //      Once cursor is pointing to 2nd to last Node
        //      get its data
        //      set its next to null
        //      return data
        if (isEmpty()){
            return(null);

        } if (cursor.getNext().equals(null)){
            end.getData();
            end = null;
            return(end.getData());
        } else {
            Node<T> cursor = new Node<>(item);

        }
    }

    // Replace ??? with the proper return type
    // Add parameters with valid types, if necessary
    public T look(){
        // if Queue is empty
        //       return null
        // otherwise
        //      create cursor Node
        //      move cursor to last Node
        //      get cursor's data
        //      return data
        if (isEmpty()){
            return(null);
        } else {
            int count = 0;
            Node<T> cursor = new Node<>();
            while ( cursor != null){
                count++;
                cursor.getNext();
                cursor.getData();
            }
            return(cursor.getData());
        }
    }

    // Replace ??? with the proper return type
    // Add parameters with valid types, if necessary
    public void clear(){
        end = null;// TODO
    }

    // Replace ??? with the proper return type
    // Add parameters with valid types, if necessary
    public boolean isEmpty(){
        if (isEmpty()){
        return(true);// TODO
        } else {
            return(false);
        }
    }    

    public String toString(){
        String output = "";
        if (isEmpty()){
            return(output + "");
        }else{
            Node<T> cursor = end;
            while (cursor.getNext() != null){
                output += cursor.getData().toString() + " ";
            }
        return(output + "");    
        }
    }
}