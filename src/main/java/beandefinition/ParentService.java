package beandefinition;

public class ParentService {
    private int id;
    private String name;

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

    public ParentService(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
