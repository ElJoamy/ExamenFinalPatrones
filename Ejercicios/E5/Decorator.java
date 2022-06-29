package Ejercicios.E5;

public abstract class Decorator implements IPhone {
    private IPhone phone;

    public Decorator(IPhone phone) {
        this.phone = phone;
    }

    public Integer add(){
        return phone.add();
    }
}
