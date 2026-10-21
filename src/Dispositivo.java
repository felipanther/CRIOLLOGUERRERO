public class Dispositivo {
    //Atributo de instancia
    private final int id;
    private String nombre;
    private boolean activo;
    //Atributo de clase
    private static int contadorDispositivo = 0;
    //constructor
    public Dispositivo(int id, String nombre){
        if(id <= 0){
            throw new IllegalArgumentException("El identificador debe ser mayor a 0");
        }
        if (!esNombreValido(nombre)){
            throw new IllegalArgumentException("El nombre no pude ser nulo ni vacio n contener unicamente esapcios espacios");
        }
        this.id = id;
        this.nombre = nombre.trim();
        this.activo = true;
        contadorDispositivo++;
    }
    private static boolean esNombreValido(String nombre){
        return nombre != null && !nombre.trim().isEmpty();
    }
    public int getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        if(esNombreValido(nombre)){
            this.nombre = nombre;
        }
    }

    public boolean isActivo() {
        return activo;
    }
    public boolean desactivar(){
        if(this.activo){
            this.activo = false;
            return true;
        }
        return false;
    }
    public String obtenerResumen(){
        String estadoStr = this.activo ? "Activo" : "Inactivo";
        return this.id + "/" + this.nombre + "/" + estadoStr;
    }
    public static int getContadorDispositivo(){
        return contadorDispositivo;
    }
}
