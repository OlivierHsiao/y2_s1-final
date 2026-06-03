public class MyException extends Exception {
    public MyException() {
        super("This is my exception");
    }

    public MyException(String Message) {
        super(Message);
    }

    public static void main(String[] arg) throws MyException {
        // try {
        MyException a = new MyException();
        MyException b = new MyException("This is my exception b");
        throw a;
        // throw b;
        // } catch (MyException e) {
        // System.out.println(e);
        // }

        // opt1: try and catch
        // opt2: throws
        // do either before compile the code if it is checked
    }
}
