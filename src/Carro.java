public class Carro extends Vehiculo {
    int numeroPuertas;
    String tipoCombustible;

    public Carro( String marca, int anioFabricacion, int numeroPuertas, String tipoCombustible){

        super (marca , anioFabricacion);

        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;

    }



}
