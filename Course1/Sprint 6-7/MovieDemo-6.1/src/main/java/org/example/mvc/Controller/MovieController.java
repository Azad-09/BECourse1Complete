package org.example.mvc.Controller;

import org.example.mvc.Model.Movie;
import org.example.mvc.repository.Movierepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

    Movie movie =context.getBean("movie",Movie.class);
    Movierepository movierepository =context.getBean("movierepository",Movierepository.class);

    public MovieController()
    {
        System.out.println("Employee Controller Instantiated ...");
    }
    @GetMapping(path="/")
    public String getNewsHomePage()
    {
        System.out.println("Taking to home Page");
        return "index";
    }
    @PostMapping("/savemovie")
    public String savemovie(@ModelAttribute("movie") Movie movie, ModelMap model)
    {
        System.out.println("Taking to the save News Page");
        System.out.println("Taking to the save News Page ...."+movie);

        this.movierepository.addMovie(movie);
        model.addAttribute("movieList",this.movierepository.getMovieData());

        return "index";
    }
    @RequestMapping(value = "/home")
    public String Home(){
        return "home";
    }

}
