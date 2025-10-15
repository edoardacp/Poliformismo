public class Main {
    public static void main(String[] args) {
        Transporte t1 = new Carro(60, 5, "Gasolina", 4, "Automático");
        Transporte t2 = new Aviao(850, 180, "Querosene", 35.8, 12000);
        Transporte t3 = new Barco(100, 20, "Diesel", true, "Fibra de vidro");

        executarMovimento(t1);
        executarMovimento(t2);
        executarMovimento(t3);

        System.out.println();

        if (t1 instanceof Carro) {
            ((Carro) t1).buzinar();
        }

        if (t2 instanceof Aviao) {
            ((Aviao) t2).decolar();
        }

        if (t3 instanceof Barco) {
            ((Barco) t3).ancorar();
        }

        System.out.println();


        t1.exibirInfo();
        System.out.println();
        t2.exibirInfo();
        System.out.println();
        t3.exibirInfo();
    }

    public static void executarMovimento(Transporte transporte) {
        transporte.mover();
    }
}
