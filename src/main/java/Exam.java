import java.util.Arrays;
import java.util.Date;

public class Exam {
    int id;
    String code;
    String title;
    CategoryQuestion categorys;
    int duration;
    Account creator;
    Date createDate;
    Question[] questions;

    @Override
    public String toString() {
        return "Exam{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", title='" + title + '\'' +
                ", categorys=" + categorys +
                ", duration=" + duration +
                ", creator=" + creator +
                ", createDate=" + createDate +
                ", questions=" + Arrays.toString(questions) +
                '}';
    }
}

