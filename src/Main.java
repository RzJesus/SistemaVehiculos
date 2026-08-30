public class Main {
    public static void main(String[] args){
        Vehiculo vehiculo1 = new Vehiculo();

        Vehiculo vehiculo2 = new Vehiculo("Toyota",2025);

        Carro Carro1 = new Carro("Chevrolet",2027, 6,"Electrico");

        System.out.println(vehiculo1.marca);
        System.out.println(vehiculo1.anoFabricacion);
        System.out.println(vehiculo1.precioBase);
        System.out.println(vehiculo1.importado);

        System.out.println(vehiculo2.marca);
        System.out.println(vehiculo2.anoFabricacion);
        System.out.println(vehiculo2.precioBase);
        System.out.println(vehiculo2.importado);

        System.out.println(Carro1.marca);
        System.out.println(Carro1.anoFabricacion);
        System.out.println(Carro1.numeroPuertas);
        System.out.println(Carro1.tipoCombustible);
    }
}
