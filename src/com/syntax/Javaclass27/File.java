package com.syntax.Javaclass27;
public abstract class File {
    public void edit(){
        System.out.println("Edit your document");
    }
    public void close(){
        System.out.println("Saving and closing document");
    }
    public abstract void open();
}
class JavaFile extends  File{
    @Override
    public void open() {
        System.out.println("To open Java file, need notepad++ or sublime text");
    }
}
class WordFile extends File{
    @Override
    public void open() {
        System.out.println("To open Word document, need Microsoft word");
    }
}
class PdfFile extends File{
    @Override
    public void open() {
        System.out.println("to open PDF file, need notepad");
    }
}
class FileTester{
    public static void main(String[] args) {
        File[] files={new JavaFile(),new PdfFile(),new WordFile()};
        for (File file:files){
            file.open();
        }
    }
}