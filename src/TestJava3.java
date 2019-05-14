import java.util.ArrayList;
import java.util.List;
//java实现加减法,与数组的声明和List集合
public class TestJava3 {
    //main函数,说明该类可以进行启动
    public static void main(String[] args) {
        //Object类型的数组并赋值了
        Object[] valuesArr = {12.3, 332, 314, 23, 122, 412, 31, 32, 12};
        //创建了一个List集合,类型是Object,底层是数组实现
        List<Object> values = new ArrayList<>();
        //foreach循环,等同于for(int i=0;i<valuesArr.length;i++){values.add(valuesArr[i])}
        for (Object value : valuesArr) {
            values.add(value);
        }
        //list的长度先获取到
        int length = values.size();
        //正常的for循环
        for(int i=0;i<length-1;i++){
            //调用add相加方法把集合中的当前下标与下标+1上的数据相加
            //并获取结果addResult
            Object addResult = add(values.get(i), values.get(i + 1));
            Object wrongResult = wrongAdd(values.get(i), values.get(i + 1));
            //输出结果,类似console.log(...)
            System.out.println("这次相加的结果:"+obj2String(addResult)+",错误的相加方式结果为:"+obj2String(wrongResult));
            //调用minus相加方法把集合中的当前下标与下标+1上的数据相减
            //并获取结果minusResult
            Object minusResult = minus(values.get(i), values.get(i + 1));
            //输出结果,类似console.log(...)
            System.out.println("这次相减的结果:"+obj2String(minusResult));
        }

    }

    //本类的私有方法,add
    private static Object add(Object a, Object b) {
        //转换为double类型
        double v = Double.parseDouble(a.toString());
        double v1 = Double.parseDouble(b.toString());
        return v + v1;
    }
    //错误的相加方式
    private static Object wrongAdd(Object a, Object b){
        return a+b.toString();
    }


    //本类的私有方法,minus
    private static Object minus(Object left, Object right) {
        //转换为double类型
        double lv = Double.parseDouble(left.toString());
        double rv = Double.parseDouble(right.toString());
        return lv - rv;
    }

    //本类的私有方法,获取对象类型的toString()
    private static String obj2String(Object o){
        return o.toString();
    }
}
