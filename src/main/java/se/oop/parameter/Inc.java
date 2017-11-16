package se.oop.parameter;

/**
 * @Author: Justted Chen
 * @Description:
 * @Date: Created at 11:32 2017/11/16
 * @Modified By:
 */
public class Inc {
    /*    i++实现原理：
        int getI(int &i){
        int temp = i;
        i++;
        return temp;
        }
        注意这里写成 &i 是为了说明不是传值
        */
    public static void main(String[] args) {
        Inc inc = new Inc();
        int i = 0;
        inc.fermin(i);
        i= i ++;
        System.out.println(i);

    }

    /*1.对象就是传引用
      2.原始类型就是传值
      3.String类型因为没有提供自身修改的函数，每次操作都是新生成一个String对象，所以要特殊对待。可以认为是传值。
      在本题中是基本数据类型，基本数据类型是值传递，因此这里不改变i的值
      */
    void fermin(int i){
        i++;
    }
}

