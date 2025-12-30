//  brute Code By Using Stack 
class Solution {
    public Node reverse(Node head) {
        // code here
        Stack<Integer> stack = new Stack<>();
        Node temp = head;
        while(temp != null){
            stack.push(temp.data);
            temp = temp.next;
        }
         temp = head;
        while(temp != null){
            temp.data = stack.pop();
            temp = temp.next;
        }
        return head;
    }
}
