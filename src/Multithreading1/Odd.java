package Multithreading1;

public class Odd implements Runnable{
    resource res;

    Odd(resource res){
        this.res = res;
    }
    @Override
    public void run() {
res.printOdd();
    }
}
