package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder

public class AddGood {

    private String item;
    private String externalCode;
    private String code;
    private String weight;
    private String volume;
}
