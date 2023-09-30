package EstruturasRepeticao;

public class Exemplo3 {
    public static void main(String[] args) throws InterruptedException {

        String[] listaCarros = {"Fusca", "Brasilia", "Variant", "Kombi"};

        for (String cadaCarro : listaCarros) {

            System.out.println(cadaCarro);
            Thread.sleep(1000);//executa com tempo entre os itens
        }
    }
}
