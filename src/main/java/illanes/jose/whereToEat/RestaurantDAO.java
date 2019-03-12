package illanes.jose.whereToEat;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@Component
public class RestaurantDAO {


    public static List<Restaurant> restaurantList = new ArrayList<Restaurant>();

    static {
        restaurantList.add(new Restaurant(1, "La Grada"));
        restaurantList.add(new Restaurant(2, "Casa Paco"));
        restaurantList.add(new Restaurant(3, "Chino"));
        restaurantList.add(new Restaurant(4, "Just eat"));
        restaurantList.add(new Restaurant(5, "La Scala"));
        restaurantList.add(new Restaurant(6, "Burger King"));
    }

    public List<Restaurant> retrieveAllRestaurants() {
        return restaurantList;
    }

    public Restaurant getRandomRestaurant(List<Integer> restaurantsId) {
        List<Restaurant> restaurants = new ArrayList<>();

        for (int id : restaurantsId) {
            for (Restaurant restaurant : restaurantList) {
                if (restaurant.getId() == id) {
                    restaurants.add(restaurant);
                }
            }
        }

        int randomIndex = (int) (Math.random() * restaurants.size());
        return restaurants.get(randomIndex);
    }
}
