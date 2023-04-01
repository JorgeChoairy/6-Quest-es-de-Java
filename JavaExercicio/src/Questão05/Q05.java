package Questão05;

public class Q05 {


    private double salarioMin;
    private double seuSalario;

    public Q05(double salarioMin, double seuSalario){
        this.salarioMin = salarioMin;
        this.seuSalario = seuSalario;
    }

    public double quantSalariosMin(){
        double quant = seuSalario / salarioMin;
        return quant;
    }


}


