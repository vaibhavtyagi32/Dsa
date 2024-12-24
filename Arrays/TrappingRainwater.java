package Arrays;

public class TrappingRainwater {
    public static int trap(int []height){
        int left=0;
        int right=height.length-1;
        int res=0;
        int maxleft=0;
        int maxright=0;
        while(left<=right){
            if(height[left]<=height[right]){
                if(height[left]>=maxleft){
                    maxleft=height[left];
                }
                else{
                    res += maxleft-height[left];
                }
                left++;
            }
            else{
                if(height[right]>=maxright){
                    maxright=height[right];
                }else{
                    res +=maxright-height[right];
                }
                right--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int []height={3,1,2,4,0,1,3,2};
        System.out.println(trap(height));
    }
}
