package kg.charginov.strategy;

public class CallingPhone implements State{
    @Override
    public void call(Phone phone) {
        System.out.println(phone.getNumber() + " в состоянии звонка...");
    }
}
