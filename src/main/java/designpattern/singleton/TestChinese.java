package designpattern.singleton;

/**
 * @Author: Justted Chen
 * @Description:
 * @Date: Created at 14:56 2017/11/21
 * @Modified By:
 */
class Chinese{

    private static Chinese objref =new Chinese();

    private Chinese(){}

    public static Chinese getInstance() { return objref; }

}

/*饿汉式在类创建的同时就已经创建好一个静态的对象供系统使用，以后不再改变，所以天生是线程安全的。
 */
public class TestChinese {

    public static void main(String [] args) {

        Chinese obj1 = Chinese.getInstance();

        Chinese obj2 = Chinese.getInstance();

        System.out.println(obj1 == obj2);

    }

}
