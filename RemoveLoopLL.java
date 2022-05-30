class RemoveLoopLL
{
    public static void removeLoop(Node head){
    
        
        if(head == null)return;
        
        Node slow = head,fast = head;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                break;
            }
        }
        if(fast != slow){
            return;
        }
        
        slow = head;
        
        while(slow != fast){
            
            slow = slow.next;
            fast = fast.next;
            
        }
        
        Node curr = slow;
        
        while(curr.next != slow){
            
            curr = curr.next;
        }
        
        curr.next = null;
        
    }
}
