package org.azad.controller;

import org.azad.dao.IMovieDAO;
import org.azad.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class MovieController {

    @Autowired
    private IMovieDAO movieDAO;


    @GetMapping("/")
    public ModelAndView getHomePage()
    {
        ModelAndView modelAndview = new ModelAndView("index");
        modelAndview.addObject("newsList",movieDAO.getAllMovie());
        return modelAndview;
    }

    @PostMapping("/saveNews")
    public String saveNews(@ModelAttribute("movie") Movie news, ModelMap modelmap)
    {
        boolean status = movieDAO.saveMovie();
        modelmap.addAttribute("newsList",movieDAO.getAllMovie());
        return "index";
    }

    @GetMapping("/deletenews")
    public String deleteMovie(@RequestParam("index") int index)
    {
        movieDAO.deleteMovie(movie);
        return "redirect:/";
    }
}
