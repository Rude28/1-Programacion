package modelDummy;

import java.time.OffsetDateTime;

@lombok.Data
public class Review {
    private long rating;
    private String comment;
    private OffsetDateTime date;
    private String reviewerName;
    private String reviewerEmail;
}
