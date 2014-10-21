/*
 * User.java
 */
package henm.group1;

import java.io.Serializable;
import java.sql.PreparedStatement;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "User")
@SessionScoped

public class User implements Serializable{
    
    private int id;
    private String email;
    private String password;
    private String nickname;
    private String gender;
    private String firstName;
    private String lastName;
    private String country;
    private String zipCode;
    private String streetName;
    private String streetNumber;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }
    
    public void registerNewUser() throws Exception{
        
        Database database = new Database();
        database.connect();
        PreparedStatement insertCommentQuery = database.connection.prepareStatement("INSERT INTO COMMENT (email,passport,nickname,gender,firstname,lastname,country,zipCode,streetName,streetNumber)" + "VALUES(?,?,?,?,?,?,?,?,?,?)");
        insertCommentQuery.setString(2, this.email);
        insertCommentQuery.setString(3, this.password);
        insertCommentQuery.setString(4, this.nickname);
        insertCommentQuery.setString(5, this.gender);
        insertCommentQuery.setString(6, this.firstName);
        insertCommentQuery.setString(7, this.lastName);
        insertCommentQuery.setString(8, this.country);
        insertCommentQuery.setString(9, this.zipCode);
        insertCommentQuery.setString(10, this.streetName);
        insertCommentQuery.setString(11, this.streetNumber);
        
        
        
        database.insert(insertCommentQuery);
        database.disconnect();
        
                
    }

}