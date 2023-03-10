# Java
import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        for(int i=0;i<game.length;i++){
            if(game[i+1]==0)
                i++;
                if(i+1>=n)
                    return true;
            else if(game[i+leap]=0 || i + leap>=n)
                if(i+leap>=n)
                    return true;
                else
                    i += leap;
            else if(i+1<n && )  
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}









package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {


    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, Color.color(0,0.5,1.0,1.0));
        /**
        Image icon = new Image("mahir.jpg");
        primaryStage.getIcons().add(javafx.scene.image.Image.impl_fromPlatformImage(icon));
        */
        primaryStage.setTitle("Stage Damo program");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
/**
Week_4
*/
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.Arrays;

public class Main {
    public void main(String[] arg){

    }
}
class Sort{
    public void mergeSort(int[] array){
        if(array.length<2){
            return;
        }
        else{
            int mid = (array.length)/2;
            int[] left = Arrays.copyOfRange(array,0,mid);
            int[] right = Arrays.copyOfRange(array,mid,array.length);
            mergeSort(left);
            mergeSort(right);
            merge(array, left, right);
        }
    }
     public int[] cloning(int[] array, int[] temp){
        int [] temp;
     }
     public int[] merge(int[] array, int[] left, int[] right){
        if(left[left.length-1]<=right[0]){

        }
        else if(right[right.length-1]<=left[0]){

        }
     }
}





