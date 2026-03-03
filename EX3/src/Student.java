public class Student {
    public String id;
    public String name;
    public Double gpa;

    public Student(String id, String name, Double gpa){
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student: " +
                "id='" + id +
                "| name= " + name +
                "| gpa= " + gpa;

    }
}
