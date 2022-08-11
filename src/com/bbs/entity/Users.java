package com.bbs.entity;

/**
 * @author Tricloud
 * @date 2021/5/10 9:41
 */
public class Users {
    Integer id;
    String account;
    String password;
    String telephone;
    String image;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", telephone='" + telephone + '\'' +
                ", image='" + image + '\'' +
                '}';
    }

    public Users(Integer id, String account, String password, String telephone, String image) {
        super();
        this.id = id;
        this.account = account;
        this.password = password;
        this.telephone = telephone;
        this.image = image;
    }

    public Users() {
        super();
    }
}
