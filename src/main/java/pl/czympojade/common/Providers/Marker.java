package pl.czympojade.common.Providers;

/**
 * Created by JacksonGenerator on 14.08.19.
 */

import pl.czympojade.common.Jsonable;

public class Marker implements Jsonable {

    private String busy;
    private String free;

    public String getBusy() {
        return busy;
    }

    public void setBusy(String busy) {
        this.busy = busy;
    }

    public String getFree() {
        return free;
    }

    public void setFree(String free) {
        this.free = free;
    }
}