public class Barco extends Transporte{
    private boolean temAncora;
    private String tipoCasco;

    public Barco(double velocidade, int capacidade, String combustivel, boolean temAncora, String tipoCasco) {
        super(velocidade, capacidade, combustivel);
        this.temAncora = temAncora;
        this.tipoCasco = tipoCasco;
    }

    public void mover() {
        System.out.println("O barco está navegando nas águas.");
    }

    public void ancorar() {
        System.out.println("O barco está ancorando no porto.");
    }
}
