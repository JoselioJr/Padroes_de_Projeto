package models;

public class UserModel {
    //Atributos
    private String name;
    private String password;

    //Construtor
    public UserModel(String name, String password) {
        this.name = name;
        this.password = password;
    }

    //Encapsulamento
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}