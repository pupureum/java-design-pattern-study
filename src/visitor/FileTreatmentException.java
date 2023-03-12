package visitor;

public class FileTreatmentException extends Exception{
    public FileTreatmentException() {}

    public FileTreatmentException(String msg) {
        super(msg);
    }

    @Override
    public void printStackTrace() {
        System.out.println("파일 에러입니다");
        super.printStackTrace();
    }
}
