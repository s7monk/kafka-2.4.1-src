package kafka.examples;

/**
 * @author s7monk
 * @date 2021/3/11 11:36
 */
public class KafkaConsumerDemo {

    public static void main(String[] args) {
        Consumer consumerThread = new Consumer(KafkaProperties.TOPIC);
        consumerThread.start();
    }
}
