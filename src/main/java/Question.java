import java.util.Date;

public class Question {
    int id;
    String content;
    TypeQuestion type;
    CategoryQuestion category;
    Account creator;
    Date createDate;

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", type=" + type +
                ", category=" + category +
                ", creator=" + creator +
                ", createDate=" + createDate +
                '}';
    }
}
