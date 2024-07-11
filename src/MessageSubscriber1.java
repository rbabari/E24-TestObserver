/**
 * Observer1
 */
public class MessageSubscriber1 implements Observer {

    /**
     * @param msg
     */
    @Override
    public void update(Message msg) {
        System.out.println("Messagesubscriber1 : " + msg.getMessageContent());

    }
}
