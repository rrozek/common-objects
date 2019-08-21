package pl.czympojade.common.Vehicles;

/**
 * Created by JacksonGenerator on 14.08.19.
 */

import pl.czympojade.common.Jsonable;

public class VehiclesItem implements Jsonable {

    private String img;
    private String model;
    private VehiclePowerSource power;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public VehiclePowerSource getPower() {
        return power;
    }

    public void setPower(VehiclePowerSource power) {
        this.power = power;
    }
}