package se.parameter;

/**
 * @Author: Justted Chen
 * @Description:
 * @Date: Created at 22:54 2017/11/15
 * @Modified By:
 */
public class foo {

    public static void main(String sgf[]) {

        StringBuffer a=new StringBuffer("A");

        StringBuffer b=new StringBuffer("B");

        operate(a,b);

        System.out.println(a+"."+b);

    }

    static void operate(StringBuffer x,StringBuffer y) {
    /**
     * @Author: Justted Chen
     * @param null
     * @Return void
     * @Description:
     * @Date: 23:53 2017/11/15
     */

        x.append(y);

        y=x;

    }

}
