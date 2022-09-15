public class PushPop {
    private static PushPop pushpop =null;
    private int []arr;
    private int size;
    private int top;

    private PushPop(int size) {
        this.size = size;
        top = -1;
        arr = new int[size];
    }



    public static PushPop getInstance(int size){
        if(pushpop == null){
            pushpop=new PushPop(size);
        }
        return pushpop;
    }

    public void push(int data){
        if(size-1 > top){
        top ++;
        arr[top] = data;}
        else{
            System.out.println("Stack is full");
        }

    }
    public void pop(){
        if (-1<top){
        int data = arr[top];
        top--;
        System.out.println(data);}
        else{
            System.out.println("Stack is empty now...");
        }

    }
}
