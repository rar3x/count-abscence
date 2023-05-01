public class Faculty {

    public Student[] students;
    public Abscence abscence;
    public Professor[] professors;

    public Faculty(Student[] studentsConstuctor, Abscence abscenceConstructor, Professor[] professorsConstructor){
        students = studentsConstuctor;
        abscence = abscenceConstructor;
        professors = professorsConstructor;
    }

}
