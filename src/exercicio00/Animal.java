package exercicio00;

public class Animal {

        public String nome;
        public String especie;
        public String tamanho;

    public Animal(String nome, String especie, String tamanho) {
        this.nome = nome;
        this.especie = especie;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String comer() {
            return "Estou comendo";

        }


        public String andar (){
        return "estou andanoo";
        }
    }

