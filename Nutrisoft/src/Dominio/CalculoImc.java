
package Dominio;

import javax.swing.JOptionPane;


public class CalculoImc {
    private double imc;

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public void CalculoImc(String strAltura, String strPeso) {


        if (strAltura.isEmpty() || strPeso.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, os campos precisam ser preenchidos");
        } else {
            boolean testeAltura = strAltura.matches("[0-3]{1}[.][0-9]{1,2}|[0-3]{1}[,][0-9]{1,2}");
            boolean testePeso = strPeso.matches("[0-9]{2,3}[.][0-9]{1,2}|[0-9]{2,3}[,][0-9]{1,2}");

             if (testeAltura == true && testePeso == false) {
                JOptionPane.showMessageDialog(null, "Digite o peso no formato 00.00 ou 000.00");
            } else if (testeAltura == false && testePeso == true) {
                JOptionPane.showMessageDialog(null, "Digite a altura no formato 0.00");
            }else if(testeAltura == false && testePeso == false){
                 JOptionPane.showMessageDialog(null, "Digite o peso no formato 00.00 ou 000.00 e altura no formato 0.00");
             }else{
                 try {
                     strAltura = strAltura.replace(",",".");
                     strPeso = strPeso.replace(",",".");

                     Double altura = Double.parseDouble(strAltura);
                     Double peso = Double.parseDouble(strPeso);

                     if (peso <= 0 || altura <= 0) {
                         JOptionPane.showMessageDialog(null, "Digite valores acima de 0");
                     } else {
                         setImc(peso / (altura * altura));
                     }
                 } catch (NumberFormatException exc) {
                     JOptionPane.showMessageDialog(null, "Por favor, digite apenas números no formato 00.00 ou 00.");
                 }
             }
        }
    }
}
