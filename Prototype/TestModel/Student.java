package Prototype.TestModel;

import java.io.*;

public class Student  implements Cloneable, Serializable {
    private String name;
    private int age;
    private String sex;
    private Teacher teacher;

    public Student(String name, int age, String sex,Teacher teacher) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.teacher=teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", teacher=" + teacher +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Student deepClone(){
        Student student=null;
        try {
            student = (Student) clone();
            Teacher teacher = (Teacher) this.teacher.clone();
            student.setTeacher(teacher);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return student;
    }

    public Student deepClone1() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);
        byte[] bytes = byteArrayOutputStream.toByteArray();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        Student o = (Student) objectInputStream.readObject();
        return o;
    }

}
