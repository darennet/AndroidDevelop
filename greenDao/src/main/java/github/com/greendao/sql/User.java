package github.com.greendao.sql;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

/**
 * Entity mapped to table "USER".
 */
public class User {

    private Long id;
    /**
     * Not-null value.
     */
    private String userName;
    /**
     * Not-null value.
     */
    private String userSex;

    public User() {
    }

    public User(Long id) {
        this.id = id;
    }

    public User(Long id, String userName, String userSex) {
        this.id = id;
        this.userName = userName;
        this.userSex = userSex;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Not-null value.
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Not-null value; ensure this value is available before it is saved to the database.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Not-null value.
     */
    public String getUserSex() {
        return userSex;
    }

    /**
     * Not-null value; ensure this value is available before it is saved to the database.
     */
    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

}
