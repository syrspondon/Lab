public class ListStack implements Stack{
    int size;
    Node top;

    public ListStack(){
        size = 0;
        top = null;
    }

    public int size(){
        return size;
    }
    public boolean empty(){
        if (size()==0){
            return true;
        }
        return false;
    }

    public void push(Character e){

        Node myNode = new Node(e,null);
        myNode.next=top;
        top = myNode;
        size++;
    }


    public Character pop(){
        Node myNode = top;
        Character temp = myNode.val;
        top = top.next;
        myNode.val = null;
        myNode.next = null;
        size--;
        return temp;
    }

    public Character peek(){

        Character temp = top.val;
        return temp;
    }

    public Character[] toArray(){
        Character []newArray = new Character[size];
        int i= newArray.length - 1;
        for(Node n=top;n != null; n=n.next,i--){
            newArray[i]=n.val;

        }
        return newArray;
    }
}


