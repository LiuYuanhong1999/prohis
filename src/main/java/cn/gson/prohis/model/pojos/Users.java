package cn.gson.prohis.model.pojos;


public class Users {

  private Integer userId;

  private String userName;
  private String userPass;
  private Integer numbers;

  public Integer getNumbers() {
    return numbers;
  }

  public void setNumbers(Integer numbers) {
    this.numbers = numbers;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getUserPass() {
    return userPass;
  }

  public void setUserPass(String userPass) {
    this.userPass = userPass;
  }
}