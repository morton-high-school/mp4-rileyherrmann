import java.util.Arrays;
public class IntArrayMethods{

// public static void arraySort(int[] a){
//     return Arrays.sort(a);
// }

public static int arraySum(int[] a){
    int sum = 0;
    for(int i : a){
        sum+=i;
    }
    return sum;
}

public static double arrayMean(int[] a){
   return (double)(arraySum(a))/a.length ;
}

public static int arrayMin(int[] a){
    Arrays.sort(a);
    int[] sorted = a;
    return sorted[0];
}

public static int arrayMax(int[] a){
    Arrays.sort(a);
    int[] sorted = a;
    return sorted[a.length-1];
}

public static boolean[] arrayLocalMin(int[] a){
    boolean[] mins = new boolean[a.length];
    int index=0;
    for(int i : a){
        if(index==0){
            if(i<a[1]){
                mins[index]=true;
            }}else if(index==a.length-1){
                if(i<a[a.length-2]){
                    mins[index]=true;
                }}else if(i<a[index+1] && i<a[index-1]){
                    mins[index]=true;
                }else{
                    mins[index]=false;
                }
                index++;
            }
            return mins;
        }
public static boolean[] arrayLocalMax(int[] a){
    boolean[] maxs = new boolean[a.length];
    int index=0;
    for(int i : a){
        if(index==0){
            if(i>a[1]){
                maxs[index]=true;
            }}else if(index==a.length-1){
                if(i>a[a.length-2]){
                    maxs[index]=true;
                }}else if(i>a[index+1] && i>a[index-1]){
                    maxs[index]=true;
                }else{
                    maxs[index]=false;
                }
                index++;
            }
            return maxs;
        }


public static int arrayMode(int[] a){
    Arrays.sort(a);
    int[] sorted =a;
    int currentCount=1;
    int maxCount=1;
    int currentMode=a[0];
    int maxMode=a[0];
    int index=0;
    for(int i : a){
        if(index!=a.length-1 && i==a[index+1]){
            currentMode=i;
            currentCount++;
        }else if(index!=a.length-1){
            currentCount=1;
        }
        if(currentCount>maxCount){
            maxCount=currentCount;
            maxMode=i;
        }
    }
    return maxMode;
}

public static int arrayCount(int[] a, int b){
    int count=0;
    for(int i  : a){
        if(i==b){
            count++;
        }
    }
    return count;
}

public static boolean arrayContainsDuplicates(int[] a){
    for(int i : a){
        if(arrayCount(a,i)>1){
            return true;
        }
    }
    return false;
}

public static boolean arrayAllEqual(int[] a){
    if(arrayCount(a, arrayMode(a))==a.length){
        return true;
    }
    return false;
}

public static double[] arrayRollingAverage(int[] a, int b){
    double[] rollingAverages = new double[a.length];
    for(int i = 0; i<a.length; i++){
        int start;
        if(i-b+1>=0){
            start=i-b+1;
        }else{
            start =0;
        }
        int sum=0;
        int count=0;
        for(int j =start;j<=i;j++){
            sum+=a[j];
            count++;
        }
        rollingAverages[i]=(double)sum/count;

        }
        return rollingAverages;
    }
    

    public static int[] arrayShift(int[] a, int b){
        int index = 0;
        int[] shifted = new int[a.length];
            for(int i : a){
                if(index+b<a.length){
                    shifted[index+b]=i;
                }else{
                    shifted[index + b - a.length]=i;
                }
                index++;
        }
        return shifted;
    }

public static int[] arrayReverse(int[] a){
    int[] reversed = new int[a.length];
    int index = a.length-1;
    for(int i : a ){
        reversed[index]=i;
        index--;
    }
    return reversed;

}

}





