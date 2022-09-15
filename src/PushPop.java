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
        top ++;
        arr[top] = data;

    }
    public int pop(){
        int data = arr[top];
        top--;
        return data;

    }
}
