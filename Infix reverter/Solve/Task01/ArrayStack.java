public  class ArrayStack implements Stack{
    int size;
    int top;
    Character [] data;

    public ArrayStack(){
        size = 0;
        top =  -1;
        data = new Character[30];
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

    public void push(Character e) {
        top= top+1;
        data[top]= e;
        size++;
    }


    public Character pop(){
        Character temp = data[top];
        data[top]= null;
        top--;
        size--;
        return temp;
    }


    public Character peek() {

        Character temp = data[top];
        return temp;
    }



    public Character[] toArray(){
        Character []newArray = new Character[size];
        int j = newArray.length -1;
        for(int i = top ; i>= 0; i--){
            newArray[j]=data[i];
            j--;
        }

        return newArray;
    }
}

