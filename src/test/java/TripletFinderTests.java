import model.TripletFinder;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by malang on 29/01/19.
 */

public class TripletFinderTests {

    @Test
    public void shouldNotFindEmptyArray(){
        int[] array = {};
        Assert.assertFalse(TripletFinder.findTripletInArray(array, 12));
    }

    @Test
    public void shouldNotFindNoValue(){
        int[] array = {1,2,3};
        Assert.assertFalse(TripletFinder.findTripletInArray(array, 7));
    }

    @Test
    public void shouldFindValue(){
        int[] array = {1,2,3};
        Assert.assertTrue(TripletFinder.findTripletInArray(array, 6));
    }


    @Test
    public void shouldNotFindEmptyArrayOptimized(){
        int[] array = {};
        Assert.assertFalse(TripletFinder.findTripletInArrayOptimized(array, 12));
    }

    @Test
    public void shouldNotFindNoValueOptimized(){
        int[] array = {1,2,3};
        Assert.assertFalse(TripletFinder.findTripletInArrayOptimized(array, 7));
    }

    @Test
    public void shouldFindValueOptimized(){
        int[] array = {1,2,3};
        Assert.assertTrue(TripletFinder.findTripletInArrayOptimized(array, 6));
    }
}
