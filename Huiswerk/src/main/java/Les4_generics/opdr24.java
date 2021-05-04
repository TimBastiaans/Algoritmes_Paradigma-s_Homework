package Les4_generics;

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
class opdr24
{
    public static <AnyType extends Comparable<? super AnyType>>
    AnyType min(AnyType[] arr){
        AnyType min = arr[0];
        for (AnyType a:arr){
            if (a.compareTo(min)<0){
                min=a;
            }
        }

        return min;
    }

    //ArrayList version
    public static <AnyType extends Comparable<? super AnyType>>
    AnyType min(ArrayList<AnyType> arr){
        AnyType min = arr.get(0);
        for (AnyType a:arr){
            if (a.compareTo(min)<0){
                min=a;
            }
        }

        return min;
    }

    public static void main (String[] arg){
        String[] input = {"c","d","a"};
        String res = min(input);
        System.out.println(res);
    }
}