package hello.springboot.model;

import java.io.Serializable;
import java.util.Date;

public class Evk_users implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column evk_users.UserID
     *
     * @mbg.generated
     */
    private String userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column evk_users.UserSerial
     *
     * @mbg.generated
     */
    private String userserial;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column evk_users.Comments
     *
     * @mbg.generated
     */
    private String comments;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column evk_users.Password
     *
     * @mbg.generated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column evk_users.IsLockedOut
     *
     * @mbg.generated
     */
    private Boolean islockedout;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column evk_users.CreationDate
     *
     * @mbg.generated
     */
    private Date creationdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column evk_users.TryCount
     *
     * @mbg.generated
     */
    private Integer trycount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column evk_users.Name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column evk_users.Gender
     *
     * @mbg.generated
     */
    private Boolean gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column evk_users.Birthday
     *
     * @mbg.generated
     */
    private Date birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column evk_users.Company
     *
     * @mbg.generated
     */
    private String company;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column evk_users.Job
     *
     * @mbg.generated
     */
    private String job;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column evk_users.Role
     *
     * @mbg.generated
     */
    private String role;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column evk_users.Phone
     *
     * @mbg.generated
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column evk_users.Fax
     *
     * @mbg.generated
     */
    private String fax;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column evk_users.Address
     *
     * @mbg.generated
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column evk_users.Email
     *
     * @mbg.generated
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column evk_users.LastLoginDate
     *
     * @mbg.generated
     */
    private Date lastlogindate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column evk_users.MAC
     *
     * @mbg.generated
     */
    private String mac;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column evk_users.IP
     *
     * @mbg.generated
     */
    private String ip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column evk_users.Photo
     *
     * @mbg.generated
     */
    private byte[] photo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table evk_users
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column evk_users.UserID
     *
     * @return the value of evk_users.UserID
     *
     * @mbg.generated
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column evk_users.UserID
     *
     * @param userid the value for evk_users.UserID
     *
     * @mbg.generated
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column evk_users.UserSerial
     *
     * @return the value of evk_users.UserSerial
     *
     * @mbg.generated
     */
    public String getUserserial() {
        return userserial;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column evk_users.UserSerial
     *
     * @param userserial the value for evk_users.UserSerial
     *
     * @mbg.generated
     */
    public void setUserserial(String userserial) {
        this.userserial = userserial;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column evk_users.Comments
     *
     * @return the value of evk_users.Comments
     *
     * @mbg.generated
     */
    public String getComments() {
        return comments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column evk_users.Comments
     *
     * @param comments the value for evk_users.Comments
     *
     * @mbg.generated
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column evk_users.Password
     *
     * @return the value of evk_users.Password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column evk_users.Password
     *
     * @param password the value for evk_users.Password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column evk_users.IsLockedOut
     *
     * @return the value of evk_users.IsLockedOut
     *
     * @mbg.generated
     */
    public Boolean getIslockedout() {
        return islockedout;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column evk_users.IsLockedOut
     *
     * @param islockedout the value for evk_users.IsLockedOut
     *
     * @mbg.generated
     */
    public void setIslockedout(Boolean islockedout) {
        this.islockedout = islockedout;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column evk_users.CreationDate
     *
     * @return the value of evk_users.CreationDate
     *
     * @mbg.generated
     */
    public Date getCreationdate() {
        return creationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column evk_users.CreationDate
     *
     * @param creationdate the value for evk_users.CreationDate
     *
     * @mbg.generated
     */
    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column evk_users.TryCount
     *
     * @return the value of evk_users.TryCount
     *
     * @mbg.generated
     */
    public Integer getTrycount() {
        return trycount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column evk_users.TryCount
     *
     * @param trycount the value for evk_users.TryCount
     *
     * @mbg.generated
     */
    public void setTrycount(Integer trycount) {
        this.trycount = trycount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column evk_users.Name
     *
     * @return the value of evk_users.Name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column evk_users.Name
     *
     * @param name the value for evk_users.Name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column evk_users.Gender
     *
     * @return the value of evk_users.Gender
     *
     * @mbg.generated
     */
    public Boolean getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column evk_users.Gender
     *
     * @param gender the value for evk_users.Gender
     *
     * @mbg.generated
     */
    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column evk_users.Birthday
     *
     * @return the value of evk_users.Birthday
     *
     * @mbg.generated
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column evk_users.Birthday
     *
     * @param birthday the value for evk_users.Birthday
     *
     * @mbg.generated
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column evk_users.Company
     *
     * @return the value of evk_users.Company
     *
     * @mbg.generated
     */
    public String getCompany() {
        return company;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column evk_users.Company
     *
     * @param company the value for evk_users.Company
     *
     * @mbg.generated
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column evk_users.Job
     *
     * @return the value of evk_users.Job
     *
     * @mbg.generated
     */
    public String getJob() {
        return job;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column evk_users.Job
     *
     * @param job the value for evk_users.Job
     *
     * @mbg.generated
     */
    public void setJob(String job) {
        this.job = job;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column evk_users.Role
     *
     * @return the value of evk_users.Role
     *
     * @mbg.generated
     */
    public String getRole() {
        return role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column evk_users.Role
     *
     * @param role the value for evk_users.Role
     *
     * @mbg.generated
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column evk_users.Phone
     *
     * @return the value of evk_users.Phone
     *
     * @mbg.generated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column evk_users.Phone
     *
     * @param phone the value for evk_users.Phone
     *
     * @mbg.generated
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column evk_users.Fax
     *
     * @return the value of evk_users.Fax
     *
     * @mbg.generated
     */
    public String getFax() {
        return fax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column evk_users.Fax
     *
     * @param fax the value for evk_users.Fax
     *
     * @mbg.generated
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column evk_users.Address
     *
     * @return the value of evk_users.Address
     *
     * @mbg.generated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column evk_users.Address
     *
     * @param address the value for evk_users.Address
     *
     * @mbg.generated
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column evk_users.Email
     *
     * @return the value of evk_users.Email
     *
     * @mbg.generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column evk_users.Email
     *
     * @param email the value for evk_users.Email
     *
     * @mbg.generated
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column evk_users.LastLoginDate
     *
     * @return the value of evk_users.LastLoginDate
     *
     * @mbg.generated
     */
    public Date getLastlogindate() {
        return lastlogindate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column evk_users.LastLoginDate
     *
     * @param lastlogindate the value for evk_users.LastLoginDate
     *
     * @mbg.generated
     */
    public void setLastlogindate(Date lastlogindate) {
        this.lastlogindate = lastlogindate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column evk_users.MAC
     *
     * @return the value of evk_users.MAC
     *
     * @mbg.generated
     */
    public String getMac() {
        return mac;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column evk_users.MAC
     *
     * @param mac the value for evk_users.MAC
     *
     * @mbg.generated
     */
    public void setMac(String mac) {
        this.mac = mac;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column evk_users.IP
     *
     * @return the value of evk_users.IP
     *
     * @mbg.generated
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column evk_users.IP
     *
     * @param ip the value for evk_users.IP
     *
     * @mbg.generated
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column evk_users.Photo
     *
     * @return the value of evk_users.Photo
     *
     * @mbg.generated
     */
    public byte[] getPhoto() {
        return photo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column evk_users.Photo
     *
     * @param photo the value for evk_users.Photo
     *
     * @mbg.generated
     */
    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
}