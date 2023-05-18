package br.com.benezinho.holding.autentication.model;

import br.com.benezinho.holding.pessoa.model.Pessoa;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class User {

    private Long ID;
    private String email;
    private String password;
    private Pessoa pessoa;

    private Collection<Profile> profiles = new Vector<>();

    public User addProfile(Profile profile){
        this.profiles.add(profile);
        return this;
    }

    public User removeProfile(Profile profile){
        this.profiles.remove(profile);
        return this;
    }

    public Collection<Profile> getProfiles() {
        return Collections.unmodifiableCollection(this.profiles);
    }


    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public User() {
    }

    public User(Long ID, String email, String password, Pessoa pessoa, Collection<Profile> profiles) {
        this.ID = ID;
        this.email = email;
        this.password = password;
        this.pessoa = pessoa;
        this.profiles = profiles;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", pessoa=" + pessoa +
                ", profiles=" + profiles +
                '}';
    }
}
