//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}


// } Driver Code Ends

/* class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}*/
class Solution {
    static Node segregate(Node head) {
        Node zero = new Node(0); Node buk = zero;
        Node one = new Node(0); Node puk = one;
        Node two = new Node(0); Node tuk = two;

        Node temp = head;
        while (temp != null) {
            if (temp.data == 0) {
                buk.next = temp;
                buk = buk.next;
            } else if (temp.data == 1) {
                puk.next = temp;
                puk = puk.next;
            } else {
                tuk.next = temp;
                tuk = tuk.next;
            }
            temp = temp.next;
        }

        // Connect the three lists properly
        tuk.next = null;  // end the list
        puk.next = two.next;  // 1s → 2s
        buk.next = one.next;  // 0s → 1s

        return zero.next;  // head of the final sorted list
    }
}



//{ Driver Code Starts.

class GFG {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(input);
            while (st.hasMoreTokens()) {
                arr.add(Integer.parseInt(st.nextToken()));
            }

            Node head = null;
            if (!arr.isEmpty()) {
                head = new Node(arr.get(0));
                Node tail = head;
                for (int i = 1; i < arr.size(); i++) {
                    tail.next = new Node(arr.get(i));
                    tail = tail.next;
                }
            }
            head = new Solution().segregate(head);
            printList(head);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends