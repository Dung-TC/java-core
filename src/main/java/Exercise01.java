public class Exercise01 {
    void question01() {
        Department department = new Department();
        department.name = "Bảo vệ";

        Account account = new Account();
        account.department = department;

        if (account.department == null){
            System.out.println("Không có phòng ban");
        } else {
            System.out.println("phong ban của " + account.userName " là " + department.name);
        }

    }
}
