package Ejercicios.E3;

public class Facebook implements IRs{
    private int usuarios;
    private int uActivos;

    public Facebook(int usuarios, int uActivos) {
        this.usuarios = usuarios;
        this.uActivos = uActivos;
    }

    @Override
    public void showInfo(ISistema sistema) {
        System.out.println("<=== Facebook ===>");
        System.out.println("Usuarios: " + usuarios);
        System.out.println("Usuarios Activos: " + uActivos);
        System.out.println("<=== Facebook ===>");
        System.out.println();
    }
}
