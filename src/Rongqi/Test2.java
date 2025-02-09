package Rongqi;

public class Test2 {
    public static void main(String[] args) {
        /*MethonGeneric methonGeneric = new MethonGeneric();
        methonGeneric.setName("chen");
        Integer age = methonGeneric.getAge(23);
        System.out.println(age);
        */
        MethonGeneric methonGeneric = new MethonGeneric();
        String[ ] arr = new String[]{"a","b","c"};
        Integer[] arr2 = new Integer[]{1, 2,3,4};
        methonGeneric.method(arr);
        methonGeneric.method(arr2);
    }
}
