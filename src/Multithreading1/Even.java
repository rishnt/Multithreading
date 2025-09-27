package Multithreading1;

public class Even implements Runnable{
    resource res;

    Even(resource res){
        this.res = res;
    }
    @Override
    public void run() {
        try{
            while(true) {
                res.printEven();
                if (res.number > 10) break;
            }
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

    }
}
