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
public class MyWord {
    
    private String label;
    private int Index;
    private String Patt;

    public MyWord(String label, int Index,String patt) {
        this.label = label;
        this.Index = Index;
        this.Patt = patt;
    }

    public String getPatt() {
        return Patt;
    }

    public void setPatt(String Patt) {
        this.Patt = Patt;
    }
    
   

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getIndex() {
        return Index;
    }

    public void setIndex(int Index) {
        this.Index = Index;
    }
    
    
    
}
