
package datastructures;


public class Stack {
    int capacity=5;
    int s[]=new int[capacity];
    int top=0;
    
    private boolean isEmpty(){
        if(top==0)
            return true;
        else
            return false;
    }
}
