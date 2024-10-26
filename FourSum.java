package ArraysDSA;

import java.util.*;
public class FourSum {
    public static List<List<Integer>>fourSum(int num[],int target){
        int n =num.length;
Set<List<Integer>>ans = new HashSet<>();
for(int i=0; i<n; i++){
for(int j=i+1; j<n; j++){
    for(int k=j+1; k<n; k++){
        for(int l=k+1; l<n; l++){
            long sum =(long)num[i]+(long)num[j];
            sum+=num[k];
            sum+=num[l];
            if(sum==target){
                List<Integer>temp =Arrays.asList(num[i],num[j],num[k],num[l]);
                Collections.sort(temp);
                ans.add(temp);
            }
        }
    }
}
}
List<List<Integer>>result = new ArrayList<>(ans);
return result;

    }
    public static void main (String args[]){
int num[]={4,3,3,4,4,2,1,2,1};
int target =9;

List<List<Integer>>result=fourSum(num,target);
System.out.println("The quadruplets are: ");
for(List<Integer>it:result){
System.out.print("[");
for(int el:it){
    System.out.print(el + " ");
}
System.out.print("]");

    }
    System.out.println();
}
}
