package exceptions;

public class HomeworkExceptionsRunner {
    public static void main(String[] args) {
//        I'm trying to use my method now
//        This case when I processing exception immediately by try-catch block
        try {
            testMethod(true);
            testMethod(false);
        } catch (MyHomeworkException thatException) {
            System.out.println("It happens ;)");
            thatException.printStackTrace();
        } finally {
            System.out.println("That's all, guys!");
        }
    }

    //    This method trows the checked exception in this body. It means i MUST do something with it.
//    The exception appears into the body of this method and if I don't process it by try-catch construction,
//    I must throw this exception forward. I'm doing that by "throws MyHomeworkException" directive after
//    arguments declaration. In this case I will must to process this exception when i will use this method.
    private static void testMethod(boolean flag) throws MyHomeworkException {
        if (flag) {
            System.out.println("Method works correctly");
            return;
        }
//        This case when i throwing exception forward
        throw new MyHomeworkException("Now method throws the exception because I want this");
    }
}
