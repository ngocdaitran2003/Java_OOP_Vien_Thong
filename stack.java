class stackOfChars{
    private char[] elements;
    private int size;
    
    public void stackOfChars(){
        this.elements = new char[100];
        this.size = 0;
    }

    public void stackOfChars(int capacity){
        this.size = capacity;
    }

    public boolean isEmpty(){
        if(this.elements.length == 0){
            return true;
        }
        else return false;
    }

    public boolean isFull(){
        //fdfsd
        return false;
    }

}

public class stack {
    public static void main(String[] args) {
        
    }
}
