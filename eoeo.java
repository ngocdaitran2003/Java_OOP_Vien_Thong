class StackOfInteger{
    private int[] a;
    private int top;
    private int n;
    public StackOfInteger(){
       
    }
    public StackOfInteger(int capacity){
        this.n=capacity;
        a=new int[100];
        top=0;
    }
    public boolean  isEmpty(){
        return top==0;
    }
    public boolean isFull(){
        return top==this.n;
    }
    public int peak(){
        return this.a[top];
    }
    public void push(int value){
        top++;
        if(top<=this.n){
            a[top]=value;
        }
        else{
            System.out.println("Day roi khong day duoc nua dau");
        }
    }
    public int pop(){
        if(top<0) return -1;
        int ans=a[top];
        top--;
        return ans;
    }
    public int getSize(){
        if(this.top>this.n){
            System.out.println("stack da day");
            return -1;
        }
        return this.top;
    }
}
public class eoeo {
    public static void main(String[] args) {
        StackOfInteger x=new StackOfInteger(3);
        System.out.println(x.getSize());
        x.push(5);
        x.push(3);
        System.out.println(x.getSize());
        int res=x.pop();
        System.out.println(res);
        x.push(1);
        x.push(2);
        x.push(4);
        System.out.println(x.isFull());
        System.out.println(x.getSize());
    }
}
