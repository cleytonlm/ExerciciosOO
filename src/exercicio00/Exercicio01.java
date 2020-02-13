package exercicio00;

import exercicio00.Animal;

public class Exercicio01 extends Animal {


    public Exercicio01(String nome, String especie, String tamanho) {
        super(nome, especie, tamanho);
    }

    public static void main(String[] args) {
            Animal animal1 = new Animal ("bob","canina" ,"pequeno");
            animal1.andar();

            Animal animal2 = new Animal("rex","gato","pequeno");
            animal2.comer();



        }
    }


