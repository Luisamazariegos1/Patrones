public class ConcreteSubject implements Observer {
    private String name;
    private String receivedMessage;

    public ConcreteSubject(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.receivedMessage = message;
        System.out.println(name + " received: " + message);
    }

    public String getReceivedMessage() {
        return receivedMessage;
    }
}
