import org.junit.Test;

/**
 * Created by user on 17.03.16.
 */
public class TestNotebook {
    @Test
    public void testNotebook(){
        Notebook myNotebook = new Notebook(5);
        Note myNote = new Note("first note");

        myNotebook.addNote(myNote);
        System.out.println("Max size = " + myNotebook.getSize());
        System.out.println("Current position = " + myNotebook.getCurPos());
        myNotebook.showNotes();
        System.out.println();

        Note myChangedNote = new Note("first changed note");
        myNotebook.changeNote(myNote, myChangedNote);
        System.out.println("Max size = " + myNotebook.getSize());
        System.out.println("Current position = " + myNotebook.getCurPos());
        myNotebook.showNotes();
        System.out.println();

        Note myNote2 = new Note("second note");
        Note myNote3 = new Note("third note");
        myNotebook.addNote(myNote2);
        myNotebook.addNote(myNote3);
        System.out.println("Max size = " + myNotebook.getSize());
        System.out.println("Current position = " + myNotebook.getCurPos());
        myNotebook.showNotes();
        System.out.println();

        Note myNote4 = new Note("forth note");
        Note myNote5 = new Note("fifth note");
        myNotebook.addNote(myNote4);
        myNotebook.addNote(myNote5);
        System.out.println("Max size = " + myNotebook.getSize());
        System.out.println("Current position = " + myNotebook.getCurPos());
        myNotebook.showNotes();
        System.out.println();

        Note myErrNote = new Note("out of size note");
        myNotebook.addNote(myErrNote);
        System.out.println("Max size = " + myNotebook.getSize());
        System.out.println("Current position = " + myNotebook.getCurPos());
        myNotebook.showNotes();
        System.out.println();

        myNotebook.deleteNote(myNote3);
        System.out.println("Max size = " + myNotebook.getSize());
        System.out.println("Current position = " + myNotebook.getCurPos());
        myNotebook.showNotes();
        System.out.println();

        Note myNote6 = new Note("sixth note");
        myNotebook.addNote(myNote6);
        System.out.println("Max size = " + myNotebook.getSize());
        System.out.println("Current position = " + myNotebook.getCurPos());
        myNotebook.showNotes();
        System.out.println();
    }
}
