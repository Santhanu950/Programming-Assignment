
package schoolmanagementapp;


public class Teacher {
    int id;
    String password;
    String name;

    public Teacher() {
    }

    public Teacher(int id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" + "id=" + id + ", password=" + password + ", name=" + name + '}';
    }
    
    
    
}
