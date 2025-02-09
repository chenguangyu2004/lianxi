package Rongqi;

//实现泛型接口时指定具体数据类型

public class IGenericImpl implements IGeneric<String>{
    @Override
    public String getName(String name){
        return name;
    }
}
