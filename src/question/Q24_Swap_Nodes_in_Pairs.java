package question;

public class Q24_Swap_Nodes_in_Pairs {

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

    public static ListNode swapPairs(ListNode head) {
        if (null==head){
            return null;
        }else if (null==head.next){
            return head;
        }


        ListNode head1=head;
        ListNode l1=head;
        ListNode l2=head.next;
        ListNode tmp;
        tmp=l2.next;
        head=l2;
        l2.next=l1;
        l1.next=tmp;
        head1=l1;

        while (head1.next!=null&&head1.next.next!=null){
            ListNode l1Tmp=head1.next;
            ListNode l2Tmp=head1.next.next;
            ListNode tmpTmp=l2Tmp.next;
            head1.next=l2Tmp;
            l2Tmp.next=l1Tmp;
            l1Tmp.next=tmpTmp;
            head1=l1Tmp;

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
        l2 = l23.next;

//
//        while (true){
//            if (null!=l2Head){
//                System.out.println(l2Head.val);
//                l2Head=l2Head.next;
//            }else {
//                break;
//            }
//        }

        ListNode l3=swapPairs(l2Head);

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
