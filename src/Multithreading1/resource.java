package Multithreading1;

public class resource {

public static int number = 1;
public synchronized void printOdd() throws InterruptedException {
    try {
        while (number % 2 == 0 && number <= 10) {
            wait();
        }
        if(number<=10) {
            System.out.println("OddThread: " + number);
            number++;
            notify();
        }
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
    public synchronized void printEven() throws InterruptedException{
        try {
            while (number % 2 != 0 && number <= 10) {
                wait();
            }
            if(number<=10){
            System.out.println("EvenThread: " + number);
            number++;
            notify();}
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

