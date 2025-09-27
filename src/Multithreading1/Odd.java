package Multithreading1;

public class Odd implements Runnable {
    resource res;

    Odd(resource res) {
        this.res = res;
    }

    @Override
    public void run() {
        try {
            while(true){
                if(res.number > 10) break;
                res.printOdd();

            }

        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }
}
