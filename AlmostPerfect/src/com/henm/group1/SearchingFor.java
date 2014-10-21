/*
 * SearchingFor.java
 */
package henm.group1;

import java.sql.PreparedStatement;

public class SearchingFor {
    private int id;
    private String maritalStatus;
    private String gender;
    private String hairColor;
    private String eyeColor;
    private String heightMin;
    private String heightMax;
    private String weightMin;
    private String weightMax;
    private String minAge;
    private String maxAge;
    private String profession;
    private String nationality;
    private String religion;
    private String hobbies;

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public String getMinAge() {
        return minAge;
    }

    public void setMinAge(String minAge) {
        this.minAge = minAge;
    }

    public String getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(String maxAge) {
        this.maxAge = maxAge;
    }
    

    /**
     * @return the maritalStatus
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * @param maritalStatus the maritalStatus to set
     */
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    /**
     * @return the heightMin
     */
    public String getHeightMin() {
        return heightMin;
    }

    /**
     * @param heightMin the heightMin to set
     */
    public void setHeightMin(String heightMin) {
        this.heightMin = heightMin;
    }

    /**
     * @return the heightMax
     */
    public String getHeightMax() {
        return heightMax;
    }

    /**
     * @param heightMax the heightMax to set
     */
    public void setHeightMax(String heightMax) {
        this.heightMax = heightMax;
    }

    /**
     * @return the weightMin
     */
    public String getWeightMin() {
        return weightMin;
    }

    /**
     * @param weightMin the weightMin to set
     */
    public void setWeightMin(String weightMin) {
        this.weightMin = weightMin;
    }

    /**
     * @return the weightMax
     */
    public String getWeightMax() {
        return weightMax;
    }

    /**
     * @param weightMax the weightMax to set
     */
    public void setWeightMax(String weightMax) {
        this.weightMax = weightMax;
    }
    
         public void registerInterestedIn() throws Exception{
        
        Database database = new Database();
        database.connect();
        PreparedStatement insertCommentQuery = database.connection.prepareStatement("INSERT INTO COMMENT (id,"
                + "                                                                                       maritalStatus,"
                + "                                                                                       gender,"
                + "                                                                                       hairColor,"
                + "                                                                                       eyeColor,"
                + "                                                                                       heightMin,"
                + "                                                                                       heightMax,"
                + "                                                                                       weightMin,"
                + "                                                                                       weightMax,"
                + "                                                                                       minAge,"
                + "                                                                                       maxAge,"
                + "                                                                                       profession,"
                + "                                                                                       nationality,"
                + "                                                                                       religion,"
                + "                                                                                       hobbies;)" +
                "VALUES(?,?,?,?,?,?,?,?,?,?,,?,?,?,?,?)");
        insertCommentQuery.setInt(1, this.id);
        insertCommentQuery.setString(2, this.maritalStatus);
        insertCommentQuery.setString(3, this.gender);
        insertCommentQuery.setString(4, this.hairColor);
        insertCommentQuery.setString(5, this.eyeColor);
        insertCommentQuery.setString(6, this.heightMin);
        insertCommentQuery.setString(7, this.heightMax);
        insertCommentQuery.setString(8, this.weightMin);
        insertCommentQuery.setString(9, this.weightMax);
        insertCommentQuery.setString(10, this.minAge);
        insertCommentQuery.setString(11, this.maxAge);
        insertCommentQuery.setString(12, this.profession);
        insertCommentQuery.setString(13, this.nationality);
        insertCommentQuery.setString(14, this.religion);
        insertCommentQuery.setString(15, this.hobbies);
        
        database.insert(insertCommentQuery);
        database.disconnect();
        
                
    }
    
}
