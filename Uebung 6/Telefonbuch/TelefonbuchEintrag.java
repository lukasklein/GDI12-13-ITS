package Telefonbuch;

public class TelefonbuchEintrag {
    private String telnr, vor, nach, adresse, stadt, plz;

    public String getTelnr(){
        return telnr;
    }
     
    public void setTelnr(String telnr){
        this.telnr = telnr;
    }

    public String getVor(){
        return vor;
    }
     
    public void setVor(String vor){
        this.vor = vor;
    }

    public String getNach(){
        return nach;
    }
     
    public void setNach(String nach){
        this.nach = nach;
    }

    public String getAdresse(){
        return adresse;
    }
     
    public void setAdresse(String adresse){
        this.adresse = adresse;
    }

    public String getStadt(){
        return stadt;
    }
     
    public void setStadt(String stadt){
        this.stadt = stadt;
    }

    public String getPLZ(){
        return plz;
    }
     
    public void setPLZ(String plz){
        this.plz = plz;
    }
}