public class FuncionarioTeste {

        private String nome;
        private String cpf;
        private double salario;
        private int tipo = 0; //0 = Funcionário comum; 1 = Gerente; 2 = Diretor

        public double getBonificacao() {

            if(this.tipo == 0) { // Funcionário comum;
                return this.salario * 0.1;
            } else if(this.tipo == 1) { // Gerente;
                return this.salario;
            } else {
                return this.salario + 1000.0;
            }

        }

        public void setTipo(int tipo) {
            this.tipo = tipo;
        }

        public int getTipo() {
            return tipo;
        }