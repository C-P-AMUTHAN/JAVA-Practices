class Employee {
    private int Id;
    private String Name;

    public void setId(int Id) {
        this.Id = Id;
    }
    public void setName(String Name) {
        this.Name = Name;
    }

    public int getId() {
        return Id;
    }
    public String getName() {
        return Name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setId(2234);
        e.setName("C p AMuthan");
        System.out.println(e.getId());
        System.out.println(e.getName());
    }
}
