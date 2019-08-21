package pl.czympojade.common.Providers;

/**
 * Created by JacksonGenerator on 14.08.19.
 */

import pl.czympojade.common.Jsonable;


public class Logo implements Jsonable {

    private String small;
    private String big;

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getBig() {
        return big;
    }

    public void setBig(String big) {
        this.big = big;
    }
}