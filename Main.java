import java.util.List;

public class Main {
    public static void main(String[] args) {
        new TeacherController().sendOnConsole(List.of(new Teacher(1, "Aidar", "Akimaliev"),new Teacher(2, "Aidai", "Kasmalieva")));
        
    }
    private static List<Teacher> getTeachers(){
        Teacher t1=new Teacher(3, "Ira", "Ivanova");
        Teacher t2= new Teacher(4, "sergey", "Ivanov");
        return List.of(t1,t2);

    }
    
}
