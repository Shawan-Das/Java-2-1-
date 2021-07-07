package Lab_class.Class_10;

import java.util.ArrayList;
import java.util.Random;

public class Problem_3 {
    public static class TestThread extends Thread{
        public static ArrayList<Integer> list = new ArrayList<Integer>();
        public static int Sum = 0;
        TestThread(String str){
            setName(str);
            start();
        }
        public void run(){
            Random rand = new Random();
            for(int i=0; i<4; i++){
                synchronized (list){
                    list.add(rand.nextInt(10));
                }
            }
        }
    }

    public static void main(String[] args){
        Thread test1 = new TestThread("test_1");
        Thread test2 = new TestThread("test_2");
        Thread test3 = new TestThread("test_3");
        try{
            test1.join();
            test2.join();
            test3.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(TestThread.list);
        for(int i= 0; i<TestThread.list.size();i++){
            TestThread.Sum += TestThread.list.get(i);
        }
        System.out.println("Summation ="+TestThread.Sum);
        System.out.println("Average ="+TestThread.Sum/TestThread.list.size());
    }
}
