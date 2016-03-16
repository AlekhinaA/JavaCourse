/**
 * Created by Анастасия on 08.03.2016.
 */
public class Main {
    public static void main(String[] args) {

        Notebook myNotebook = new Notebook(5);
        Note myNote = new Note("first note");

        myNotebook.addNote(myNote);
        System.out.println("Max size = " + myNotebook.getSize());
        System.out.println("Current position = " + myNotebook.getCurPos());
        myNotebook.showNotes();

        Note myChangedNote = new Note("first changed note");
        myNotebook.changeNote(myNote, myChangedNote);
        System.out.println("Max size = " + myNotebook.getSize());
        System.out.println("Current position = " + myNotebook.getCurPos());
        myNotebook.showNotes();

        Note myNote2 = new Note("second note");
        Note myNote3 = new Note("third note");
        myNotebook.addNote(myNote2);
        myNotebook.addNote(myNote3);
        System.out.println("Max size = " + myNotebook.getSize());
        System.out.println("Current position = " + myNotebook.getCurPos());
        myNotebook.showNotes();

        Note myNote4 = new Note("forth note");
        Note myNote5 = new Note("fifth note");
        myNotebook.addNote(myNote4);
        myNotebook.addNote(myNote5);
        Note myErrNote = new Note("out of size note");
        myNotebook.addNote(myErrNote);
        System.out.println("Max size = " + myNotebook.getSize());
        System.out.println("Current position = " + myNotebook.getCurPos());
        myNotebook.showNotes();

        myNotebook.deleteNote(myNote3);
        System.out.println("Max size = " + myNotebook.getSize());
        System.out.println("Current position = " + myNotebook.getCurPos());
        myNotebook.showNotes();

        Note myNote6 = new Note("sixth note");
        myNotebook.addNote(myNote6);
        System.out.println("Max size = " + myNotebook.getSize());
        System.out.println("Current position = " + myNotebook.getCurPos());
        myNotebook.showNotes();



    }
}
