public class TestaGetESet { 
    public static void main(String[] args) { 
        Conta conta = new Conta();
        conta.setNumero(1337);
        System.out.println(conta.getNumero()); 
        
        Cliente micaela = new Cliente(); 
    micaela.setNome("micaela herrera");

    conta.setTitular(micaela);

    System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("secretaria"); 
        //agora em duas linhas: 
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("secretaria");

        System.out.println(titularDaConta); 
        System.out.println(micaela);
        System.out.println(conta.getTitular());

    }
}
