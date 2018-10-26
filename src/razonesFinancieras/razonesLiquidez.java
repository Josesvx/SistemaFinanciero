/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razonesFinancieras;

/**
 *
 * @author aviles
 */
public class razonesLiquidez {

    public double capitalTrabajo(double activoCirculante, double pasivoCirculante) {
        double capitalTrabajo = 0;
        capitalTrabajo = (activoCirculante) - (pasivoCirculante);
        return capitalTrabajo;
    }

    public double razonCirculante(double activoCirculante, double pasivoCirculante) {
        double razonCir;
        razonCir = activoCirculante / pasivoCirculante;
        return razonCir;
    }

    public double razonAcida(double activoCirculante, double pasivoCirculante, double inventarios) {
        double pAcida;
        pAcida = (activoCirculante - inventarios) / pasivoCirculante;
        return pAcida;
    }

    public double superAcida(double efec_equi, double CxC, double pasivoCirculante) {
        double supAcida;
        supAcida = (efec_equi + CxC) / pasivoCirculante;
        return supAcida;
    }

    public double fondoManiobra(double actCirculante, double pasivoCirculante, double totActivo) {
        double fonMani;
        fonMani = (actCirculante - pasivoCirculante) / totActivo;
        return fonMani;
    }
}
