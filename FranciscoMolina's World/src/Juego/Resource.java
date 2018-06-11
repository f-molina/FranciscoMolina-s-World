/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import NintendoResources.Acero;
import NintendoResources.Cristal;
import NintendoResources.Mushrooms;
import PlaystationResources.Carbon;
import PlaystationResources.Ecos;
import PlaystationResources.Titanio;
import java.util.ArrayList;

/**
 *
 * @author fmolina
 */
public class Resource {
    
    public Acero acero;
    public Cristal cristal;
    public Mushrooms mush;
    public Titanio titanio;
    public Ecos ecos;
    public Carbon carbon;
    public ArrayList<Acero> ac;

    public ArrayList<Acero> getAc() {
        return ac;
    }

    public void setAc(ArrayList<Acero> ac) {
        this.ac = ac;
    }

    public Resource() {
        this.carbon = new Carbon();
        this.ecos = new Ecos();
        this.titanio = new Titanio();
        this.mush = new Mushrooms();
        this.cristal = new Cristal();
        this.acero = new Acero();
        this.ac = new ArrayList<>();
    }

    public Acero getAcero() {
        return acero;
    }

    public void setAcero(Acero acero) {
        this.acero = acero;
    }

    public Cristal getCristal() {
        return cristal;
    }

    public void setCristal(Cristal cristal) {
        this.cristal = cristal;
    }

    public Mushrooms getMush() {
        return mush;
    }

    public void setMush(Mushrooms mush) {
        this.mush = mush;
    }

    public Titanio getTitanio() {
        return titanio;
    }

    public void setTitanio(Titanio titanio) {
        this.titanio = titanio;
    }

    public Ecos getEcos() {
        return ecos;
    }

    public void setEcos(Ecos ecos) {
        this.ecos = ecos;
    }

    public Carbon getCarbon() {
        return carbon;
    }

    public void setCarbon(Carbon carbon) {
        this.carbon = carbon;
    }
    
    
    
}
