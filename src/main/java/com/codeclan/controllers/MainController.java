package com.codeclan.controllers;

import com.codeclan.db.Seeds;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.SparkBase.staticFileLocation;

public class MainController {

    public static void main(String[] args) {

        Seeds.seedData();

        staticFileLocation("/public");

        AdvertController advertController = new AdvertController();
        CategoryController categoryController = new CategoryController();
        UserController userController = new UserController();

        get("/", (req, res) -> {

            Map<String, Object> model = new HashMap<>();
            model.put("template", "templates/main.vtl");

            return new ModelAndView(model, "templates/layout.vtl");

        }, new VelocityTemplateEngine());


    }

}
