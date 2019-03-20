package tasks.task4.model;

public class Category {
    private String name;
    private String description;
    private Category Parent;

    public Category(String _name, String _description, Category _Parent) {
        name = _name;
        description = _description;
        Parent = _Parent;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Category getParent() {
        return Parent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setParent(Category parent) {
        Parent = parent;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
