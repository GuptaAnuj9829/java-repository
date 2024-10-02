public class Node {
    private LinkNode head;

    public class LinkNode{
        private int data;
        private LinkNode next;

        public LinkNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node(){
        this.head = null;
    }

    public void PrintList(LinkNode current){
        while(current != null){
            System.out.print(current.data +" --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public LinkNode InsertEnd(int value){
        LinkNode temp = new LinkNode(value);

        if(head == null){
            head = temp;
            return head;
        }

        LinkNode current = head;
        
        while(current != null){
            current = current.next;
        }

        current.next = temp; 

        return head;
    }

    public LinkNode CreateList(int x, int y, int z){
        head = InsertEnd(x);
        head = InsertEnd(y);
        head = InsertEnd(z);

        return head;
    }

    public LinkNode AddTwoNode(LinkNode x, LinkNode y){
        LinkNode temp1 = new LinkNode(0);
        LinkNode temp2 = new LinkNode(0);
        LinkNode temp3 = new LinkNode(0);

        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = null;
        
        LinkNode result = temp1;

        while((x != null && y != null) || result != null){
            result.data = x.data + y.data;
            result = result.next;
            x = x.next;
            y = y.next;
        }

        return result;

    }

    public static void main(String[] args) {
        Node t1 = new Node();

        LinkNode x = t1.CreateList(2, 4, 3);
        LinkNode y = t1.CreateList(5, 4, 2);

        t1.PrintList(x);

        System.out.println();

        t1.PrintList(y);


    }
}
