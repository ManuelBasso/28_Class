public class Car {
    private int  cilindrata;
    private String  targa;
    private String  auto;
    private String  modello;

    public Car (int cilindrata, String targa, String auto, String modello){
    this.cilindrata = cilindrata;
    this.targa = targa;
    this.auto = auto;
    this.modello = modello;
    }

    public String getTarga() {
        return targa;
    }
    public int getCilindrata() {
        return cilindrata;
    }
    
    public String getAuto() {
        return auto;
    }
    public String getModello(){
        return  modello;
    }

    public void showDetails(){
        System.out.println("Auto: " + getFullCar());
        System.out.println("Cilindrata: " + cilindrata);
        System.out.println("Targa: " + targa);
    }
}
