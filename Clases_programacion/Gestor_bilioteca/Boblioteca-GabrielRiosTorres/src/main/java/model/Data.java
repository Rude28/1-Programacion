package model;

import java.time.OffsetDateTime;

@lombok.Data
public class Data {
    private long id;
    private long year;
    private String title;
    private String handle;
    private String publisher;
    private String isbn;
    private long pages;
    private String[] notes;
    private transient OffsetDateTime createdAt;
    private Villain[] villains;
}
