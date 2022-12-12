package kg.charginov.strategy;

public class WaitingPhone implements State{
    @Override
    public void call(Phone phone) {
        System.out.println(phone.getNumber() + " в состоянии ожидания...");
    }
}
