public class TestaContaSemCliente { 
    public static void main(String[] args) { 
        Conta contaDaMicaela = new Conta();
        System.out.println(contaDaMicaela.saldo);

        contaDaMicaela.titular = new Cliente();
        System.out.println(contaDaMicaela.titular);

        contaDaMicaela.titular.nome = "Micaela";
        System.out.println(contaDaMicaela.titular.nome); 
    }
}        