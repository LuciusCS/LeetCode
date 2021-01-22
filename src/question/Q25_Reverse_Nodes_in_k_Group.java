package question;

import defination.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Q25_Reverse_Nodes_in_k_Group {

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

    public static ListNode reverseKGroup(ListNode head, int k) {

        List<ListNode>list=new ArrayList<>();
        ListNode listNode=head;
        while (true){
            if (null!=listNode){
                list.add(listNode);
                listNode=listNode.next;
            }else {
                break;
            }
        }

        int num=list.size();
        int index=num/k;
        for (int i=0;i<index;i++){
            for (int j=0;j<k/2;j++){
                ListNode tmp=list.get(i*k+j);
                list.set(i*k+j,list.get((i+1)*k-j-1));
                list.set((i+1)*k-j-1,tmp);
            }
        }

        head=list.get(0);
        ListNode tail=head;
        for (int i=1;i<num;i++){
            tail.next=list.get(i);
            tail=tail.next;
        }
        tail.next=null;


        while (true){
            if (null!=head){
                System.out.println(head.val);
                head=head.next;
            }else {
                break;
            }
        }


        return head;
    }

    public static void main(String[] args) {
        ListNode l2 = new ListNode();
     ListNode l2Head = l2;
        l2.val = 1;
        ListNode l21 = new ListNode();
        l21.val = 3;
        l2.next = l21;
        l2 = l2.next;

        ListNode l22 =new ListNode();
        l22.val = 4;
        l2.next = l22;
        l2 = l2.next;

        ListNode l23 =new ListNode();
        l23.val = 5;
        l2.next = l23;
        l2 = l2.next;

        reverseKGroup(l2Head,4);
    }
}
