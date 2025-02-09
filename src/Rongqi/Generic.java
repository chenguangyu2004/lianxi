package Rongqi;

public class Generic<T>{
    private T flag;
    public T getFlag() {
        return this.flag;
    }
    public void setFlag(T flag) {
        this.flag = flag;
    }

    public static void main(String[] args) {
        Generic<String> generic = new Generic<String>();
        generic.setFlag("Oldlu");
        String flag = generic.getFlag();
        System.out.println(flag);

        Generic<Integer> generic1 = new Generic<>();
        generic1.setFlag(123);
        Integer flag1 = generic1.getFlag();
        System.out.println(flag1);
    }
}
