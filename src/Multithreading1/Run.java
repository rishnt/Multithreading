package Multithreading1;

public class Run {
    public static void main(String[] args) throws InterruptedException{

resource res = new resource();
Thread evenThread = new Thread(new Even(res));
Thread oddThread = new Thread(new Odd(res));

evenThread.start();
oddThread.start();
    }
}
