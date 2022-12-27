package listTest;
import java.util.ArrayList;
import java.util.Iterator;

public class arrayListTest {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add("hi");
        list1.add(45);
        list1.add(9);
        list1.add(17);
        list1.add(64);
        list1.add(9);
        
        //输出list的长度，注意，length是针对数组使用的
        System.out.println("这是一个包含"+list1.size()+"个元素的集合："+list1);     

        //创建一个指定元素类型的数组
        //ArrayList<Integer> list = new ArrayList<Integer>();
        //list.add("hi");

        //创建一个具有初始容量的list
        System.out.print("创建一个初始容量为5的集合: ");
        ArrayList list_capacity = new ArrayList();
        int Num = 5;
        list_capacity.ensureCapacity(Num);
        for(int i=0; i< Num; i++){
            list_capacity.add("obj");
        }
        System.out.println(list_capacity);
        System.out.println("========================");


        //使用Iterator迭代器方式
        System.out.print("使用迭代器打印元素： ");
        Iterator iterator = list1.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+ " ");
        }
        System.out.println();

        //使用增强for循环
        System.out.print("使用增强for循环打印元素: ");
        for (Object i : list1) {
            System.out.print(i+" ");
        }
        System.out.println();

        //使用普通for循环
        System.out.print("使用普通for循环打印元素: ");
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i)+" ");
        }
        System.out.println();
        System.out.println("=========================");

        //创建一个新list
        ArrayList list2 = new ArrayList();
        list2.add(33);
        list2.add(24);
        list2.add(89);

        //从index位置开始，将另一个集合添加至原集合中，包含index
        list1.addAll(3, list2);         //注意：add()与addAll()的区别
        System.out.println("增长后list1是一个含有"+list1.size() +"个元素的集合："+list1);
        System.out.println("=============================");

        //返回index位置的元素内容
        System.out.println("index=2处的元素为："+ list1.get(2));

        //返回集合中第一次出现指定元素的索引，若没有，返回-1
        System.out.println("第一次出现元素24的index="+list1.indexOf(24));
        System.out.println("list集合包含元素rose吗？ "+list1.indexOf("rose"));

        //返回集合中最后一次出现指定元素的索引，若没有，返回-1
        System.out.println("最后一次出现元素89的index="+list1.lastIndexOf(89));

        //移除index位置的元素
        list1.remove(2);
        System.out.println("移除index=2处的元素后得到的集合为："+list1);

        //在index位置替换元素
        list1.set(1,100);
        System.out.println("将index=1处的元素替换为100后，该集合为："+list1);

        //查看是否包含某元素，包含则返回true
        System.out.println("是否包含元素89？ "+list1.contains(89));

        //查看list2中元素是否全部存在于list1中，全部存在返回true，否则返回FALSE
        System.out.println("list全部包含list2吗？ "+list1.containsAll(list2));    //list2 =[33,24,89]

        //移除指定list中的全部元素
        list1.removeAll(list2);    //移除成功返回true
        System.out.println("移除list2后的list1为： "+list1);

        //清空list元素
        list1.clear();
        System.out.println(list1);
    }
}






