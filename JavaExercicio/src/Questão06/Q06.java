package Questão06;

public class Q06 {
    private int numero;

    public Q06(int numero){
        this.numero = numero;
    }

    public void imprimir(){
        int antecessor = numero -1;
        int sucessor = numero +1;

        System.out.println("O número que você escolheu é " + numero);
        System.out.println("O número antecessor a " + numero + " é: " + antecessor);
        System.out.println("O número sucessor a " + numero + " é: " +sucessor);
    }

}
