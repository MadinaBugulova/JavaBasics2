package Class21;

public class FileTester {
    public static void main(String[] args) {
        File [] arr={ new JavaFile(), new PdfFile(), new WordFile() };
        for (File f:arr){
            f.openFile();
            f.editFile();
            f.closeFile();
        }
    }

}
