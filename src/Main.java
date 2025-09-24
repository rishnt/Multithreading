public class Main {
    public static void main(String[] args) throws InterruptedException {

        SharedResource resource = new SharedResource();

        Thread producerThread = new Thread(new Producer(resource));
        Thread consumerThread = new Thread(new Consumer(resource));

        for(int i=0;i<5;i++) {
            producerThread.start();
            consumerThread.start();

            producerThread.join();
            consumerThread.join();
        }
    }
}