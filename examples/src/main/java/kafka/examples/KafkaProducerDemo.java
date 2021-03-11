package kafka.examples;

/**
 * @author s7monk
 * @date 2021/3/11 11:34
 */
public class KafkaProducerDemo {

    public static void main(String[] args) {
        boolean isAsync = false;
        Producer producerThread = new Producer(KafkaProperties.TOPIC, isAsync);
        producerThread.start();
    }
}
