import java.util.Arrays;
public class notSort{

    public static int[]minDeletionSize(String [] wordList){//if string needed sorting, delete , and record how much much were not sorted
        int[]col=new int[wordList[0].length()];
        int[]check=new int[1];
        for(int z = 1; z<wordList.length;z++){//if length of strings are different, then return -1
          if(wordList[z].length()!=wordList[z-1].length()){
            check[0]=-1;
            return check;
          }
        }
        for(int i=0; i<wordList.length;i++){//goes through each item in 2D array through columns
          for(int j = 0; j<wordList.length-1; j++){
            if(wordList[0].length()==1){//if arrays are singular characters
              if(wordList[0].charAt(0)>wordList[1].charAt(0)){
                check[0]=0;
                return check;
              }
              else{
                int [] p = new int[0];
                return p;//returns [] if first character is greater
              }
            }
            if(wordList[j].charAt(i)>wordList[j+1].charAt(i)){
              col[i]=j+1;
              break;
            }
          }
        }
        int count=0;
        for(int k=0;k<col.length;k++){//creates space for unSorted array that list index on unsorted columns
          if(col[k]>0){
            count++;
          }
        }
        int[]unSorted=new int[count];//puts which index of the column that is not sorted into unSorted array
        int m=0;
          for(int n=0;n<col.length;n++){
            if(col[n]>0){
              unSorted[m]=n;
              m++;
            }
          }
          return unSorted;

    }
    public static void main(String[]args){
        String[]wordList = {"abcdef","uvwxyz"};
        int[]newList=minDeletionSize(wordList);
        System.out.println(Arrays.toString(newList));
    }

}
