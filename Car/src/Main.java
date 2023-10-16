public class Main {
    public static void main(String[] args) {

        Car firstAuto = new Car(2200,"AV502WW","Fiat", "Panda");
        System.out.println("Targa : " + firstAuto.getTarga());
        System.out.println("Auto : " + firstAuto.getFullCar());
        System.out.println("Cilindrata : " + firstAuto.getCilindrata());
    }
}