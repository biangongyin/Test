/**
 * 一个链表是不是有环，有环的环的入口位置和长度
 * @author Administrator
 *
 */
public class Demo3 {

	class ListNode{
        ListNode next;
    }
	
	//找出链表是否有环
	boolean isLinkedListContainsLoop(ListNode head){
        if(head==null){
            return false;
        }
        ListNode slowPtr=head;
        ListNode fastPtr=head;
        while(slowPtr.next!=null && fastPtr.next.next!=null){
            slowPtr=slowPtr.next;
            fastPtr=fastPtr.next.next;
            if(slowPtr==fastPtr){
                return true;
            }
        }
        return false;
    }
	
	//查找环的入口
	ListNode findLinkedListLoopBegin(ListNode head){
        if(head==null){
            return null;
        }
        ListNode slowPtr=head;
        ListNode fastPtr=head;
        boolean isLinkedListContainsLoop=false;
        while(slowPtr.next!=null && fastPtr.next.next!=null){
            slowPtr=slowPtr.next;
            fastPtr=fastPtr.next.next;
            if(slowPtr==fastPtr){
                isLinkedListContainsLoop=true;
                break;
            }
        }
        if(isLinkedListContainsLoop){
            slowPtr=head;
            while(slowPtr!=fastPtr){
                slowPtr=slowPtr.next;
                fastPtr=fastPtr.next;
            }
            return slowPtr;
        }
        return null;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
