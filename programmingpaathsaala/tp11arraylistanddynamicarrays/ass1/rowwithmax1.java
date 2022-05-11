package programmingpaathsaala.tp11arraylistanddynamicarrays.ass1;

public class rowwithmax1 {

    public static void main(String[] args) {
        int a[][]={{0, 1, 1, 1},
        {0, 0, 1, 1},
        {1, 1, 1, 1},
        {0, 0, 0, 0}};
        int max=0;
        int idx=-1;
        for(int i =0;i<a.length;i++){
            int count=0;
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]==1) count++;
            }
            if(count >max){
                idx=i;
            }
        }
        System.out.println(idx);
    }
    
}
