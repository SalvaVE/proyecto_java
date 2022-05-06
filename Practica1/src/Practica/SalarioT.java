
package Practica;


public class SalarioT {
     private double HT;
    private double PH;

    public SalarioT() {
    }

    public SalarioT(double HT, double PH) {
        this.HT = HT;
        this.PH = PH;
    }

    public double getHT() {
        return HT;
    }

    public void setHT(double HT) {
        this.HT = HT;
    }

    public double getPH() {
        return PH;
    }

    public void setPH(double PH) {
        this.PH = PH;
    }

    double CSalario() {
        double salarioB = 0;
        double h2;
        double h3;
        
        if (this.HT <= 40) {
            salarioB = this.HT * this.PH;
            return salarioB;
        } else if (this.HT > 40 && this.HT < 48) {
            h2 = this.HT - 40;
            salarioB = (40 * this.PH) + (h2 * this.PH * 2);
            return salarioB; 
        } else if (this.HT > 48) {
            h3 = this.HT - 48;
            salarioB = (40 * this.PH) + (8 * this.PH * 2)+(HT * this.PH * 3);
            return salarioB;
        }
        return salarioB;
    }
    
    double rentaT(SalarioT salarioR){
    double renta;
    salarioR.CSalario();
    renta = salarioR.CSalario() * 0.10  ;
    return renta;
    }
    
    double salarioLiquido(SalarioT Liquido){
        double salarioL;
        
        salarioL = Liquido.CSalario()- Liquido.rentaT(Liquido);
        return salarioL;
    }
}


