public class Aviao extends Transporte{
    private double envergadura;
    private double altitudeMax;

    public Aviao(double velocidade, int capacidade, String combustivel, double envergadura, double altitudeMax) {
        super(velocidade, capacidade, combustivel);
        this.envergadura = envergadura;
        this.altitudeMax = altitudeMax;
    }

    public void mover() {
        System.out.println("O avião está voando pelos céus.");
    }

    public void decolar() {
        System.out.println("O avião está decolando!");
    }
}
