public class Vehiculo {
    String marca;
    int anioFabricaion;
    double precioBase;
    boolean importado;

    public Vehiculo(){
        marca = "Sin marca";
        anioFabricaion = 2024;
        precioBase = 0.0;
        importado = false;

    }
    public Vehiculo (String marca, int anioFabricaion){
        this.marca = marca;
        this.anioFabricaion = anioFabricaion;

    }

}
