import java.util.LinkedHashMap;
/**
 * LRU�㷨������һ���������ˣ����������ʱ���������ʹ�õ�Ԫ���Ƴ������
 * @author dell
 *
 */
public class TestDemo2 {

	public static void main(String[] args) {
        int[] array = {4, 3, 4, 2, 3, 1, 4, 2 };//Ҫ�������ֵ�����

        LinkedHashMap<Integer, Boolean> map = new LinkedHashMap<Integer, Boolean>()
                {
                    private static final long serialVersionUID = 1L;
                    
                    @Override
                    protected boolean removeEldestEntry(
                            java.util.Map.Entry<Integer, Boolean> eldest) {
                        return size() > 3;//�˴�MAP�������Ϊ3������3�Ĵ����ϵ�map�Ƴ�
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
