package collections;

public class MyArrayListRunner {
    public static void main(String[] args) {
//        MyArrayList<Integer> myArrayList = new MyArrayList<>();
//        myArrayList.add(10);
//        System.out.println(myArrayList.toString());
        MyArrayList<String> stringMyArrayList = new MyArrayList<>();
        System.out.println("is empty: " + stringMyArrayList.isEmpty());
        stringMyArrayList.add("1");
        System.out.println("is empty: " + stringMyArrayList.isEmpty());
        stringMyArrayList.add("2");
        stringMyArrayList.add("3");
        stringMyArrayList.add("3");
        stringMyArrayList.add("3");
        stringMyArrayList.add("3");
        stringMyArrayList.add("3");
        stringMyArrayList.add("3");
        stringMyArrayList.add("3");
        stringMyArrayList.add("3");
        System.out.println(stringMyArrayList.toString());
        System.out.println("size " + stringMyArrayList.size());
        stringMyArrayList.add("4");
        System.out.println(stringMyArrayList.toString());
        System.out.println("size " + stringMyArrayList.size());
        System.out.println("Index of \"2\" = " + stringMyArrayList.indexOf("2"));
        System.out.println("Contains \"a\": " + stringMyArrayList.contains("a"));
        System.out.println("Contains \"3\": " + stringMyArrayList.contains("3"));
        System.out.println("Contains \"4\": " + stringMyArrayList.contains("4"));
        stringMyArrayList.remove("1");
        System.out.println("Removed \"1\": " + stringMyArrayList.toString());
        System.out.println("size " + stringMyArrayList.size());
        stringMyArrayList.remove("4");
        System.out.println("Removed \"4\": " + stringMyArrayList.toString());
        System.out.println("size " + stringMyArrayList.size());
        stringMyArrayList.remove("3");
        System.out.println("Removed \"3\": " + stringMyArrayList.toString());
        System.out.println("size " + stringMyArrayList.size());
        System.out.println("get(0) " + stringMyArrayList.get(0));
        stringMyArrayList.set(2, "4");
        System.out.println("set(2, \"4\"): " + stringMyArrayList.toString());
    }
}
