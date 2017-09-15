/**
 * Created by h205p2 on 9/1/17.
 */

public class Runner {

    //your main containing tests and output
    public static void main(String[] args) {
        //Warm up 1 notString
        System.out.println(notString("candy"));
        System.out.println(notString("x"));
        System.out.println(notString("not bad"));

        // warm up 2 stringSplosion
        System.out.println(stringSplosion("Code"));
        System.out.println(stringSplosion("abc"));
        System.out.println(stringSplosion("ab"));

        //string 1 withoutX2
        System.out.println(withoutX2("xHi"));
        System.out.println(withoutX2("Hxi"));
        System.out.println(withoutX2("Hi"));

        //array 1 front11

        //arrays
        int nums1[] = new int[]{1,6, 2,3};
        int nums2[] = new int[]{6,9,8};
        int nums3[] = new int[]{1,2,6};

        //function calling
        System.out.println(firstLast6(nums1));
        System.out.println(firstLast6(nums2 ));
        System.out.println(firstLast6(nums3));

        // logic 1 sumLimit
        System.out.println(sumLimit(2,3));
        System.out.println(sumLimit(8,3));
        System.out.println(sumLimit(8,1));

        //logic 2 makeChocolate
        System.out.println(makeChocolate(4,1,9));
        System.out.println(makeChocolate(4,1,10));
        System.out.println(makeChocolate(4,1,7));

        //string 2 wordEnds
        System.out.println(wordEnds("abcXY123XYijk","XY"));
        System.out.println(wordEnds("XY123XY","XY"));
        System.out.println(wordEnds("XY1XY","XY"));

        // string 3 sumDigits
        System.out.println(sumDigits("aa1bcd3"));
        System.out.println(sumDigits("aa11b33"));
        System.out.println(sumDigits("Chocolate"));

        // array 2  countEvens
        // arraycreation
        int arr1[] = new int[]{2, 1,2,3,4};
        int arr2[] = new int[]{2,2,0};
        int arr3[] = new int[]{1,3,5};
        System.out.println(countEvens(arr1));
        System.out.println(countEvens(arr2));
        System.out.println(countEvens(arr3));

        // array 3 linearIn

        int lin1[] = new int[]{2,4};
        int lin2[] = new int[]{2,3,4};
        int lin3[] = new int[]{1,2,4,6};
        int lin4[] = new int[]{1,2,4,4,6};
        System.out.println(linearIn(lin3,lin1));
        System.out.println(linearIn(lin3,lin2));
        System.out.println(linearIn(lin4,lin1));

    }

    //your codingbat method here - must match
    // warm up 1
    public static String notString(String str) {
        if (str.length() >= 3) {
            if (str.substring(0, 3).equals("not")) {
                return str;
            }
        }
        return "not " + str;

    }

    ;

    // warm up 2
    public static String stringSplosion(String str) {
        String newStr = "";
        if (str.length() > 0) {
            for (int i = 0; i <= str.length(); i++) {
                newStr += str.substring(0, i);

            }
        }


        return newStr;
    }

    ;

    //string 1
    public static String withoutX2(String str) {
        char x = 'x';
        if (str.length() == 1) {
            if (str.equals("x")) {
                return "";
            }
            return str;
        }
        if (str.length() > 0) {
            if (str.charAt(1) == x && str.charAt(0) == x) {
                return str.substring(2, str.length());
            }
            if (str.charAt(0) == x) {
                return str.substring(1, str.length());
            }
            if (str.charAt(1) == x) {
                return str.charAt(0) + str.substring(2, str.length());
            }
        }
        return str;
    }

    ;

    // array 1
    public static boolean firstLast6(int[] nums) {
        if(nums[nums.length -1 ] == 6 || nums[0] == 6){
            return true;
        }
        return false;
    }

    ;

    // logic 1

    public static int sumLimit(int a, int b) {
        if (a >= 0 && b >= 0) {
            int sum = a + b;
            String sumLength = String.valueOf(sum);
            String aLength = String.valueOf(a);
            if (sumLength.length() != aLength.length()) {
                return a;
            }
            return sum;

        }


        return 0;
    }

    ;

    // logic 2
    public static int makeChocolate(int small, int big, int goal) {
        big = big * 5;
        if (small + big >= goal) {

            if (goal == big) {
                return 0;
            }
            if (goal < big) {
                for (int i = 0; i <= big; i += 5) {
                    int newBig = big - i;
                    if (newBig == goal) {
                        return 0;
                    }
                    if (newBig < goal) {
                        if (goal - newBig <= small) {
                            return goal - newBig;
                        } else {
                            return -1;
                        }
                    }
                }
            }


            if (goal - small <= 0) {
                for (int i = 0; i <= small; i++) {
                    int newSmall = small + i;
                    if (goal - newSmall == 0) {
                        return newSmall;
                    }
                }

            }
            if (small + big == goal) {
                return small;
            }
            if (goal > big) {
                return goal - big;
            }
            for (int i = 0; i <= big; i += 5) {
                if (goal % big + big - i == goal) {
                    return goal % big;
                }
            }


        }


        return -1;

    }

    //string 2
    public static String wordEnds(String str, String word) {
        //string or word aren't blank
        String result = "";
        int puzishun = str.indexOf(word);
        if(str.equals("") || word.equals("")){
            return "";
        }
        for(int i =0; i<=str.length(); i++){
            if(puzishun!=-1){
                if(puzishun!=0){
                    result+=str.charAt(puzishun-1);
                }
                if(puzishun+word.length() != str.length()){
                    result += str.charAt(puzishun + word.length());
                }

                puzishun = str.indexOf(word, puzishun+1);

            }


        }

        return result;


        }

        //string 3
        public static int sumDigits(String str){
            int count = 0;
            for(int i = 0; i<str.length(); i++){
                if(Character.isDigit(str.charAt(i))){
                    count += Character.getNumericValue(str.charAt(i));
                }
            }
            return count;

        }
         //array 2
        public static int countEvens(int[] nums){
            int count = 0;
            for(int i = 0; i<nums.length; i++){
                if(nums[i]%2 == 0){
                    count+=1;
                }
            }
            return count;

        }
        //array 3
    public static boolean linearIn(int[] outer, int[] inner){
        int count = 0;
        int realCount= 0;
        for(int i = 0; i<inner.length; i++){
            count = 0;
            for(int j = 0; j<outer.length; j++){
                if(outer[j] == inner[i]){
                    count+=1;
                }
            }
            if(count>=1){
                realCount +=1;
            }

        }
        if(realCount >= inner.length){
            return true;
        }
        return false;

    }



}

