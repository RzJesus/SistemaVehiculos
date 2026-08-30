public class Main {
    public static void main(String[] args){
        Vehiculo vehiculo1 = new Vehiculo();

        Vehiculo vehiculo2 = new Vehiculo("Toyota",2025);

        System.out.println(vehiculo1.marca);
        System.out.println(vehiculo1.anioFabricaion);
        System.out.println(vehiculo1.precioBase);
        System.out.println(vehiculo1.importado);

        System.out.println(vehiculo2.marca);
        System.out.println(vehiculo2.anioFabricaion);
        System.out.println(vehiculo2.precioBase);
        System.out.println(vehiculo2.importado);
    }
}
