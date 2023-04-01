package Questão04;

public class Q04 {

    private double IPI;
    private int peca01;
    private double uni01;
    private int quant01;
    private int peca02;
    private double uni02;
    private int quant02;

    public Q04(double IPI, int peca01, double uni01, int quant01, int peca02, double uni02, int quant02) {

        this.IPI = IPI;
        this.peca01 = peca01;
        this.uni01 = uni01;
        this.quant01 = quant01;
        this.peca02 = peca02;
        this.uni02 = uni02;
        this.quant02 = quant02;

    }

    public double valorTotal(){
        double valorT = (uni01 * quant01 + uni02 * quant02) * (IPI/100 + 1);
            return valorT;
    }

    public double getIPI(){
        return IPI;
    }

    public void setIPI(double IPI){
        this.IPI = IPI;
    }

    public int getPeca01(){
        return peca01;
    }

    public void setPeca01(int peca01) {
        this.peca01 = peca01;
    }

    public double getUni01(){
        return uni01;
    }

    public void setUni01(double uni01) {
        this.uni01 = uni01;
    }

    public int getQuant01(){
        return quant01;
    }

    public void setQuant01(int quant01) {
        this.quant01 = quant01;
    }

    public int getPeca02(){
        return peca02;
    }

    public void setPeca02(int peca02) {
        this.peca02 = peca02;
    }

    public double getuni02(){
        return uni02;
    }

    public void setUni02(double uni02) {
        this.uni02 = uni02;
    }

    public int getQuant02(){
        return quant02;
    }

    public void setQuant02(int quant02){
        this.quant02 = quant02;
    }

}
