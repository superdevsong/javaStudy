package serialize;

import java.io.Serializable;

public class SerializeObject implements Serializable {
    public SerializeObject(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "name : "+ name + " description : " + description;
    }

    private String name;
    private String description;
}
