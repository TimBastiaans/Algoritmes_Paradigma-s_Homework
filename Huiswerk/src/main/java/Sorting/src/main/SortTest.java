package main;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class SortTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(InsertionSort.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @org.junit.Test
    public void sort() {
        int [] values1 = {2,3,4,5,6,23,68,7,8,1};
        CustomSort insertionSort = new InsertionSort();
        printArray(insertionSort.sort(values1));
    }

    private void printArray(int [] numbers){
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+',');
        }
        System.out.println();
    }


}
