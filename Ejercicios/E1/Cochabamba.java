package Ejercicios.E1;

public class Cochabamba implements IDpp{
    private String name;
    private int nP;
    private int nH;
    private String clima;
    private double mPT;

    public Cochabamba(String name, int nP, int nH, String clima, double mPT) {
        this.name = "Cochabamba";
        this.nP = 35;
        this.nH = nH;
        this.clima = "Templado";
        this.mPT = mPT;
    }

    public int getnP() {
        return nP;
    }

    public void setnP(int nP) {
        this.nP = nP;
    }

    public double getmPT() {
        return mPT;
    }

    public void setmPT(double mPT) {
        this.mPT = mPT;
    }

    @Override
    public void accept(IUser visitor){
        showInfo();
        visitor.pay(this);
        System.out.println("Money por turismo: " + mPT);
    }

    public void showInfo(){
        System.out.println("<=== La Paz ===>");
        System.out.println("Nombre: " + name);
        System.out.println("Numero de habitantes: " + nH);
        System.out.println("Numero de poblacion: " + nP);
        System.out.println("Clima: " + clima);
        System.out.println("<==================>");
    }
}
