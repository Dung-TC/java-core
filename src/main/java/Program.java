import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Department department1 = new Department();
        department1.id = 1;
        department1.name = "Sale";

        Department department2 = new Department();
        department2.id = 2;
        department2.name ="Trainee";

        Department department3 = new Department();
        department3.id = 3;
        department3.name ="language AI";
//------------------------------------------------------------

        Position position1 = new Position();
        position1.id = 1;
        position1.name = PositionName.DEV;

        Position position2 = new Position();
        position2.id = 2;
        position2.name = PositionName.SCRUM_MASTER;

        Position position3 = new Position();
        position3.id = 3;
        position3.name = PositionName.TEST;
//-------------------------------------------------------------

        Account account1 = new Account();
        account1.id = 1 ;
        account1.email = "nguyenvanA@gmial.com";
        account1.userName = "nguyenVan";
        account1.fullName = "nguyen van A";
        account1.department = department2;
        account1.position = position1;
        account1.createdDate = new Date();

        Account account2 = new Account();
        account2.id = 2 ;
        account2.email = "nguyenvanB@gmial.com";
        account2.userName = "nguyenVanB";
        account2.fullName = "nguyen van B";
        account2.department = department2;
        account2.position = position3;
        account2.createdDate = new Date();

        Account account3 = new Account();
        account3.id = 3 ;
        account3.email = "nguyenvanC@gmial.com";
        account3.userName = "nguyenVanC";
        account3.fullName = "nguyen van C";
        account3.department = department1;
        account3.position = position2;
        account3.createdDate = new Date();
//-----------------------------------------------------------

        Group group1 = new Group();
        group1.id = 1;
        group1.name = "Group1";
        group1.creator = account1;
        group1.createDate = new Date();

        Group group2 = new Group();
        group2.id = 2;
        group2.name = "Group2";
        group2.creator = account3;
        group2.createDate = new Date();

        Group group3 = new Group();
        group3.id = 3;
        group3.name = "Group3";
        group3.creator = account2;
        group3.createDate = new Date();
//--------------------------------------------------------


        TypeQuestion typeQuestion1 = new TypeQuestion();
        typeQuestion1.id = 1;
        typeQuestion1.name = TypeName.MULTIPLE_CHOICE;

        TypeQuestion typeQuestion2 = new TypeQuestion();
        typeQuestion2.id = 2;
        typeQuestion2.name = TypeName.ESSAY;

        TypeQuestion typeQuestion3 = new TypeQuestion();
        typeQuestion3.id = 3;
        typeQuestion3.name = TypeName.MULTIPLE_CHOICE;
//---------------------------------------------------------------

        CategoryQuestion categoryQuestion1 = new CategoryQuestion();
        categoryQuestion1.id = 1;
        categoryQuestion1.name = "java";

        CategoryQuestion categoryQuestion2 = new CategoryQuestion();
        categoryQuestion2.id = 2;
        categoryQuestion2.name = "SQL";

        CategoryQuestion categoryQuestion3 = new CategoryQuestion();
        categoryQuestion3.id = 3;
        categoryQuestion3.name = "Ruby";
//--------------------------------------------------------------------------

        Question question1 = new Question();
        question1.id = 1;
        question1.content = "Mặt trăng có hình tròn, đúng hay sai?";
        question1.category = categoryQuestion3;
        question1.type = typeQuestion2;
        question1.creator = account2;
        question1.createDate = new Date();


        Question question2 = new Question();
        question2.id = 2;
        question2.content = "Chim cánh cụt có khả năng bay, đúng hay sai?";
        question2.category = categoryQuestion1;
        question2.type = typeQuestion1;
        question2.creator = account1;
        question2.createDate = new Date();

        Question question3 = new Question();
        question3.id = 3;
        question3.content = "Bất kỳ hình vuông nào đều có bốn góc, đúng hay sai?";
        question3.category = categoryQuestion2;
        question3.type = typeQuestion1;
        question3.creator = account3;
        question3.createDate = new Date();
//-----------------------------------------------------------------------------

        Answer answer1 = new Answer();
        answer1.id = 1;
        answer1.content = "Hình tròn";
        answer1.question = question1;
        answer1.isCorrect = true;

        Answer answer2 = new Answer();
        answer2.id = 2;
        answer2.content = "không có khả năng bay";
        answer2.question = question2;
        answer2.isCorrect = false;

        Answer answer3 = new Answer();
        answer3.id = 3;
        answer3.content = "Bốn góc";
        answer3.question = question3;
        answer3.isCorrect = true;
//----------------------------------------------------------------------------

        Exam exam1 = new Exam();
        exam1.id = 1;
        exam1.title = "Thi học kỳ 1";
        exam1.categorys = categoryQuestion2;
        exam1.duration = 60;
        exam1.creator = account3;
        exam1.createDate = new Date();

        Exam exam2 = new Exam();
        exam2.id = 2;
        exam2.title = "Thi học kỳ 2";
        exam2.categorys = categoryQuestion3;
        exam2.duration = 60;
        exam2.creator = account3;
        exam2.createDate = new Date();

        Exam exam3 = new Exam();
        exam3.id = 3;
        exam3.title = "kiểm tra giữa giờ";
        exam3.categorys = categoryQuestion1;
        exam3.duration = 60;
        exam3.creator = account3;
        exam3.createDate = new Date();


//-----------------------------------------------------------------------------
        group1.accounts = new Account[] {account1,account3};
        group2.accounts = new Account[] {account2};
        group3.accounts = new Account[] {account2,account1,account3};

        account1.groups = new Group[] {group1};
        account2.groups = new Group[] {group1,group3};
        account3.groups = new Group[] {group1,group2,group3};

        System.out.println(exam3);

    }
}
