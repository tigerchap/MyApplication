/**
 * Created by neeraja on 6/26/2016.
 */
public class WhileLoop {
    public static void main(String[] args)
    {
        double salary = 20000;
        int year = 0;
        System.out.println(year + "  " + salary);
        while(salary < 50000)
        {
            salary = salary * 1.1;
            year++;                                    //year = year + 1
            System.out.println(year + "  " + salary);
        }
        System.out.println();
        System.out.println("It took " + year + " years to reach a salary of $50,000.");
    }
}
