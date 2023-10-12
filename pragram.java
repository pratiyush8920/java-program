import java.util.Scanner;
public class ABC {
    public static void main (String args [])
    {
        int arr[][] = new int[3][3];
        int sum = 0;
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                arr[i][j] = sc.nextInt();
                if(i==j){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
