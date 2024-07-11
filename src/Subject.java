/**
 * Subject / Publisher du message / Difuseur de message / Observable
 */
public interface Subject {
    public void attach(Observer o);
    public void detach(Observer o);
    public void notifyUpdate(Message msg);

}
