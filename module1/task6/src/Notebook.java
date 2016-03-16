/**
 * Created by Анастасия on 08.03.2016.
 */

/**
 * Класс Блокнот.
 * Включает в себя методы Добавления записи, Удаление записи, Редактирование записи и Просмотр всех записей.
 */
public class Notebook {
    private int size;
    private Note[] notes;
    /** Индекс последней записи в блокноте */
    private int curPos = 0;

    public Notebook(int size) {
        this.size = size;
        notes = new Note[size];
    }

    public Notebook(){
        int defaultSize = 10;
        new Notebook(defaultSize);
    }

    public int getCurPos() {
        return curPos;
    }

    public int getSize() {
        return size;
    }

    /**
     * Добавление новой записи в блокнот.
     * Новая запись добавляется в конец блокнота, если он не заполнен полностью.
     * Иначе выдается сообщение о невозможности добавления.
     *
     * @param  newNote
     *         Добавляемая запись.
     * @return  {@code true} в случае удачного добавления, иначе {@code false}
     */
    public boolean addNote(Note newNote){
        if (curPos == size) {
            System.out.println("Can't add note: full notebook");
            return false;
        }
        notes[curPos] = newNote;
        curPos++;
        return true;
    }

    /**
     * Просмотр записей в блокноте.
     * Последовательный вывод всех имеющихся записей.
     */
    public void showNotes(){
        for (int i = 0; i < curPos; i++) {
            System.out.println(notes[i].getStr());
        }
    }

    /**
     * Редактирование записи в блокноте.
     * Поиск записи, которую хотим изменить и ее замена измененной записью.
     * В случае если запись не найдена, выдается сообщение.
     *
     * @param  curNote
     *         Имеющаяся в блокноте запись, которую изменяем.
     * @param  changedNote
     *         Измененная запись.
     * @return  {@code true} в случае удачного изменения, иначе {@code false}
     */
    public boolean changeNote(Note curNote, Note changedNote){
        for (int i = 0; i < curPos; i++) {
            if (notes[i].equals(curNote)) {
                notes[i] = changedNote;
                return true;
            }
        }
        System.out.println("Can't change note: note has not found");
        return false;
    }

    /**
     * Удаление записи из блокнота.
     * Поиск записи, которую хотим удалить, ее удаление, сдвиг последующих записей.
     * В случае если запись не найдена, выдается сообщение.
     *
     * @param  noteForDelete
     *         Удаляемая запись.
     * @return  {@code true} в случае удачного удаления, иначе {@code false}
     */
    public boolean deleteNote(Note noteForDelete){
        for (int i = 0; i < curPos; i++) {
            if (notes[i].equals(noteForDelete)) {
                System.arraycopy(notes, i + 1, notes, i, curPos - i - 1);
                curPos--;
                return true;
            }
        }
        System.out.println("Can't delete note: note has not found");
        return false;
    }


}
