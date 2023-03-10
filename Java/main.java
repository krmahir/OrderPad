import java.io.*;
import java.util.Scanner;
import javax.swing.*;
public class main {
    public static void main(String[] args){
        /**
        Scanner scanner = new Scanner(System.in);
        String nm = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null,"hello "+nm);
        */
        int[] arr = {0,1,2,3,4,5,5,7,8,9};
        Calculate Obj = new Calculate();
        System.out.println(Obj.calculate(arr,0,9,5));

        
    }
}
class Calculate{
    /**public int[] morethenone(int st, int en){
        int i = en + 1;
        int a[i];
        for(int j = 0;j<i;j++) {
            a[j]=st;
            st++;
        }
        return a;
    }*/
    public static int calculate(int arr[], int st, int en, int a){
        int mid = (st+ en)/2;
        if((arr[st] == a || arr[en] == a) || st>en){
            if(st>en)
                return -1;
            else if(arr[st] == a)
                if(arr[st-1]||)
                return st;
            else if((arr[st] == a && arr[en] == a)) {
                System.out.println("Multiple Value Detected Occupying Index"+st +" To "+en);
                return 0;
                else if(arr[en] == a)
                return en;

            }
            else
                return en;
        }
        else if(arr[mid]>a){
            return calculate(arr,st,mid,a);
        }
        else if(arr[mid]==a){
            while(arr[st]!=a)
                st++;
            while(arr[en]!=a)
                en--;
            return calculate(arr,st,en,a);
        }
        else {
            return calculate(arr,mid,en,a);
        }
    }
}
class gui{
    public static void main(String args[]){
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JButton button1 = new JButton("Press");
        frame.getContentPane().add(button1);
        frame.setVisible(true);
    }
}
