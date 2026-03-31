class MyException extends Exception
{
    MyException(String msg)
    {
        super(msg);
    }
}

public class Main
{
    public static void main(String[] args)
    {
        int age = 16;

        try
        {
            if(age < 18)
            {
                throw new MyException("Not allowed");
            }
            else
            {
                System.out.println("Allowed");
            }
        }
        catch(MyException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
