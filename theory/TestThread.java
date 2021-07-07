package theory;

public class TestThread extends Thread{
    public static void main(String[] args) throws Exception{
        Thread th = new TestThread();

        th.start();
    }
    public void run(){
        for(int i=0; i<5;i++){
            System.out.println(i);

        }
    }
}
