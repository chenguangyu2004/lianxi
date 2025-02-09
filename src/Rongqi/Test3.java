package Rongqi;

public class Test3 {
    public static void main(String[] args) {
        ShowMsg showMsg = new ShowMsg();
        Generic<Integer> generic = new Generic<>();
        generic.setFlag(20);
        showMsg.showFlag(generic);

        Generic<Number> generic1 = new Generic<>();
        generic1.setFlag(30);
        showMsg.showFlag(generic1);

        Generic<String> generic2 = new Generic<>();
        generic2.setFlag("Oldlu");
        showMsg.showFlag(generic2);
    }
}
