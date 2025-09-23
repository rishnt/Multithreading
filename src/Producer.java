public class Producer implements Runnable{
    SharedResource sharedResource;
    Producer(SharedResource sharedResource){
        this.sharedResource = sharedResource;
    }
    @Override
    public void run() {
      sharedResource.produceItem();
    }
}
