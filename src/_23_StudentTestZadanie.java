public class _23_StudentTestZadanie {

    public static void main(String[] args) {
        _22_Student adam = new _22_Student();
        adam.imie = "Adam";
        adam.nazwisko = "Nowak";
        adam.nick = "aNowak";
        adam.email = "adamNowak@test.com";
        adam.numerIndeksu = 1;

        _22_Student katarzyna = new _22_Student();
        katarzyna.imie = "Katarzyna";
        katarzyna.nazwisko = "Buda";
        katarzyna.nick = "kBuda";
        katarzyna.email = "katarzynaBuda@test.com";
        katarzyna.numerIndeksu = 25;

        _22_Student jan = new _22_Student();
        jan.imie = "Jan";
        jan.nazwisko = "Kowalski";
        jan.nick = "jKowalski";
        jan.email = "janKowalski@test.com";
        jan.numerIndeksu = 39;

        _22_Student[] listaStudentow = new _22_Student[3];
        listaStudentow[0] = adam;
        listaStudentow[1] = katarzyna;
        listaStudentow[2] = jan;

        for (int i = 0; i < listaStudentow.length; i++){
            listaStudentow[i].przedstawSie();
            listaStudentow[i].zalogujSie();
            listaStudentow[i].podajeEmail();
            listaStudentow[i].podajNumerIndeksu();
        }
    }
}
