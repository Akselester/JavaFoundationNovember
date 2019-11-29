package exceptions;

public class ExceptionRunner {
    public static void main(String[] args) {
//        throw new MyException("Моя ошибка");

        Man maaaaan = new Man();
        System.out.println(maaaaan.getAge());
//        System.out.println(maaaaan.getName().compareTo(""));
        try {
            maaaaan.setAge(-5);
            maaaaan.setAge(2);
        } catch (MyException e) {
            System.out.println("Ошибка возраста");
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }

    }
}
