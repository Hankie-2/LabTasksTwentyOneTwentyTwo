package kg.charginov.strategy;

public class BlockedPhone implements State{
    @Override
    public void call(Phone phone) {
        System.out.println(phone.getNumber() + " в состоянии блокировки...");
    }
}
