
import java.util.*;

class MyStack
{
    Stack<Integer> s;
    Integer minele;

    MyStack()
    {
        s = new Stack<Integer>();
    }

    void getMin()
    {
        if (s.isEmpty())
            System.out.println("Stack is empty");
        else
            System.out.println("Minimum Element in the " + " stack is: " + minele);
    }

    void peek()
    {
        if (s.isEmpty())
        {
            System.out.println("Stack is empty ");
            return;
        }

        Integer t = s.peek();

        System.out.println("Top Most Element is: ");

        if (t < minele)
            System.out.println(minele);
        else
            System.out.println(t);
    }

    void pop()
    {
        if (s.isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Top Most Element Removed: ");
        Integer t = s.pop();

        if (t < minele)
        {
            System.out.println(minele);
            minele = 2*minele - t;
        }

        else
            System.out.println(t);
    }

    void push(Integer x)
    {
        if (s.isEmpty())
        {
            minele = x;
            s.push(x);
            System.out.println("Number Inserted: " + x);
            return;
        }

        if (x < minele)
        {
            s.push(2*x - minele);
            minele = x;
        }

        else
            s.push(x);

        System.out.println("Number Inserted: " + x);
    }
}

class question7
{
    public static void main(String[] args)
    {
        MyStack s = new MyStack();
        s.push(3);
        s.push(5);
        s.getMin();
        s.push(2);
        s.push(1);
        s.getMin();
        s.pop();
        s.getMin();
        s.pop();
        s.peek();
    }
}
