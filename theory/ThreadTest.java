package theory;

public class ThreadTest extends Thread{
    public static void main(String[] args) throws Exception{
        Thread th = new ThreadTest();

        th.start();
    }
        public void run(){
            for(int i=0; i<5;i++){
                System.out.println(i);

            }
        }
}
