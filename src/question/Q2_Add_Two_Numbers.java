package question;


import java.util.zip.Adler32;

public class Q2_Add_Two_Numbers {

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

    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode current = null;
        ListNode a = l1;
        ListNode b = l2;
        int carry = 0;
        while(a != null || b != null || carry != 0) {
            int sum = carry;
            sum += a != null ? a.val : 0;
            sum += b != null ? b.val : 0;
            carry = sum / 10;
            if (head == null) {
                head = new ListNode(sum % 10);
                current = head;
            } else {
                current.next = new ListNode(sum % 10);
                current = current.next;
            }
            a = a != null? a.next: null;
            b = b != null? b.next: null;
        }
        return head;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = l1;

        ListNode tail=l1;


        int add = 0;
        while (l1 != null && l2 != null) {
            //判断是不是超过10
            if (l1.val + l2.val + add >= 10) {
                l1.val += l2.val + add - 10;
                add = 1;
            } else {
                l1.val += l2.val+add;
                add = 0;
            }
            tail=l1;
            l1 = l1.next;
            l2 = l2.next;
        }

        if (l1 == null) {
            tail.next = l2;
            l1=l2;
        }

        if (add == 1) {
            while (l1 != null && add != 0) {
                if (l1.val + add >= 10) {
                    l1.val += add - 10;
                    tail=l1;
                    l1=l1.next;
                    add = 1;
                } else {
                    l1.val += add;
                    add = 0;
                }
            }
        }

        if (l1==null&&add==1){
            ListNode end = new ListNode();
            end.val=1;
            tail.next=end;
        }


        return head;
    }

    public static void main(String[] args) {

        ListNode l1 = new ListNode();
        ListNode l1Head = l1;
        l1.val = 9;

        ListNode l11 = new ListNode();
        l11.val = 9;
        l1.next = l11;
        l1 = l1.next;

        ListNode l12 = new ListNode();
        l12.val = 1;
        l1.next = l12;
        l1 = l1.next;

//        ListNode l13 = new ListNode();
//        l13.val = 9;
//        l1.next = l13;
//        l1 = l1.next;
//
//        ListNode l14 = new ListNode();
//        l14.val = 9;
//        l1.next = l14;
//        l1 = l1.next;
//
//        ListNode l15 = new ListNode();
//        l15.val = 9;
//        l1.next = l15;
//        l1 = l1.next;
//
//        ListNode l16 = new ListNode();
//        l16.val = 9;
//        l1.next = l16;
//        l1 = l1.next;



        ListNode l2 = new ListNode();
        ListNode l2Head = l2;
        l2.val = 1;

//        ListNode l21 = new ListNode();
//        l21.val = 6;
//        l2.next = l21;
//        l2 = l2.next;
//
//        ListNode l22 = new ListNode();
//        l22.val = 4;
//        l2.next = l22;
//        l2 = l2.next;

//        ListNode l23 = new ListNode();
//        l23.val = 9;
//        l2.next = l23;
//        l2 = l2.next;

//        while (true) {
//            if (null != l1Head) {
//                System.out.print(l1Head.val);
//                l1Head = l1Head.next;
//            } else {
//                break;
//            }
//        }
//        System.out.println("+++++++++");
//        while (true) {
//            if (null !=l2Head) {
//                System.out.print(l2Head.val);
//                l2Head = l2Head.next;
//            } else {
//                break;
//            }
//        }
//        System.out.println("+++++++++");

        ListNode l3 = addTwoNumbers(l2Head, l1Head);


        while (true) {
            if (null != l3) {
                System.out.print(l3.val);
                l3 = l3.next;
            } else {
                break;
            }
        }
    }

}
