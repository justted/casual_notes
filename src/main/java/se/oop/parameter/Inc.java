package se.oop.parameter;

/**
 * @Author: Justted Chen
 * @Description:
 * @Date: Created at 11:32 2017/11/16
 * @Modified By:
 */
public class Inc {
    public static void main(String[] args) {
        Inc inc = new Inc();
        int i = 0;
        inc.fermin(i);
        i= i ++;
        System.out.println(i);

    }
    void fermin(int i){
        i++;
    }
}

