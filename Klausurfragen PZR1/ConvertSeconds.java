import java.util.Arrays;
public class ConvertSeconds {
    public static void main(String[] args) {
    //Main methode zum testen
        convertSeconds(3675);
    }

    public static int[] convertSeconds(int n) {

        int[] time = new int[3];
        int min = n / 60 % 60; 
        int h = n / 60 / 60;
        int sec = n % 60; 

        time[0] = h;
        time[1] = min;
        time[2] = sec;
        
        System.out.println(Arrays.toString(time));
        
        return time;
    }
}