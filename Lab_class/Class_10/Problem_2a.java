package Lab_class.Class_10;
public class Problem_2a {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(new Thread1(), "Even Thread");
        Thread t2 = new Thread(new Thread2(), "Odd Thread");

        t1.start(); t1.join();
        t2.start();
    }

    public static class Thread1 implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 20; i++) {
                if (i % 2 == 0) {
                    System.out.println(Thread.currentThread().getName() +" "+i);
                }
            }
        }
    }

    public static class Thread2 implements Runnable {
        @Override
        public void run() {
            for(int i=1;i<=20;i++){
                if(i%2!=0){
                    System.out.println(Thread.currentThread().getName()+" "+i);
                }
            }
        }
    }
}
