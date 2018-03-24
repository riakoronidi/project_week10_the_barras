package com.codeclan.db;

import com.codeclan.enums.CategoryType;
import com.codeclan.models.Advert;
import com.codeclan.models.Category;
import com.codeclan.models.User;

import java.util.GregorianCalendar;

public class Seeds {

    public static void seedData() {

//        DBHelper.deleteAll(Category.class);
//        DBHelper.deleteAll(User.class);
//        DBHelper.deleteAll(Advert.class);

        Category category = new Category(CategoryType.MOTOR_AND_CARS);
        DBHelper.saveOrUpdate(category);

        User user = new User("Paul");
        DBHelper.saveOrUpdate(user);

        Advert advert = new Advert("Raleigh Striker Bike", "1984 Raleigh Striker for sale. Good condition. Will accept offers", 100.00, new GregorianCalendar(2018, 03, 10), category);
        DBHelper.saveOrUpdate(advert);

        DBHelper.addAdvertToUser(user, advert);



    }

}
