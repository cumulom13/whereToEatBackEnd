package illanes.jose.whereToEat;

import com.google.gson.Gson;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class WhereToEatController {

    @Autowired
    private RestaurantDAO restaurantDAO;

    @CrossOrigin(origins = "http://localhost:8081")
    @GetMapping(path = "/randomRestaurant/{id}")
    public Restaurant getRandomRestaurant(@PathVariable("id") List<Integer> restaurantIds ) {
        return restaurantDAO.getRandomRestaurant(restaurantIds);
    }

    // One way to enable cross origin is using the annotation cross origin method by method and define the
    // allowed origins. Other way is to enabled globally in the application class. (see WhereToEatApplication.java)
//    @CrossOrigin(origins = "http://localhost:8081")
    @GetMapping(path = "/getAllRestaurants")
    public List<Restaurant> getAllRestaurants() {

        return restaurantDAO.retrieveAllRestaurants();
    }
}