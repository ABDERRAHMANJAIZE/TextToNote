/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texttonoe;

/**
 *
 * @author MSdev
 */
public class Pattern {
    
    private int Index;
    private String Patt;

    public int getIndex() {
        return Index;
    }

    public void setIndex(int Index) {
        this.Index = Index;
    }

    public String getPatt() {
        return Patt;
    }

    public void setPatt(String Patt) {
        this.Patt = Patt;
    }

    public Pattern(int Index, String Patt) {
        this.Index = Index;
        this.Patt = Patt;
    }
    
    
    
}
