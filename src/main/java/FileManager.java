import java.io.File;
import java.io.IOException;

public class FileManager {

    public static boolean exists(String path){
        File file = new File(path);
        return file.exists();
    }

    // Tạo mới file
    public static boolean createFile(String path) throws IOException {
        if (exists(path)){
            throw new IllegalStateException("lôix");
        }

        File file = new File(path);
        return file.createNewFile();
    }

    // xoá file
    public static boolean delete(String path){
        if (!exists(path)){
            throw new IllegalStateException("lỗi, phai chưa tồn tại");
        }

        File file = new File(path);
        return file.delete();
    }

    // kiểm tra file
    public static boolean isFile(String path){
        File file = new File(path);
        return file.isFile();
    }


    // kểm tra folder
    public static boolean isFolder(String path){
        File file = new File(path);
        return file.isDirectory();
    }

    // lấy ra danh sachs file có trong folder
    public  static String[] list(String path) {
        File file = new File(path);
        return file.list();
    }




}
