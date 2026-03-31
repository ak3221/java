class MarksException extends Exception
{
    MarksException(String msg)
    {
        super(msg);
    }
}

public class Main
{
    public static void main(String[] args)
    {
        int marks = 30;

        try
        {
            if(marks < 40)
            {
                throw new MarksException("You are Fail");
            }
            else
            {
                System.out.println("You Passed");
            }
        }
        catch(MarksException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
