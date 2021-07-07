package theory;

public class TestGame extends Thread{
    public void run(){
        while(true){
            System.out.println("From Thread 1");
            try{
                sleep(200);
            }catch(Exception e){

            }
        }
    }
}

