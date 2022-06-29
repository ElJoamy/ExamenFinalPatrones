package Ejercicios.E3;

public class Whatsapp implements IRs{
    private int usuarios;
    private int uActivos;

    public Whatsapp(int usuarios, int uActivos) {
        this.usuarios = usuarios;
        this.uActivos = uActivos;
    }

    @Override
    public void showInfo(ISistema sistema) {
        System.out.println("<=== Whatsapp ===>");
        System.out.println("Usuarios: " + usuarios);
        System.out.println("Usuarios Activos: " + uActivos);
        System.out.println("<=== Whatsapp ===>");
        System.out.println();
    }
    
}
