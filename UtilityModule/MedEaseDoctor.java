package MedEaseNavigator.UtilityModule;

public class MedEaseDoctor {
private String name;
private int PhnNumber,age;
private int DID;
private String Username;
private String pswd;
private  Boolean IsVlaid;
/*Getter method */
public int getAge() {
    return age;
}
public int getDID() {
    return DID;
}
public String getName() {
    return name;
}
public int getPhnNumber() {
    return PhnNumber;
}
public String getPswd() {
    return pswd;
}
public String getUsername() {
    return Username;
}
public Boolean getIsVlaid() {
    return IsVlaid;
}

/*Setter Method */
public void setAge(int age) {
    this.age = age;
}
public void setUsername(String username) {
    Username = username;
}
public void setDID(int dID) {
    DID = dID;
}
public void setName(String name) {
    this.name = name;
}
public void setPhnNumber(int PhnNumber) {
    this.PhnNumber = PhnNumber;
}
public void setPswd(String pswd) {
    this.pswd = pswd;
}
public void setIsVlaid(Boolean isVlaid) {
    IsVlaid = isVlaid;
}

}
