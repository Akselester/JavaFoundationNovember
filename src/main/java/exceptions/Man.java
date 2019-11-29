package exceptions;

public class Man {
    private int age;
    private String name;

    public Man() {
    }

    public void setAge(int age) throws MyException {
//        if (age < 0) throw new MyRuntimeException("Возраст " +
//                "не может быть отрицательным");

        if (age < 0) {
            throw new MyException("Возраст " +
                    "не может быть отрицательным");
        } else if (age > 120) {
            throw new MyException("Слишком большой возраст");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
