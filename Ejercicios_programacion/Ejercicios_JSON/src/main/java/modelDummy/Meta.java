package modelDummy;

import java.time.OffsetDateTime;

@lombok.Data
public class Meta {
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
    private String barcode;
    private String qrCode;
}
