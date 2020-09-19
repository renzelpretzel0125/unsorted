import java.util.Arrays;
public class notSort{

    public static int[]minDeletionSize(String [] A){//if string needed sorting, delete , and record how much much were not sorted
        int[]mds = new int[A[0].length()];
        char[]temp = new char[A.length];
        int i=0;
        int j=0;
        int x = 0;
        int y = 0;
        for(int z = 1; z<A.length;z++){//if length of strings are different, then return -1
          if(A[z].length()!=A[z-1].length()){
            mds[0]=-1;
            return mds;
          }
        }
        if(A[0].length()>1){//if theres only one character for each string, different while loops to work for both
          while(j<=A.length-1){//if there is more than one char
              temp[i]= A[i].charAt(j);
              i+=1;
              if(i==(A.length)){
                  for(int n = 1; n<=temp.length-1;n++){
                    if(Character.compare(temp[n-1],temp[n])>0){//compares if in alphabetical order and will return the index of which is unsorted
                      x+=1;
                      if(x==temp.length){
                        int non = 0;
                      }else{
                        mds[j]=j;
                        x=0; 
                      }
                    }
                  }
                  j+=1;
                  i=0;
              }
          }
        }else{
          while(j<A.length-1){//if there is one char for each string
              temp[i]= A[i].charAt(j);
              i+=1;
              if(i==(A.length)){
                  for(int n = 1; n<=temp.length-1;n++){
                    if(Character.compare(temp[n-1],temp[n])>0){
                      x+=1;
                      if(x==temp.length){
                        int non = 0;
                      }else{
                        mds[j]=j; 
                        x=0;
                      }
                    }
                  }
                  j+=1;
                  i=0;
              }
        	}
        }
        return mds;
    }
    public static void main(String[]args){
        String[]wordList = {"cba","dai","ghf"};
        int[]newList=minDeletionSize(wordList);
        System.out.println(Arrays.toString(newList));
    }

}