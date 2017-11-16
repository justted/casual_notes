package se.exception;

/**
 * @Author: Justted Chen
 * @Description:
 * @Date: Created at 15:22 2017/11/16
 * @Modified By:
 */
public class finallyTest {

    /*任何执行try 或者catch中的return语句之前，都会先执行finally语句，如果finally存在的话。
      如果finally中有return语句，那么程序就return了，所以finally中的return是一定会被return的，
      编译器把finally中的return实现为一个warning。*/
    public boolean returnTest()
    {
        try
        {
            return true;
        }
        catch (Exception e)
        {

        }
        finally
        {
            return false;
        }
    }

    /*在try语句中，在执行return语句时，要返回的结果已经准备好了，就在此时，程序转到finally执行了。
      在转去之前，try中先把要返回的结果存放到不同于x的局部变量中去，执行完finally之后，在从中取出返回结果，
      因此，即使finally中对变量x进行了改变，但是不会影响返回结果。它应该使用栈保存返回值。
      重点：finally是在return后面的表达式运算后执行的（此时并没有返回运算后的值，而是先把要返回的值保存起来，
      不管finally中的代码怎么样，返回的值都不会改变，任然是之前保存的值），
      所以函数返回值是在finally执行前确定的*/
    static int test()
    {
        int x = 1;
        try
        {
            x++;
            return x;
        }
        finally
        {
            ++x;
        }
    }

    public static void main(String[] args) {
        finallyTest T = new finallyTest();
        System.out.println(T.returnTest());
        System.out.println(test());
    }

}
