package org.eduardocd.genericclass;

public class GenericExample {

    public static void main(String[] args) {
        Truck<Animal> truck = new Truck<>(5);

        truck.add(new Animal("Peregrino", "Caballo"));
        truck.add(new Animal("Grillo", "Caballo"));
        truck.add(new Animal("Tunquen", "Caballo"));
        truck.add(new Animal("Topocalma","Caballo"));
        truck.add(new Animal("Longotoma","Caballo"));
        printTruck(truck);

        Truck<Machinery> machineryTransport = new Truck<>(3);
        machineryTransport.add(new Machinery("Bulldozer"));
        machineryTransport.add(new Machinery("Grua Horquilla"));
        machineryTransport.add(new Machinery("Perforadora"));
        printTruck(machineryTransport);

        Truck<Car> carTransport = new Truck<>(3);
        carTransport.add(new Car("Toyota"));
        carTransport.add(new Car("Mitshubishi"));
        carTransport.add(new Car("Chevrolet"));
        printTruck(carTransport);
    }

    public static <T> void printTruck(Truck<T> truck) {
        for (T t : truck) {
            if( t instanceof Animal ) {
                System.out.println(((Animal) t).getName() + " tipo: " + ((Animal) t).getType());
            } else if( t instanceof Car ) {
                System.out.println(((Car) t).getBrand());
            } else if( t instanceof Machinery ) {
                System.out.println(((Machinery) t).getType());
            }
        }
    }

}
