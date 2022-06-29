package Ejercicios.E5;

public class VidrioTemplado extends Decorator{
    public VidrioTemplado(IPhone phone) {
        super(phone);
    }
    
    public Integer add() {
        System.out.println("Vidrio templado a $100");
        return super.add() + 100;
    }
}
