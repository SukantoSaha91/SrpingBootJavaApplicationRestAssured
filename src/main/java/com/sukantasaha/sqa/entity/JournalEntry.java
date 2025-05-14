package com.sukantasaha.sqa.entity;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;

@Document(collection = "journal_entries")
public class JournalEntry {


    private ObjectId id;
    private String tittle;
    private String content;

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {

        this.date = date;
    }

    private LocalDateTime date;


    public ObjectId getId() {

        return id;
    }

    public void setId(ObjectId id) {

        this.id = id;
    }

    public String getTittle() {

        return tittle;
    }

    public void setTittle(String tittle) {

        this.tittle = tittle;
    }

    public String getContent() {

        return content;
    }

    public void setContent(String content) {

        this.content = content;
    }


}
