package Multithreading1;

public class Even implements Runnable{
    resource res;

    Even(resource res){
        this.res = res;
    }
    @Override
    public void run() {
        res.printEven();
    }
}
