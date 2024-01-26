
public class Etudiant {
    String monNom;
    String monEmail;
    int monId;
    Note[] listDeNotes;
    //int nbNotes=0
    public Etudiant(String nom,String email, int id){
 this.monId=id;
 this.monNom=nom;
 this.monEmail=email;
 this.listDeNotes=new Note[10];
    }

/* pour ajouter une note:

    public void ajouterNote(Note note) {
            if (nbNotes< listDeNotes.length){
              listDeNotes[nbNotes] = note;
              nbNotes++;
        }

    }
*/

    public String toString() {
        String str="";
        for (int i = 0; i < listDeNotes.length; i++) {
            str+=listDeNotes[i];
        }
            return "id: " + monId + " nom: " + monNom + " email: " + monEmail + " liste de notes- " + str+ " ";
    }

}



























