import com.google.gson.annotations.SerializedName;

import java.util.Scanner;

public record Tarifa(
                    @SerializedName("result") String rslt,
                    @SerializedName("base_code") String base,
                    @SerializedName("target_code") String targt,
                    @SerializedName("conversion_result") Double monto) {
}
