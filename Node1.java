public class Node1<C> {
    public C nodeValue;
    public Node1<C> next;

    public Node1() {
        nodeValue = null;
        next = null;
    }

    public Node1(C item) {
        nodeValue = item;
        next = null;
    }

    // Method ค้นหาข้อมูล
    public static boolean searchBlue(Node1<String> front) {
        Node1<String> current = front;

        while (current != null) {
            if (current.nodeValue.equals("blue")) {
                return true;
            }

            current = current.next;
        }

        return false;
    }

    // Method นับจำนวน Node
    public static int countNodes(Node1<String> front) {
        int count = 0;
        Node1<String> current = front;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    public static void main(String[] args) {

        // สร้าง Node
        Node1<String> first = new Node1<>("red");
        Node1<String> second = new Node1<>("green");
        Node1<String> third = new Node1<>("yellow");
        Node1<String> fourth = new Node1<>("blue");

        // เชื่อมโยง Node
        first.next = second;
        second.next = third;
        third.next = fourth;

        // front ชี้ไป node แรก
        Node1<String> front = first;

        // 1. ค้นหา blue
        if (searchBlue(front)) {
            System.out.println("Found blue");
        } else {
            System.out.println("Blue not found");
        }

        // 2. นับจำนวน node
        System.out.println("Number of nodes = " + countNodes(front));
    }
}
