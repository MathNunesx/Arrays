public class teste {
    public static void main(String[] args)throws Exception{
        VetorObjeto vetor = new VetorObjeto(5);

        Contato c1 = new Contato("Jusefa", "0204-9865", "jusefa@gmail");
        Contato c2 = new Contato("Tereza", "0204-7458", "tereza@gmail");
        Contato c3 = new Contato("Valdemir", "0204-4025", "Valdemir@gmail");

        try {
            vetor.adiciona(c1);
            vetor.adiciona(c2);
            vetor.adiciona(c3);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Tamanho do vetor: " + vetor.tamanho());

        System.out.println(vetor);
    }
}
