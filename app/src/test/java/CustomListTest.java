import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    private City c = new City("A","B");
    @BeforeEach
    public void createList(){
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(c);
        assertEquals(listSize+1,list.getCount());
    }

    @Test
    public void hasCityTest(){
        assertEquals(false,list.hasCity(c));
    }

    @Test
    public void deleteCityTest(){
        list.addCity(c);
        int listSize = list.getCount();
        list.deleteCity(c);
        assertEquals(list.getCount(), listSize-1);
    }

    @Test
    public void countCityTest(){
        int listSize = list.getCount();
        assertEquals(list.getCount(), listSize);
    }
}
