public class SharedResource {

    boolean available = false;
   public synchronized void produceItem() {
       if (available) {
           while (available) {
               try {
                   wait();
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
       }
       else{
              available = true;
              System.out.println("Produced an item");
              notify();
              // notify that an item is produced
       }
   }

    public synchronized void consumeItem(){

        if (!available) {
            while (!available) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        else{
            available = false;
            System.out.println("Consumed an item");
            notify();
            // notify that an item is consumed
        }
    }

}
