/*
        * Homework 9 Question 3
        * Author: Deepam Shah (ds3689@rit.edu)
        * Author: Kundan Kumar (kk7272@rit.edu)
        * Version - 5
        * Revision - 4
        * This program has producer producing the goods while the consumer consumes the
        * goods. At one moment consumer can only consume the goods which are available
        * to consume.
        * The program accepts command line in following order:
        * 1) How much can one producer produce?
        * 2) How much can one consumer consume?
        * 3) Total number of Producers
        * 4) Total number of Consumers
        * 5) Storage size
        */

        import java.util.Random;

public class ConsumerProducer {

    static Integer numberProducer;
    static Integer numberConsumer;
    static int producerProduces;
    static int consumerConsumes;
    static Integer available;
    static int storageSize;
    final static ConsumerProducer consumerProducer = new ConsumerProducer();
    static Thread producer[];
    static Thread consumer[];
    static Integer produce = 0;
    static Integer consume = 0;
    static int[] buffer; // ring buffer

    public void produce() throws InterruptedException {
        synchronized (this) {
            if (available < storageSize) {
                String produced = "";
                for (int producing=0; producing<producerProduces; producing++) {
                    int randomInt = new Random().nextInt(100);
                    buffer[(available+producing)%storageSize] = randomInt;
                    produced = produced + " " + randomInt;
                }
                available += producerProduces;
                ++produce;
                System.out.println(Thread.currentThread().getName()
                        +" : produces " + producerProduces + " items - "
                        + produced);
            }

            if (available >= consumerConsumes) {
                notify(); // for consumers
//                System.out.println("Requirement Reached");

                while (available >= storageSize || available >= consumerConsumes) {
                    // when producers wakeup before consumer consumes
//                    System.out.println("Buffer is full.. waiting for consumers");
                    wait(); // producer
                }
            }

            // to observe output
            Thread.sleep(500);
        }
    }

    public void consume() throws InterruptedException {
        synchronized (this) {
            if (available >= consumerConsumes) {

                String consumed = "";
                for (int consuming=1; consuming<=consumerConsumes; consuming++) {
                    consumed = consumed + " " +
                            buffer[(available-consuming)%storageSize];
                }

                available -= consumerConsumes;
                ++consume;
                System.out.println(Thread.currentThread().getName()
                        +" : consumes " + consumerConsumes + " items - "
                        + consumed);
            }

            while (available < consumerConsumes) {
                // if consumers wakeup before producers produce more items

                notify(); // notify producers
                wait();  // consumer
            }

            // to observe output
            Thread.sleep(1000);
        }
    }

    public static void main(String[] args) throws InterruptedException,
            NotAnIntegerException, NegativeNumberException {
        try {
            //taking the value from command line
            producerProduces = Integer.parseInt(args[0]);
            consumerConsumes = Integer.parseInt(args[1]);
            numberProducer = Integer.parseInt(args[2]);
            numberConsumer = Integer.parseInt(args[3]);
            storageSize = Integer.parseInt(args[4]);
        }catch (Exception e) {
            //throwing an exception if the input is not an integer
            throw new NotAnIntegerException();
        }

        if(numberProducer < 0 || producerProduces < 0 || consumerConsumes < 0
                || numberConsumer < 0 || storageSize < 0) {
            //throwing an error if the input is negative integer
            throw new NegativeNumberException();
        }
        //initially available goods to consume
        available = 0;
        buffer = new int[storageSize];

        producer = new Thread[numberProducer];
        for (int i = 0; i < numberProducer; i++) {
            producer[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        while (true) {
                            consumerProducer.produce();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            producer[i].setName("Producer "+(i+1));
            producer[i].start();
        }

        consumer = new Thread[numberConsumer];
        for (int i = 0; i < numberConsumer; i++) {
            consumer[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        while (true) {
                            consumerProducer.consume();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            consumer[i].setName("Consumer "+(i+1));
            consumer[i].start();
        }

        for (int i = 0; i < numberProducer; i++) {
            producer[i].join();
        }

        for (int i = 0; i < numberConsumer; i++) {
            consumer[i].join();
        }
    }
}