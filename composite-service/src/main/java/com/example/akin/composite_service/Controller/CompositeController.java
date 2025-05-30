package com.example.akin.composite_service.Controller;

import com.example.akin.composite_service.BookSummary;
import com.example.akin.composite_service.Service.CompositeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book-composite")
public class CompositeController {
@Autowired
    CompositeServices compositeServices;

    public CompositeController(CompositeServices services){
        this.compositeServices=services;
    }

    @GetMapping("/{bookId}")
    public BookSummary getSummary(@PathVariable int id){
        List book = compositeServices.getBooks(id);
        List reviews = compositeServices.getReviewsByBookId(id);
        List recommendation = compositeServices.getRecommendationsByBookId(id);
        return  new BookSummary(book,recommendation,reviews);
    }
}
