package Dominio;

import javax.swing.*;

public class CalculoCalDiarias {
    private double carboidratos;
    private double proteinas;
    private double gorduras;

    public double getCarboidratos() {
        return carboidratos;
    }

    public void setCarboidratos(double carboidratos) {
        this.carboidratos = carboidratos;
    }

    public double getProteinas() {
        return proteinas;
    }

    public void setProteinas(double proteinas) {
        this.proteinas = proteinas;
    }

    public double getGorduras() {
        return gorduras;
    }

    public void setGorduras(double gorduras) {
        this.gorduras = gorduras;
    }

    public void calculoCalDiarias(double caloriasDiarias){
        try {
            carboidratos = caloriasDiarias * 0.5 / 4;
            proteinas = caloriasDiarias * 0.25 / 4;
            gorduras = caloriasDiarias * 0.25 / 9;
        }catch (ArithmeticException exc){
            JOptionPane.showMessageDialog(null,"Por favor, verifique se os valores foram inseridos corretamente");
        }
    }
}
