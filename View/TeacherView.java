import java.util.Collections;
import java.util.List;

public class TeacherView implements UserView<Teacher>{
    public void sendOnConsole(List<Teacher> teachers){
        //Collections.sort(teachers);
        System.out.println(teachers);
    }

}
