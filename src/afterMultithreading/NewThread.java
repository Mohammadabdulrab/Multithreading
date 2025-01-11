package afterMultithreading;

public class NewThread extends Thread {
    NewThread(){
        start();
    }
    public void run(){
        try{
            System.out.println("Part 2");
            for(int j=10;j>0;j--){
                System.out.println("j is :"+j);
            }
            Thread.sleep(500);
        }catch(Exception e1){
            System.out.println("Exception Occured :"+e1.getMessage());
        }
    }
}
