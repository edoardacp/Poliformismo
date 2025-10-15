public class Carro extends Transporte{
    private int numPortas;
    private String tipoCambio;

    public Carro(double velocidade, int capacidade, String combustivel, int numPortas, String tipoCambio) {
        super(velocidade, capacidade, combustivel);
        this.numPortas = numPortas;
        this.tipoCambio = tipoCambio;
    }

    public void mover() {
        System.out.println("O carro está dirigindo na estrada.");
    }

    public void buzinar() {
        System.out.println("BEEP! BEEP");
    }
}
