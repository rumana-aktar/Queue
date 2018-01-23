/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueusingstack;
import java.util.Enumeration;
import java.util.Stack;
/**
 *
 * @author rumanaaktar
 */



public class QueueUsingStack {

    /**
     * @param args the command line arguments
     */
    
    
    
    Stack<Integer> st=new Stack();
    Stack<Integer> temp_st=new Stack();
    
    void Enqueue(int item){
        st.push(item);
        
    }
    
    int Dequeue(){
        if(st.isEmpty()){
            System.out.print("\nThe queue is empty...");
            return -1;
        }        
        
        Stack<Integer> temp_st=new Stack();
        while(!st.isEmpty())
            temp_st.push(st.pop());
        
        int item=temp_st.pop();
        while(!temp_st.isEmpty())
            st.push(temp_st.pop());
            
        System.out.print("\nDequeued element is: "+item);
        return item;
    }
    
    void print(){
        System.out.print("\nThe elements are: ");
        Enumeration e=st.elements();
        while(e.hasMoreElements())
            System.out.print(e.nextElement()+" ");
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        QueueUsingStack queue=new QueueUsingStack();
        QueueUsingStack queue2=new QueueUsingStack();
        queue.Enqueue(0);
        queue.Enqueue(2);
        queue.Enqueue(42);
        queue.Enqueue(52);
        queue.Enqueue(26);
        queue.Enqueue(33);  
        queue.print();
        
        queue2.Enqueue(-12);
        queue2.Enqueue(-38);  
        queue2.print();
        
        queue.Dequeue();
        queue.Dequeue();
        queue.print();
        
        queue2.Dequeue();
        queue2.Dequeue();
        queue2.Dequeue();
        queue2.print();
        
        queue.Dequeue();
        queue.Dequeue();
        queue.print();
        
        queue.Enqueue(42);
        queue.Enqueue(52);
        queue.Enqueue(26);
        queue.Enqueue(33);  
        queue.print();
        
        
    }
    
}
