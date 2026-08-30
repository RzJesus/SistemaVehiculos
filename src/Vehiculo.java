public class Vehiculo {
    String marca;
    int anoFabricacion;
    double precioBase;
    boolean importado;

    public Vehiculo(){
        marca = "Sin marca";
        anoFabricacion = 2024;
        precioBase = 0.0;
        importado = false;

    }
    public Vehiculo (String marca, int anioFabricaion){
        this.marca = marca;
        this.anoFabricacion = anioFabricaion;

    }

}
