package question;

import java.util.ArrayList;
import java.util.List;

public class Q19_Remove_Nth_Node_From_End_of_List {


    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        List<ListNode> tmp = new ArrayList<>();

        ListNode tail = head;

        while (tail != null) {
            tmp.add(tail);
            tail = tail.next;
        }

        int index = tmp.size() - n;
        if (index == 0) {
            //去掉第一个
            if (tmp.size() > 1) {
                head = tmp.get(1);
            } else {
                head = null;
            }
        } else if (index == tmp.size() - 1) {
            //去掉最后一个
            tmp.get(index-1).next = null;
        } else if (index < tmp.size() - 1) {
            //去掉中间的
            tmp.get(index-1).next = null;
            tmp.get(index-1).next = tmp.get(index + 1);
        }
        return head;

    }

    public static void main(String[] args) {

    }

}
