public class Main {
    public static void main(String[] args) {
// Créer des observateurs
   Observer s1 = new MessageSubscriber1();
   Observer s2 = new MessageSubscriber2();

// Créer Observable
   MessagePublisher1 p1 =new MessagePublisher1();
   // Créer Observable
        MessagePublisher1 p2 =new MessagePublisher1();
// l'observateur s1 s'inscrit au publisher p1
   p1.attach(s1);
   p1.attach(s2);
        System.out.println("Nombre d'observateur : " + p1.getNumberOfObservers());
   p1.notifyUpdate(new Message("Premier Message"));

   //p1.detach(s2);

   p1.notifyUpdate(new Message("Deuxieme Message"));

   p2.attach(s2);
   p2.notifyUpdate(new Message("Premier Message du diffuseur 2"));

    }
}