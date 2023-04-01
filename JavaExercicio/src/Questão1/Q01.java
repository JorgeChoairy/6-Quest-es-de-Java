package Questão1;

public class Q01 {
    private int anos;
    private int meses;
    private int dias;

    public Q01(){

    }

    public Q01(int anos, int meses, int dias){
        this.anos = anos;
        this.meses = meses;
        this.dias = dias;
    }

    public int idadeEmDias(){
        int idadeEmDias = (anos*365) + (meses * 30) + (dias);
        return idadeEmDias;
    }

}
