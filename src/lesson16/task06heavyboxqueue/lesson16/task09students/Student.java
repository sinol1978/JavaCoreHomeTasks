package lesson16.task06heavyboxqueue.lesson16.task09students;

public class Student {
    private String name;
    private int course;
    private String group;
    private int mark;

    public Student(String name, int course, String group, int mark) {
        this.name = name;
        this.course = course;
        this.group = group;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                ", mark=" + mark +
                '}';
    }
}
