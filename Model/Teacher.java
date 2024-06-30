 public class Teacher extends User {//Вместо того, чтобы менять сам класс Teacher, мы расширим его(Extends) и добьемся решения поставленной задачи, не нарушая принцип ОСР(Принцип открытости/закрытости) и подстановки Барбары Лисков
    public Teacher(int id, String name, String lastName){
        this.id=id;
        this.name=name;
        this.lastname=lastName;
    }

    
    
      

}
