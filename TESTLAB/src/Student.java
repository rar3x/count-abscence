public class Student {
    public Abscence abscence;
    public int id;
    public String name;

    public Student(int idConstructor, String nameConstructor){
        id = idConstructor;
        name = nameConstructor;
    }
    public void addAbscence(Abscence givenAbscence){
        abscence = givenAbscence;
    }


}
