/**
 * Created by Анастасия on 08.03.2016.
 */

/**
 * Класс Запись в блокноте.
 * Включает в себя метод сравнения записей.
 */
public class Note {
    private String str;

    public Note(String newStr){
        str = newStr;
    }

    public Note(){
        String defaultData = "no data";
        new Note(defaultData);
    }

    public String getStr() {
        return str;
    }

    /**
     * Сравнение двух записей.
     * Результат {@code true}, если строки в текущей и сравниваемой записях совпадают.
     *
     * @param  noteToCompare
     *         Запись, сравниваемая с текущей.
     *
     * @return  {@code true} в случае равенства строк в записях, иначе {@code false}
     */
    public boolean equals(Note noteToCompare){
        if (this == noteToCompare) {
            return true;
        }
        return str.equals(noteToCompare.str);
    }
}
