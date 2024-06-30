public class TeacherService {//инверсии зависимости
    public Teacher createTeacher(int id, String name, String lastName){
        return new Teacher(id, name, lastName);
    }


}
