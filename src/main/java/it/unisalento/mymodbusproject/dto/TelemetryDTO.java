package it.unisalento.mymodbusproject.dto;

public class TelemetryDTO {
    String type;
    Float value;

    public TelemetryDTO(){}

    public TelemetryDTO(String type, Float value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }
}
