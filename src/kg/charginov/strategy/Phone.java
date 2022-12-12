package kg.charginov.strategy;

public class Phone {
    private String number;
    private int balance;
    private int probability;

    private State state;

    public Phone(String number, int balance, int probability) {
        this.number = number;
        this.balance = balance;
        this.probability = probability;
    }

    public void call(){
        state.call(this);
    }

    public void replenishBalance(int money){
        balance+=money;
        System.out.println("Пополнение баланса на " + money + ". Текущий баланс: " + balance);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        if(balance<=0){
            this.state = new BlockedPhone();
        }else if(state instanceof WaitingPhone)
            this.state = new CallingPhone();
        else if(state instanceof CallingPhone){
            this.state = new ConversationPhone();
        }
    }

    public void pickUpCall(){
    }

    public void endCall(){
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getProbability() {
        return probability;
    }

    public void setProbability(int probability) {
        this.probability = probability;
    }
}
