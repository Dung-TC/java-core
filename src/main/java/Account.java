import java.util.Date;

public class Account {
    int  id;
    String email;
    String userName;
    String fullName;
    Department department;
    Position position;
    Date createdDate;
    Group[] groups;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", department=" + department +
                ", position=" + position +
                ", createdDate=" + createdDate +
                '}';
    }
}
