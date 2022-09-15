public class Main {
    public static void main(String []args){
        PushPop pp = PushPop.getInstance(5);
        pp.push(1);
        pp.push(3);
        pp.push(65);
        pp.push(87);
        pp.push(13);
        pp.push(12);
        pp.push(12);
        pp.pop();
        pp.pop();
        pp.pop();
        pp.pop();
        pp.pop();
        pp.pop();
        pp.pop();


    }
}
