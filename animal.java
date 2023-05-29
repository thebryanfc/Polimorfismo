package prc;

public class animal {
    private String name;
    private String color;
    private int age;
    private String type;

    public animal(String name, String color, int age, String type) {

    }

    public animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString(){
        return  "El animla "
                + this.getName()+" de color "
                + this.color+ "y tiene "
                +this.getAge()+" años";
    }
    public String talk(){
        String s= "El animal "+ this.getName() +"dice: ";
        return s;
    }

}
