package Class21;

public abstract class File {

    String name;
    double size;

    abstract void openFile();
    abstract void editFile();
    abstract void closeFile();

    }
class JavaFile extends File{

    @Override
    void openFile() {
        System.out.println("Open java");
    }

    @Override
    void editFile() {
        System.out.println("Edit java");

    }

    @Override
    void closeFile() {
        System.out.println("Close java");

    }
}
class WordFile extends File {

    @Override
    void openFile() {
        System.out.println("Open word file");
    }

    @Override
    void editFile() {
        System.out.println("Edit word file");

    }

    @Override
    void closeFile() {
        System.out.println("Close word file");
    }
}
class PdfFile extends File {

    @Override
    void openFile() {
        System.out.println("Open pdf file");
    }

    @Override
    void editFile() {
        System.out.println("Edit pdf file");

    }

    @Override
    void closeFile() {
        System.out.println("Close pdf file");
    }
}