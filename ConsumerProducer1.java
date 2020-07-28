public class ConsumerProducer1 {

    static Integer p;
    static Integer c;
    static int pk;
    static int ck;
    static int capacity;
    static Integer size;
    final static ConsumerProducer1 cp = new ConsumerProducer1();
    static Thread producer;
    static Thread consumer;
    static int produce = 0;
    static int consume = 0;

    public void produce(int id) throws InterruptedException {
        synchronized (this) {
            if (size < capacity) {
                size += pk;
                ++produce;
                System.out.println("Producer"+id+" produces " + pk + " items");
            }

            if (size >= ck) {
                notify();

                while (size >= ck || size >= capacity) {
                    System.out.println("Buffer is full.. waiting for consumers");
                    wait();
                }
            }

            Thread.sleep(1000);
        }
    }

    public void consume(int id) throws InterruptedException {
        synchronized (this) {
            if (size >= ck) {
                size -= ck;
                ++consume;
                System.out.println("Consumer"+id+" consumes " + ck + " items");
            }

            while (size < ck) {
                notify();

                System.out.println("Buffer does not have enough items.. waiting for producers");
                wait();
            }

            Thread.sleep(1000);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        p = 10;
        c = 10;
        pk = 2;
        ck = 3;
        size = 0;
        capacity = 10;

        producer = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    for (int i = 0; i < p; i++) {
                        try {
                            cp.produce(i+1);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        consumer = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    for (int i = 0; i < c; i++) {
                        try {
                            cp.consume(i+1);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();
    }
}