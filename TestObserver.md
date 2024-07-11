classDiagram
direction BT
class Main {
  + Main() 
  + main(String[]) void
}
class Message {
  + Message(String) 
  ~ String messageContent
   String messageContent
}
class MessagePublisher1 {
  + MessagePublisher1() 
  + detach(Observer) void
  + notifyUpdate(Message) void
  + attach(Observer) void
   int numberOfObservers
}
class MessageSubscriber1 {
  + MessageSubscriber1() 
  + update(Message) void
}
class MessageSubscriber2 {
  + MessageSubscriber2() 
  + update(Message) void
}
class MessageSubscriber3 {
  + MessageSubscriber3() 
  + update(Message) void
}
class MessageSubscriber4 {
  + MessageSubscriber4() 
  + update(Message) void
}
class Observer {
<<Interface>>
  + update(Message) void
}
class Subject {
<<Interface>>
  + attach(Observer) void
  + notifyUpdate(Message) void
  + detach(Observer) void
}

MessagePublisher1  ..>  Subject 
MessageSubscriber1  ..>  Observer 
MessageSubscriber2  ..>  Observer 
MessageSubscriber3  ..>  Observer 
MessageSubscriber4  ..>  Observer 
