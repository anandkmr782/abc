package stack;

import java.util.Scanner;
import java.util.Stack;

public class PreviousGreaterElement {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        previousGreaterElement(n,arr);
        sc.close();
    }
    static void previousGreaterElement(int n,int arr[])
    {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!st.empty() && st.peek()<=arr[i])
            {
                st.pop();
            }
            if(st.empty())
            {
                System.out.print("-1"+" ");
            }else{
                System.out.print(st.peek()+" ");
            }
            st.push(arr[i]);
        }
    }
}
