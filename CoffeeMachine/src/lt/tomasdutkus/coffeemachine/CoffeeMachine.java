package lt.tomasdutkus.coffeemachine;

public class CoffeeMachine {

    private int water;
    private int milk;
    private int coffeeBeans;
    private int disposableCups;
    private int money;

    public CoffeeMachine(int water, int milk, int coffeeBeans, int disposableCups, int money) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.disposableCups = disposableCups;
        this.money = money;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public int getDisposableCups() {
        return disposableCups;
    }

    public int getMoney() {
        return money;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public void setCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }

    public void setDisposableCups(int disposableCups) {
        this.disposableCups = disposableCups;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public static void showMenu(CoffeeMachine coffeeMachine) {
        System.out.println("The coffee machine has:\n"
                + coffeeMachine.getWater() + " of water\n"
                + coffeeMachine.getMilk() + " of milk\n"
                + coffeeMachine.getCoffeeBeans() + " of coffee beans\n"
                + coffeeMachine.getDisposableCups() + " of disposable cups\n"
                + coffeeMachine.getMoney() + " of money\n");
    }
}
