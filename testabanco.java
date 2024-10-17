public class TestaBanco { 
    public static void main(String[] args) { 
        Cliente micaela = new Cliente(); 
        micaela.nome = "Micaela Herrera";
        micaela.cpf = "111.222.333-44";
        micaela.profissao = "Secretária";

        Conta contaDaMicaela = new Conta(); 
        contaDaMicaela.deposita(300);

        contaDaMicaela.titular = micaela; 
        System.out.println(contaDaMicaela.titular.nome);
        System.out.println(contaDaMicaela.titular);
        System.out.println(micaela);
    }
}