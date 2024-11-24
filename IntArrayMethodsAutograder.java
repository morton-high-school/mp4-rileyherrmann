public class IntArrayMethodsAutograder{
  public static void main(String[] args){
    testArraySum();
    testArrayMean();
    testArrayMin();
    testArrayMax();
    testArrayLocalMin();
    testArrayLocalMax();
    testArrayMode();
    testArrayCount();
    testArrayContainsDuplicates();
    testArrayAllEqual();
    testArrayRollingAverage();
    testArrayShift();
    testArrayReverse();
  }

  public static void testArraySum(){
    int[] a1 = {5,1,7,0,4,2,7,9,8,3,3,2,8,4,1,1,9,9,4,3};
    int[] a2 = {5};
    boolean a = 90==IntArrayMethods.arraySum(a1);
    boolean b = 5==IntArrayMethods.arraySum(a2);
    if(!a){
      System.out.println("Failed arraySum test 1.");
    }
    if(!b){
      System.out.println("Failed arraySum test 2.");
    }
    if(a&&b){
      System.out.println("All arraySum tests passed.");
    }
  }

  public static void testArrayMean(){
    int[] a1 = {5,1,7,0,4,2,7,9,8,3,3,2,8,4,1,1,9,9,4,3};
    int[] a2 = {5};
    boolean a = 4.5==IntArrayMethods.arrayMean(a1);
    boolean b = 5.0==IntArrayMethods.arrayMean(a2);
    if(!a){
      System.out.println("Failed arrayMean test 1.");
    }
    if(!b){
      System.out.println("Failed arrayMean test 2.");
    }
    if(a&&b){
      System.out.println("All arrayMean tests passed.");
    }
  }

  public static void testArrayMin(){
    int[] a1 = {5,1,7,0,4,2,7,9,8,3,3,2,8,4,1,1,9,9,4,3};
    int[] a2 = {5};
    boolean a = IntArrayMethods.arrayMin(a1)==0;
    boolean b = IntArrayMethods.arrayMin(a2)==5;
    if(!a){
      System.out.println("Failed arrayMin test 1.");
    }
    if(!b){
      System.out.println("Failed arrayMin test 2.");
    }
    if(a&&b){
      System.out.println("All arrayMin tests passed.");
    }
  }

  public static void testArrayMax(){
    int[] a1 = {5,1,7,0,4,2,7,9,8,3,3,2,8,4,1,1,9,9,4,3};
    int[] a2 = {5};
    boolean a = IntArrayMethods.arrayMax(a1)==9;
    boolean b = IntArrayMethods.arrayMax(a2)==5;
    if(!a){
      System.out.println("Failed arrayMax test 1.");
    }
    if(!b){
      System.out.println("Failed arrayMax test 2.");
    }
    if(a&&b){
      System.out.println("All arrayMax tests passed.");
    }
  }

  public static void testArrayLocalMin(){
    int[] a1 = {5,1,7,0,4,2,7,9,8,3,3,2,8,4,1,1,9,9,4,3};
    boolean a = true;
    boolean[] expected = {false,true,false,true,false,true,false,false,false,false,false,true,false,false,false,false,false,false,false,true};
    boolean[] returned = IntArrayMethods.arrayLocalMin(a1);
    for(int i=0; i<a1.length; i++){
      if(expected[i]!=returned[i]){
        a=false;
      }
    }
    if(!a){
      System.out.println("Failed arrayLocalMin test 1.");
    }else{
      System.out.println("All arrayLocalMin tests passed.");
    }
  }

  public static void testArrayLocalMax(){
    int[] a1 = {5,1,7,0,4,2,7,9,8,3,3,2,8,4,1,1,9,9,4,3};
    boolean a = true;
    boolean[] expected = {true,false,true,false,true,false,false,true,false,false,false,false,true,false,false,false,false,false,false,false};
    boolean[] returned = IntArrayMethods.arrayLocalMax(a1);
    for(int i=0; i<a1.length; i++){
      if(expected[i]!=returned[i]){
        a=false;
      }
    }
    if(!a){
      System.out.println("Failed arrayLocalMax test 1.");
    }else{
      System.out.println("All arrayLocalMax tests passed.");
    }
  }

  public static void testArrayMode(){
    int[] a1 = {5,1,7,0,4,2,7,9,8,3,3,2,8,4,1,1,9,9,4,3};
    int[] a2 = {5};
    boolean a = IntArrayMethods.arrayMode(a1)==1;
    boolean b = IntArrayMethods.arrayMode(a2)==5;
    if(!a){
      System.out.println("Failed arrayMode test 1.");
    }
    if(!b){
      System.out.println("Failed arrayMode test 2.");
    }
    if(a&&b){
      System.out.println("All arrayMode tests passed.");
    }
  }

  public static void testArrayCount(){
    int[] a1 = {5,1,7,0,4,2,7,9,8,3,3,2,8,4,1,1,9,9,4,3};
    int[] a2 = {5};

    boolean a = IntArrayMethods.arrayCount(a1,7)==2;
    boolean b = IntArrayMethods.arrayCount(a1,6)==0;
    boolean c = IntArrayMethods.arrayCount(a2,5)==1;
    boolean d = IntArrayMethods.arrayCount(a2,0)==0;
    if(!a){
      System.out.println("Failed arrayCount test 1.");
    }
    if(!b){
      System.out.println("Failed arrayCount test 2.");
    }
    if(!c){
      System.out.println("Failed arrayCount test 3.");
    }
    if(!d){
      System.out.println("Failed arrayCount test 4.");
    }
    if(a&&b&&c&&d){
      System.out.println("All arrayCount tests passed.");
    }
  }

  public static void testArrayContainsDuplicates(){
    int[] a1 = {5,1,7,0,4,2,7,9,8,3,3,2,8,4,1,1,9,9,4,3};
    int[] a2 = {5};
    boolean a = IntArrayMethods.arrayContainsDuplicates(a1)==true;
    boolean b = IntArrayMethods.arrayContainsDuplicates(a2)==false;
    if(!a){
      System.out.println("Failed arrayContainsDuplicates test 1.");
    }
    if(!b){
      System.out.println("Failed arrayContainsDuplicates test 2.");
    }
    if(a&&b){
      System.out.println("All arrayContainsDuplicates tests passed.");
    }
  }

  public static void testArrayAllEqual(){
    int[] a1 = {5,1,7,0,4,2,7,9,8,3,3,2,8,4,1,1,9,9,4,3};
    int[] a2 = {5,5};
    boolean a = IntArrayMethods.arrayAllEqual(a1) == false;
    boolean b = IntArrayMethods.arrayAllEqual(a2) == true;
    if(!a){
      System.out.println("Failed arrayAllEqual test 1.");
    }
    if(!b){
      System.out.println("Failed arrayAllEqual test 2.");
    }
    if(a&&b){
      System.out.println("All arrayAllEqual tests passed.");
    }
  }

  public static void testArrayRollingAverage(){
    int[] a1 = {5,1,6,0,4,2,7,9,8,3,3,2,8,4,1,1,9,9,4,3};
    int[] a2 = {5};
    boolean a = true;
    double[] t1Returned = IntArrayMethods.arrayRollingAverage(a1,2);
    double[] t1Expected = {5,3,3.5,3,2,3,4.5,8,8.5,5.5,3,2.5,5,6,2.5,1,5,9,6.5,3.5};
    for(int i=0; i<a1.length; i++){
      if(t1Returned[i] != t1Expected[i]){
        a = false;
      }
    }
    boolean b = true;
    double[] t2Returned = IntArrayMethods.arrayRollingAverage(a1,5);
    double[] t2Expected = {5,3,4,3,3.2,2.6,3.8,4.4,6,5.8,6,5,4.8,4,3.6,3.2,4.6,4.8,4.8,5.2};
    for(int i=0; i<a1.length; i++){
      if(t2Returned[i] != t2Expected[i]){
        b = false;
      }
    }
    if(!a){
      System.out.println("Failed arrayRollingAverage test 1.");
    }
    if(!b){
      System.out.println("Failed arrayRollingAverage test 2.");
    }
    if(a&&b){
      System.out.println("All arrayRollingAverage tests passed.");
    }
  }

  public static void testArrayShift(){
    int[] a1 = {5,1,6,0,4,2,7,9,8,3,3,2,8,4,1,1,9,9,4,3};
    int[] a2 = {5};
    boolean a = true;
    int[] t1Returned = IntArrayMethods.arrayShift(a1,4);
    int[] t1Expected = {9,9,4,3,5,1,6,0,4,2,7,9,8,3,3,2,8,4,1,1};
    for(int i=0; i<a1.length; i++){
      if(t1Returned[i] != t1Expected[i]){
        a = false;
      }
    }
    boolean b = true;
    int[] t2Returned = IntArrayMethods.arrayShift(a1,20);
    int[] t2Expected = {5,1,6,0,4,2,7,9,8,3,3,2,8,4,1,1,9,9,4,3};
    for(int i=0; i<a1.length; i++){
      if(t2Returned[i] != t2Expected[i]){
        b = false;
      }
    }
    if(!a){
      System.out.println("Failed arrayShift test 1.");
    }
    if(!b){
      System.out.println("Failed arrayShift test 2.");
    }
    if(a&&b){
      System.out.println("All arrayShift tests passed.");
    }
  }

  public static void testArrayReverse(){
    int[] a1 = {5,1,6,0,4,2,7,9,8,3,3,2,8,4,1,1,9,9,4,3};
    int[] a2 = {5};
    boolean a = true;
    int[] t1Returned = IntArrayMethods.arrayReverse(a1);
    int[] t1Expected = {3,4,9,9,1,1,4,8,2,3,3,8,9,7,2,4,0,6,1,5};
    for(int i=0; i<a1.length; i++){
      if(t1Returned[i] != t1Expected[i]){
        a = false;
      }
    }
    boolean b = true;
    int[] t2Returned = IntArrayMethods.arrayReverse(a2);
    int[] t2Expected = {5};
    for(int i=0; i<a2.length; i++){
      if(t2Returned[i] != t2Expected[i]){
        b = false;
      }
    }
    if(!a){
      System.out.println("Failed arrayReverse test 1.");
    }
    if(!b){
      System.out.println("Failed arrayReverse test 2.");
    }
    if(a&&b){
      System.out.println("All arrayReverse tests passed.");
    }
  }
}
