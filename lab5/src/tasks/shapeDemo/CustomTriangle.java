package tasks.shapeDemo;

public class CustomTriangle extends Triangle implements NamedObject {
    private String name;
    private String description;

    public CustomTriangle(Double sideA, Double sideB, Double sideC, String name, String description) {
        super(sideA, sideB, sideC);
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


}
