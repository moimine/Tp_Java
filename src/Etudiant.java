import  java.util.Arrays;
public class Etudiant {
    String monNom;
    String monEmail;
    int monId;
    Note[] listDeNotes;
    public Etudiant(String nom,String email, int id){
 this.monId=id;
 this.monNom=nom;
 this.monEmail=email;
 this.listDeNotes=new Note[10];
    }

/*
    public void ajouterNote(Note note) {
            for(int i=0;i<10;i++){
            listDeNotes[i] = note;
        }
    }
*/

    public String toString(){
       String str="";
       for (int i=0;i<10;i++){
       str+=listDeNotes[i].toString();}
       return "id: " +monId+ " nom " +monNom+ " email " +monEmail+ " liste de notes " + str;
//essaie aussi Arrays.toString(listDeNotes)
    }


}
