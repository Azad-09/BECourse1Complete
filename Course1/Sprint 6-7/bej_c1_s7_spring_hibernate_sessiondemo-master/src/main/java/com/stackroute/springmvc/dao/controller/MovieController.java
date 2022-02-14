package com.stackroute.springmvc.dao.controller;

import com.stackroute.springmvc.dao.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.stackroute.springmvc.dao.dao.IMovieDAO;


@Controller
@RequestMapping("/")
public class MovieController
{
	@Autowired
	private IMovieDAO movieDAO;
		
	@GetMapping("/")
	public ModelAndView getHomePage()
	{
		ModelAndView modelAndview = new ModelAndView("index");
		modelAndview.addObject("MovieList",movieDAO.getAllMovie());
		return modelAndview;
	}
	
	@PostMapping("/saveMovie")
	public String saveNews(@ModelAttribute("movie") Movie movie, ModelMap modelmap)
	{
		boolean status = movieDAO.saveMovie(movie);
		modelmap.addAttribute("newsList",movieDAO.getAllMovie());
		return "index";
	}
	
	@GetMapping("/delete")
	public String deleteNews(@RequestParam("MovieID") String MovieID)
	{
		movieDAO.deleteMovie(MovieID);
		return "redirect:/";
	}
}