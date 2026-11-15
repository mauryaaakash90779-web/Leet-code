public class secMax {
 public static int main(String[] args) {
    // Write your solution here.
    int[] nums = {1,2,3,4,5,6,7,8,9};
     int max=nums[0];
  int secMax = -1;
  for(int i=0;i<nums.length;i++){
    if(nums[i]>max){
      secMax = max;
      max=nums[i];
    }
    else if(nums[i]>secMax && nums[i]<max){
      secMax = nums[i];
    }
  }
  return secMax;

}
}
