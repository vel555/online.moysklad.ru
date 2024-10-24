package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder

public class AddGood {

    private String Item;
    private String ExternalCode;
    private String Code;
    private String Weight;
    private String Volume;
}
