package kg.charginov.strategy;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Phone phone = new Phone("0702164823",1000,80);
        phone.setState(new WaitingPhone());
        phone.call();
        phone.call();
//        phone.setBalance(1000);
        phone.setState(new CallingPhone());
        phone.call();
        phone.setState(new ConversationPhone());
        phone.call();
    }
}
