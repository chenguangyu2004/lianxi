package Rongqi;

public class Test {
    public static void main(String[] args) {
        IGeneric<String> iGeneric = new IGenericImpl();
        String oldlu = iGeneric.getName("oldlu");
        System.out.println(oldlu);

        IGeneric<String> iGeneric1 = new IGenericImpl2<>();
        String itbz = iGeneric1.getName("ITBZ");
        System.out.println(itbz);
    }
}
