package creational.singleton;

public class Main {

    public static void main(String[] args) {
        
        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep(1 * 1000);
                    Database database = Database.getInstance();
                    System.out.println(Thread.currentThread().getName() + " "+ database);
                } catch (InterruptedException e) {
                   System.out.println("some error");
                }
            }
            
        }).start();

        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep(1 * 1000);
                    Database database = Database.getInstance();
                    System.out.println(Thread.currentThread().getName() + " "+ database);
                } catch (InterruptedException e) {
                   System.out.println("some error");
                }
            }
            
        }).start();
    }
}
