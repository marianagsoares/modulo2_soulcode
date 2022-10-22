package exercicios.herancasEInterfaces;

public class Comida {
    //CLASSE COMIDA
    //Getter e setter sao dados a partir da propriedade da funcao
        private String nome;
        private double peso;

        public Comida(String nomeComida, double pesoComida){
            this.nome = nomeComida;
            this.peso = pesoComida;
        }

        public String getNome() {
            return this.nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getPeso() {
            return this.peso;
        }

        public void setPeso(double peso) {
            this.peso = peso;
        }
    }
