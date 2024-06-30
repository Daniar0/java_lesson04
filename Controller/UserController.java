public interface UserController {//разделение интерфейса
    <T extends User> User create(T user);

}
