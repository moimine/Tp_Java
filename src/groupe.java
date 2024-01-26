public class groupe {
    String nomGroupe;
    Etudiant[] listesEtudiants;
  

    public groupe(String nom){
        this.nomGroupe=nom;
        this.listesEtudiants=new Etudiant[20];
    }

    public String toString(){
        return "nom: " + nomGroupe;
          }
    }

