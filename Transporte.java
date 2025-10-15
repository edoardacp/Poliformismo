public class Transporte {
    private double velocidade;
    private int capacidade;
    private String combustivel;

    public Transporte() {
        this(0.0,0,"Não informado");
    }

    public Transporte(double velocidade, int capacidade, String combustivel) {
        this.velocidade = velocidade;
        this.capacidade = capacidade;
        this.combustivel = combustivel;
    }

    public void exibirInfo() {
        System.out.println("Velocidade: " + velocidade + " km/h");
        System.out.println("Capacidade: " + capacidade + " pessoas");
        System.out.println("Combustível: " + combustivel);
    }

    public void mover() {
        System.out.println("O transporte está se movendo.");
    }
}
