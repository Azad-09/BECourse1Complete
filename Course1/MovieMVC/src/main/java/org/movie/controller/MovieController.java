package org.movie.controller;

import org.movie.model.Movie;
import org.movie.repositary.MovieRepo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class MovieController {
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

    Movie movie = context.getBean("movie",Movie.class);
    MovieRepo movieRepo = context.getBean("movieRepo",MovieRepo.class);


    public MovieController()
    {
        System.out.println("Movie Controller Instantiated ...");
    }

    @GetMapping(path="/")
    public String getMovieHomePage()
    {
        System.out.println("Taking to home Page");
        return "index";
    }

    @PostMapping("/saveMovie")
    public String saveMovie(@ModelAttribute("movie") Movie movie, ModelMap model)
    {
        System.out.println("Taking to the save Movie Page");
        System.out.println("Taking to the save Movie Page ...."+movie);

        this.movieRepo.addMovie(movie);
        model.addAttribute("movieList",this.movieRepo.getMoviedata());

        return "index";
    }
}







