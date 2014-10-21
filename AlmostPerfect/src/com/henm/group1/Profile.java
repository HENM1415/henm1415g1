/*
 * Profile.java
 */
package henm.group1;

import java.sql.PreparedStatement;

public class Profile {
    private int id;
    private String age;
    private String imageUrl;
    private String maritalStatus;
    private String hairColor;
    private String eyeColor;
    private String height;
    private String weight;
    private String profession;
    private String nationality;
    private String religion;
    private String hobbies;
    private String additionalInfo;
    private Double lng;
    private Double lat;
    

    public String getAge() {
        return age;
    }
    
    public void setAge(String age) {
        this.age = age;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

     public void registerProfile() throws Exception{
        
        Database database = new Database();
        database.connect();
        PreparedStatement insertCommentQuery = database.connection.prepareStatement("INSERT INTO COMMENT (id,"
                + "                                                                                       age,"
                + "                                                                                       imageUrl,"
                + "                                                                                       maritalStatus,"
                + "                                                                                       hairColor,"
                + "                                                                                       eyeColor,"
                + "                                                                                       height,"
                + "                                                                                       weight,"
                + "                                                                                       profession,"
                + "                                                                                       nationality,"
                + "                                                                                       religion,"
                + "                                                                                       hobbies,"
                + "                                                                                       additionalInfo,"
                + "                                                                                       lng,"
                + "                                                                                       lat;)" +
                "VALUES(?,?,?,?,?,?,?,?,?,?,,?,?,?,?,?)");
        insertCommentQuery.setInt(1, this.id);
        insertCommentQuery.setString(2, this.age);
        insertCommentQuery.setString(3, this.imageUrl);
        insertCommentQuery.setString(4, this.maritalStatus);
        insertCommentQuery.setString(5, this.hairColor);
        insertCommentQuery.setString(6, this.eyeColor);
        insertCommentQuery.setString(7, this.height);
        insertCommentQuery.setString(8, this.weight);
        insertCommentQuery.setString(9, this.profession);
        insertCommentQuery.setString(10, this.nationality);
        insertCommentQuery.setString(11, this.religion);
        insertCommentQuery.setString(12, this.hobbies);
        insertCommentQuery.setString(13, this.additionalInfo);
        insertCommentQuery.setDouble(14, this.lng);
        insertCommentQuery.setDouble(15, this.lat);
        
        database.insert(insertCommentQuery);
        database.disconnect();
        
                
    }
}
