import java.util.*;
public class CardGame {
    public static void getScore(int n, int arr[]) {
        int a = 0, b = 0;
        for(int i=0; i<n; i++) {
            if(arr[i] == 1) {
                int iter = i+1, flag = 0;
                while(iter <= i+4 && iter < n) {
                    if(arr[iter] == 1 || arr[iter] == 11 || arr[iter] == 12 || arr[iter] == 13) {
                        flag = 1;
                        break;
                    }
                    iter++;
                }
                if(flag == 0 && iter == i+5) {
                    if(i%2 == 0) {
                        a += 4;
                        System.out.println("A scores 4 points");
                    }
                    else {
                        b += 4;
                        System.out.println("B scores 4 points");
                    }
                }
            }
            else if(arr[i] == 11) {
                int iter = i+1, flag = 0;
                while(iter <= i+1 && iter < n) {
                    if(arr[iter] == 1 || arr[iter] == 11 || arr[iter] == 12 || arr[iter] == 13) {
                        flag = 1;
                        break;
                    }
                    iter++;
                }
                if(flag == 0 && iter == i+2) {
                    if(i%2 == 0) {
                        a += 1;
                        System.out.println("A scores 1 points");
                    }
                    else {
                        b += 1;
                        System.out.println("B scores 1 points");
                    }
                }
            }
            else if(arr[i] == 12) {
                int iter = i+1, flag = 0;
                while(iter <= i+2 && iter < n) {
                    if(arr[iter] == 1 || arr[iter] == 11 || arr[iter] == 12 || arr[iter] == 13) {
                        flag = 1;
                        break;
                    }
                    iter++;
                }
                if(flag == 0 && iter == i+3) {
                    if(i%2 == 0) {
                        a += 2;
                        System.out.println("A scores 2 points");
                    }
                    else {
                        b += 2;
                        System.out.println("B scores 2 points");
                    }
                }

            }
            else if(arr[i] == 13) {
                int iter = i+1, flag = 0;
                while(iter <= i+3 && iter < n) {
                    if(arr[iter] == 1 || arr[iter] == 11 || arr[iter] == 12 || arr[iter] == 13) {
                        flag = 1;
                        break;
                    }
                    iter++;
                }
                if(flag == 0 && iter == i+4) {
                    if(i%2 == 0) {
                        a += 3;
                        System.out.println("A scores 3 points");
                    }
                    else {
                        b += 3;
                        System.out.println("B scores 3 points");
                    }
                }
            }
        }
        System.out.println("Player A total points : "+a);
        System.out.println("Player B total points : "+b);
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        getScore(n, arr);
        sc.close();
    }
}
