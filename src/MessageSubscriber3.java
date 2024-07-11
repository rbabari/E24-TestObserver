/**
 * Observer1
 */
public class MessageSubscriber3 implements Observer {

    /**
     * @param msg
     */
    @Override
    public void update(Message msg) {
        System.out.println("Messagesubscriber3 : " + msg.getMessageContent());

    }
}
