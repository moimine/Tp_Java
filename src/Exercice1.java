public class Exercice1 {
    private int monId ;
    private String monNom;
    private float maMoyennne;
    public Exercice1(int id,String nom,float moy){
        this.maMoyennne=moy;
        this.monNom=nom;
        this.monId=id;
    }

    public int getMonId() {
        return monId;
    }

    public float getMaMoyennne() {
        return maMoyennne;
    }

    public String getMonNom() {
        return monNom;
    }

    public void setMonId(int monId) {
        this.monId = monId;
    }

    public void setMonNom(String monNom) {
        this.monNom = monNom;
    }

    public void setMaMoyennne(float maMoyennne) {
        this.maMoyennne = maMoyennne;
    }

}
