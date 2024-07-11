/**
 * Observer1
 */
public class MessageSubscriber2 implements Observer {

    /**
     * @param msg
     */
    @Override
    public void update(Message msg) {
        System.out.println("Messagesubscriber2 : " + msg.getMessageContent());

    }
}
