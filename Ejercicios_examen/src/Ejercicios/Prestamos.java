package Ejercicios;

public class Prestamos {
    private String idMaterial;
    private String usuario;
    private boolean activo;

    public Prestamos(String idMaterial, String usuario) {
        this.idMaterial = idMaterial;
        this.usuario = usuario;
        this.activo = true;
    }

    public void devolver() { this.activo = false; }
    public boolean isActivo() { return activo; }
    public String getIdMaterial() { return idMaterial; }
    public String getUsuario() { return usuario; }

    public String serializar() {
        return idMaterial + ";" + usuario + ";" + activo;
    }

    @Override
    public String toString() {
        return "Usuario: " + usuario + " | Material: " + idMaterial + " | Activo: " + activo;
    }
}