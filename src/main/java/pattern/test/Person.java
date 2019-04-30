package pattern.test;

/**
 * Created by yangwan on 2019/4/15
 */
public class Person {

    private String userName;
    private String password;
    private Integer age;

    public Person(String userName, String password, Integer age) {
        this.userName = userName;
        this.password = password;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString(){
         return "name: " + userName + " || age :" + age;
    }

}
