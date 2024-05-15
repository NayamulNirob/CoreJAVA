
package testgenerichome;


public class Techer {
    public String name;
    public String email;
    public String post;

    public Techer() {
    }

    public Techer(String name, String email, String post) {
        this.name = name;
        this.email = email;
        this.post = post;
    }

    @Override
    public String toString() {
        return "Techer{" + "name=" + name + ", email=" + email + ", post=" + post + '}';
    }
    
}
