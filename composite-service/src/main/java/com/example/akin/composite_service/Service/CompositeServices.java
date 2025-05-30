package com.example.akin.composite_service.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CompositeServices {
    @Autowired
private RestTemplate restTemplate;

    public List getBooks(int id){
        String url = "http://book-service-flbm.onrender.com";
        return restTemplate.getForObject(url,List.class);
    }

    public List getRecommendationsByBookId(int id){
        String url = "http://localhost:7003/api/v1/bookrecommendations";
        return restTemplate.getForObject(url,List.class);
    }

    public List getReviewsByBookId(int id){
        String url = "http://review-service-428s.onrender.com/reviews";
        return restTemplate.getForObject(url,List.class);
    }
}
