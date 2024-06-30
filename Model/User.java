

public abstract class User  {//единственной отвественности))
    protected int id;
    protected String name;
    protected String lastname;
    
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    @Override
    public String toString() {
        return "Teacher [id=" + id + ", name=" + name + ", lastName=\" + lastName + ]";
    }
}
