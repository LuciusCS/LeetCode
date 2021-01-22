package question;


import java.util.List;




public class Q21_Merge_Two_Sorted_Lists {

    private static class ListNode {
        public int val;
        public ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode head = null;
        ListNode listNode = null;


        //用于判断是不是空
        if (null == l1) {
            head = l2;
            return head;
        } else if (null == l2) {
            head = l1;
            return head;
        }


        while (true) {
            if (l1.val < l2.val) {
                //用于表示第一个数字
                if (null == listNode) {

                    listNode = l1;
                    head = listNode;
                } else {
                    listNode.next = l1;
                    listNode = listNode.next;
                }

                l1 = l1.next;
                if (l1 == null) {
                    break;
                }


            } else {
                if (null == listNode) {

                    listNode = l2;
                    head = listNode;
                } else {
                    listNode.next = l2;
                    listNode = listNode.next;
                }


                l2 = l2.next;
                if (l2 == null) {
                    break;
                }

            }
        }

        //补充所有不完整的
        if (null != l1) {
            listNode.next = l1;
        }
        if (null != l2) {
            listNode.next = l2;
        }

        return head;
    }

    public static void main(String[] args) {


        ListNode l1 = new ListNode();
        ListNode l1Head = l1;
        l1.val = 1;
        ListNode l11 = new ListNode();
        l11.val = 2;
        l1.next = l11;
        l1 = l1.next;

        ListNode l12 = new ListNode();
        l12.val = 4;
        l1.next = l12;
        l1 = l12.next;


        ListNode l2 = new ListNode();
        ListNode l2Head = l2;
        l2.val = 1;
        ListNode l21 = new ListNode();
        l21.val = 3;
        l2.next = l21;
        l2 = l2.next;

        ListNode l22 = new ListNode();
        l22.val = 4;
        l2.next = l22;
        l2 = l22.next;


        ListNode l3 = mergeTwoLists(l1Head, l2Head);

        while (true){
            if (null!=l3){
                System.out.println(l3.val);
                l3=l3.next;
            }else {
                break;
            }
        }
    }

}
