/**
 * Observer1
 */
public class MessageSubscriber4 implements Observer {

    /**
     * @param msg
     */
    @Override
    public void update(Message msg) {
        System.out.println("Messagesubscriber4 : " + msg.getMessageContent());

    }
}
