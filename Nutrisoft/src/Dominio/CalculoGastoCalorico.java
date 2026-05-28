package Dominio;

import javax.swing.*;

public class CalculoGastoCalorico {
    private double calBasal;
    private double calTotal;

    public double getCalBasal() {
        return calBasal;
    }

    public void setCalBasal(double calBasal) {
        this.calBasal = calBasal;
    }

    public double getCalTotal() {
        return calTotal;
    }

    public void setCalTotal(double calTotal) {
        this.calTotal = calTotal;
    }

    public void calculoBalHomem(String strPeso, String strAltura, String strIdade) {
        strAltura = strAltura.replace(",", ".");
        strPeso = strPeso.replace(",", ".");



        try {
            Double idade = Double.parseDouble(strIdade);
            Double altura = Double.parseDouble(strAltura);
            Double peso = Double.parseDouble(strPeso);

            altura *= 100;

            calBasal = 66 + (13.8 * peso) + (5 * altura) - (6.8 * idade);

        } catch (NumberFormatException exc) {
            JOptionPane.showMessageDialog(null, "Por favor, digite apenas números");
        }

    }

    public void calculoBasalMulher(String strPeso, String strAltura, String strIdade) {
        strAltura = strAltura.replace(",", ".");
        strPeso = strPeso.replace(",", ".");

        Double idade = Double.parseDouble(strIdade);
        Double altura = Double.parseDouble(strAltura);
        Double peso = Double.parseDouble(strPeso);

        try {
            altura *= 100;

            calBasal = 655 + (9.6 * peso) + (1.9 * altura) - (4.7 * idade);

        } catch (NumberFormatException exc) {
            JOptionPane.showMessageDialog(null, "quebrou kkk");
        }
    }

    public void calculoGastoTotal(String strCombo) {
        switch (strCombo) {
            case "Sedentário":
                calTotal = calBasal * 1.2;
                break;

            case "Leve (1 a 3 dias/semana)":
                calTotal = calBasal * 1.375;
                break;

            case "Moderado (3 a 5 dias/semana)":
                calTotal = calBasal * 1.55;
                break;

            case "Ativo (5 a 6 dias/semana)":
                calTotal = calBasal * 1.725;
                break;

            case "Extremamente ativo (exercícios diários)":
                calTotal = calBasal * 1.9;
                break;

            case " ":
                calTotal = 0;
                break;

            default:
                calTotal = 0;
                break;
        }
    }

}
