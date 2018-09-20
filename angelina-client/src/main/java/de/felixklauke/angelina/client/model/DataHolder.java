package de.felixklauke.angelina.client.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.ToString;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
@Data
@ToString
public class DataHolder<ContentType> {

    @SerializedName("data")
    private final ContentType content;
}
