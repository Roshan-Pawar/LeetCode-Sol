class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length;
        int max = 0;
	
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int count1 = 0,count2=0,count3=0,count4=0;
                for(int a=i;a<n;a++){
                    for(int b=j;b<n;b++){
                        if((img2[a][b]==1)&&(img1[a-i][b-j]==1)) count1++;
                        if((img2[a-i][b-j]==1)&&(img1[a][b]==1)) count2++;
                        if((img2[n-a-1][b]==1)&&(img1[n-a-1+i][b-j]==1)) count3++;
                        if((img2[a][n-b-1]==1)&&(img1[a-i][n-b-1+j]==1)) count4++;
                    }
                }
                if(count1>max) max = count1;
                if(count2>max) max = count2;
                if(count3>max) max = count3;
                if(count4>max) max = count4;
            }
        }
        return max;
    }
}