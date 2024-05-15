
package testtreeset;


public class Information {
    private int id;
    private int age;
    private String sex;

    public Information(int par) {
    }

    public Information(int id, int age, String sex) {
        this.id = id;
        this.age = age;
        this.sex = sex;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Information{" + "id=" + id + ", age=" + age + ", sex=" + sex + '}';
    }
    
}
