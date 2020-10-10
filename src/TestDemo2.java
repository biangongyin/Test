import java.util.LinkedHashMap;
/**
 * LRU算法，就是一个容量满了，在添加数据时将最近最少使用得元素移除后添加
 * @author dell
 *
 */
public class TestDemo2 {

	public static void main(String[] args) {
        int[] array = {4, 3, 4, 2, 3, 1, 4, 2 };//要输入数字的序列

        LinkedHashMap<Integer, Boolean> map = new LinkedHashMap<Integer, Boolean>()
                {
                    private static final long serialVersionUID = 1L;
                    
                    @Override
                    protected boolean removeEldestEntry(
                            java.util.Map.Entry<Integer, Boolean> eldest) {
                        return size() > 3;//此处MAP最大容量为3，大于3的从最老的map移除
                    }
                };
        
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
            if (map.containsKey(array[i]))
            {
                map.remove(array[i]);
            }
            
            map.put(array[i], true);
            System.out.println(map);
        }
    }
}
