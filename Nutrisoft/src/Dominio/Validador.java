package Dominio;

import javax.swing.*;

public class Validador {

    public boolean validarPeso(String strPeso) {
        boolean testePeso = strPeso.matches("[0-9]{2,3}[.][0-9]{1,2}|[0-9]{2,3}[,][0-9]{1,2}");
        return testePeso;
    }

    public boolean validarAltura(String strAltura) {
        boolean testeAltura = strAltura.matches("[0-3]{1}[.][0-9]{1,2}|[0-3]{1}[,][0-9]{1,2}");
        return testeAltura;

    }

    public boolean validarIdade(String strIdade) {
        boolean testeIdade = strIdade.matches("[0-9]{1,2}");
        return testeIdade;
    }

    public boolean validarNumerosPositivos(String strIdade, String strAltura, String strPeso) {
        strPeso = strPeso.replace(",", ".");
        strAltura = strAltura.replace(",", ".");

        Double idade = Double.parseDouble(strIdade);
        Double altura = Double.parseDouble(strAltura);
        Double peso = Double.parseDouble(strPeso);

        if (idade <= 0 || altura <= 0 || peso <= 0) {
            return false;
        } else {
            return true;
        }

    }

    public boolean validadorCaloriasDiarias(String strCalDiarias) {
        strCalDiarias = strCalDiarias.replace(",", ".");

        boolean cal = false;

        try {
            Double calDiarias = Double.parseDouble(strCalDiarias);
            return true;
        } catch (NumberFormatException exc) {
            return false;
        }
    }

}
