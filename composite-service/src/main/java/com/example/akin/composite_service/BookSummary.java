package com.example.akin.composite_service;

import com.example.akin.composite_service.Service.CompositeServices;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookSummary extends CompositeServices{

    private final List getBook;
    private final List getRecommendation;
    private final List getReview;

    public BookSummary(List getBook, List getRecommendation, List getReview) {
        this.getBook = getBook;
        this.getRecommendation = getRecommendation;
        this.getReview = getReview;
    }

    public List getGetBook() {
        return getBook;
    }

    public List getGetRecommendation() {
        return getRecommendation;
    }

    public List getGetReview() {
        return getReview;
    }
}
