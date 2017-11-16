package se.oop.parameter;

/**
 * @Author: Justted Chen
 * @Description: 要明确的一点事StrinBuufer类作为参数传递时‘引用传递’，即传的是地址值！
 * 这里的x和Y指代的就是a引用指向的地址A，在地址A上有A这栋楼，同理，搁Y这个指向的是地址B上的B楼。
 * 在方法里的操作，都是对指向地址的操作。所以对于x的Appen方法，对应到就是说A这栋楼还得再加个几层，是对实际的楼进行操作。
 * 而y=x是指，原来的那个B吧它指向的B楼，本来Y也是跟着指的，但是现在Y这儿变了，发现A楼多加了几层房价降了，跟着也指着A楼切了。
 * 只是Y变了，但原来的B还是指向的B楼，因为B楼开发商给它发的工资高。
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
         * @param x
         * @param y
         * @Return void
         * @Description:
         * @Date: 0:01 2017/11/16
         */
        x.append(y);

        y=x;

    }

}
