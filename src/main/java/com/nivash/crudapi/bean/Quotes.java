package com.nivash.crudapi.bean;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "Quotes")
public class Quotes {

    @Id
    private String id;
    private String quotetext;
    private String quoteauthor;

    public Quotes() {
    }

    public Quotes(String id, String quoteText, String quoteAuthor) {
        this.id = id;
        this.quotetext = quoteText;
        this.quoteauthor = quoteAuthor;
    }
}
