public abstract class Decorator implements IPhone {
    private IPhone phone;

    public Decorator(IPhone phone){
        this.phone = phone;
    }

    public void showInfo(){
        phone.showInfo();
    }

    private IPhone getComponent(){
        return phone;
    }

    @Override
    public Double getMonto() {
        return phone.getMonto();
    }

    @Override
    public void setMonto(Double monto) {
        phone.setMonto(monto);
    }
}