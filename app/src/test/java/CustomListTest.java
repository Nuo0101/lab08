
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    @BeforeAll
    public void createList(){
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("A","B"));
        assertEquals(list.getCount(), listSize+1);
    }

    @Test
    public void hasCityTest(){
        assertEquals(true,list.hasCity(new City("A","B")));
    }

    @Test
    public void deleteCityTest(){
        int listSize = list.getCount();
        list.deleteCity(new City("A","B"));
        assertEquals(list.getCount(), listSize-1);
    }

    @Test
    public void countCityTest(){
        int listSize = list.getCount();
        assertEquals(list.getCount(), listSize);
    }
}
