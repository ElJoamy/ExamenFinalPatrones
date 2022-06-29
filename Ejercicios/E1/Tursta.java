package Ejercicios.E1;

public class Tursta implements IUser{
    private String name;
    private int money;
    private String ci;

    public Tursta(String name, int money, String ci) {
        this.name = name;
        this.money = money;
        this.ci = ci;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public void pay(LaPaz laPaz) {
        if(money > 0){
            System.out.println("Money actual: " + money);
            int cantidad = (int) (Math.random() * (100 - 1)+1);
            if(cantidad < money){
                int nMoney = money - cantidad;
                setMoney(nMoney);
            
        }
    }

    @Override
    public void pay(Cochabamba cochabamba) {
        if(money > 0){
            System.out.println("Money actual: " + money);
            int cantidad = (int) (Math.random() * (100 - 1)+1);
            if(cantidad < money){
                int nMoney = money - cantidad;
                setMoney(nMoney);
            
        }
    }

    @Override
    public void pay( SantaCruz santaCruz) {
        if(money > 0){
            System.out.println("Money actual: " + money);
            int cantidad = (int) (Math.random() * (100 - 1)+1);
            if(cantidad < money){
                int nMoney = money - cantidad;
                setMoney(nMoney);
            
        }
    }
    
}
