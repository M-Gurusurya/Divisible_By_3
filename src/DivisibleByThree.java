import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");
        int size=scanner.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=scanner.nextInt();
        }
        System.out.println(findDivisibleByThree(array,size));
    }
    public static int findDivisibleByThree (int array[],int size)
    {
        int result=0;
        int power=1;
        for(int i=size-1;i>=0;i--)
        {
            result= result+((array[i]%3)*power)%3;
            power=(power*10)%3;
        }
        if(result%3==0){
            return 1;
        }
        else {
            return 0;
        }
    }
}
