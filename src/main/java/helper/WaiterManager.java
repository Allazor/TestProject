package helper;


public class WaiterManager {
    public static void pause (int sec){
        try {
            Thread.sleep(sec * 1000L);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
