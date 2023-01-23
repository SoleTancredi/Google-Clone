package com.project.clon.controllers;

import com.project.clon.entities.WebPage;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SearchController {

    @RequestMapping(value = "api/search/{id}", method = RequestMethod.GET)
    public WebPage search(@PathVariable Long id) {
        List<WebPage> result = new ArrayList<>();
        WebPage webPage = WebPage.WebPageBuilder.aWebPage().witId(id)
                .withDescription("yes").withUrl("no").withTitle("ester").build();
        return  webPage;
    }
}
