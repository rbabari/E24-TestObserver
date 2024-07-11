import java.util.ArrayList;
import java.util.List;

public class MessagePublisher1 implements Subject{
   List<Observer> observers = new ArrayList<>();
    public int getNumberOfObservers() {
        return observers.size();
    }
    /**
     * @param o
     */
    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    /**
     * @param o
     */
    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    /**
     * @param msg
     */
    @Override
    public void notifyUpdate(Message msg) {
        for (Observer o : observers) {
            o.update(msg);
        }
    }
}
