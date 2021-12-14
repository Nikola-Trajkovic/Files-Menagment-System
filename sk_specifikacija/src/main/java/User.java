public class User {
    private String username;
    private String pasword;
    private String kategorija;

    public User() {

    }

    public User(String username, String pasword, String kategorija) {
        this.username = username;
        this.pasword = pasword;
        this.kategorija = kategorija;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }
}
