package Questão2;

public class main02 {

    public static void main(String[] args) {
        Q02 media1 = new Q02(8, 9, 7);
        Q02 media2 = new Q02(4, 5, 6);

        System.out.println("A média entre 8, 9 e 7 é igual a: " + media1.media());
        System.out.println("A média entre 4, 5 e 6 é igual a: " + media2.media());
        System.out.println("A média entre " + media1.media() + " e " + media2.media() + " é igual a: " + (media1.media() + media2.media())/2);

    }
}
