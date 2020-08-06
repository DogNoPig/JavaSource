import java.util.ArrayList;
import java.util.List;

/**
 *
 * >>表示右移，如果该数为正，则高位补0，若为负数，则高位补1；
 * >>>表示无符号右移，也叫逻辑右移，即若该数为正，则高位补0，而若该数为负数，则右移后高位同样补0
 * @author xw
 * @date 2020/7/1 17:15
 */
public class TestArrayList {

    public static int getX(){
        System.out.println(1 << 30);
        return 1 << 30;
    }

    public static void main(String[] args) {
        //二进制数位右移 超过最后一位 补0
        int i = 20;//1000
        int a = i >> 0;//右移0位 不变 8
        int j = i >> 1;//右移1位高位补0 取值的1/2 向下取整 2^1 4
        int k = i >> 2;//右移2位高位补0 取值的1/4 向下取整 2^2 2
        i = -20;
        int l = i >> 3;//右移3位高位补0 取值的1/8 向下取整 2^3 1
        int b = i >> 4;//右移4位高位补0 取值的1/16 向下取整 2^4 0
        System.out.println(a);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(b);
        int getX = getX();
        System.out.println("--------getX值=" + getX + "," + "当前类=TestArrayList.main()");
    }
}
