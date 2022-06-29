package Ejercicios.E5;

public class Carcasa extends Decorator {
    public Carcasa(IPhone phone) {
        super(phone);
    }

    public Integer add() {
        System.out.println("Carcasa a $50");
        return super.add() + 50;
    }
}
