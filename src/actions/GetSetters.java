/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

/**
 *
 * @author morok
 */
public class GetSetters {
    private int fire;
    private boolean reload;
    private int ammunitions;
    private boolean pullTregger;
    private boolean shot;
    
    public GetSetters(){
        fire = 1;
        shot = false;
        reload = false;
        ammunitions = 5;
        pullTregger = false;
    }

    public boolean getShot() {
        return shot;
    }

    public void setShot(boolean shot) {
        this.shot = shot;
    }

    public int getFire() {
        return fire;
    }

    public void setFire(int fire) {
        this.fire = fire;
    }

    public boolean getReload() {
        return reload;
    }

    public void setReload(boolean reload) {
        this.reload = reload;
    }

    public int getAmmunitions() {
        return ammunitions;
    }

    public void setAmmunitions(int ammunitions) {
        this.ammunitions = ammunitions;
    }

    public boolean getPullTregger() {
        return pullTregger;
    }

    public void setPullTregger(boolean pullTregger) {
        this.pullTregger = pullTregger;
    }
  
    
    
}
