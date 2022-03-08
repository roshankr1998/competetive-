package basics.loops;

/**
 * cielreciept
 */
import java.util.*;
public class cielreciept {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
        double a=sc.nextDouble();
        int aa=(int)a;
        int count=0;
        int max=2048;

        while(aa>0){
            {
                count=count+(aa/max);
                aa=aa%max;
                max=max/2;

            }}
       /* while(a>0){
           { if(a%Math.pow(2,11)==0){
                count++;
                a=a-Math.pow(2,11);
            }else if(a%Math.pow(2,10)==0){
                count++;
                a=a-Math.pow(2,10);
            }
            else if(a%Math.pow(2,9)==0){
                count++;
                a=a-Math.pow(2,9);
            }else if(a%Math.pow(2,8)==0){
                count++;
                a=a-Math.pow(2,8);
            }else if(a%Math.pow(2,7)==0){
                count++;
                a=a-Math.pow(2,7);
            }else if(a%Math.pow(2,6)==0){
                count++;
                a=a-Math.pow(2,6);
            }
            else if(a%Math.pow(2,5)==0){
                count++;
                a=a-Math.pow(2,5);
            }
            else if(a%Math.pow(2,4)==0){
                count++;
                a=a-Math.pow(2,4);
            }
            else if(a%Math.pow(2,3)==0){
                count++;
                a=a-Math.pow(2,3);
            }
            else if(a%Math.pow(2,2)==0){
                count++;
                a=a-Math.pow(2,2);
            }
            else if(a%Math.pow(2,1)==0){
                count++;
                a=a-Math.pow(2,1);
            }
            else if(a%Math.pow(2,0)==0){
                count++;
                a=a-Math.pow(2,0);
            }
        }
        }*/
        System.out.println(count);
        sc.close();
    }
}
    
}