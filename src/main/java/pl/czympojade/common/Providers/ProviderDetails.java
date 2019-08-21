package pl.czympojade.common.Providers;

/**
 * Created by JacksonGenerator on 14.08.19.
 */

import pl.czympojade.common.Jsonable;
import pl.czympojade.common.Vehicles.VehiclesItem;

import java.util.List;

public class ProviderDetails implements Jsonable {

    private String name;
    private Marker marker;
    private Logo logo;
    private List<VehiclesItem> vehicles;
    private Boolean emailRequired;
    private Boolean phoneRequired;
    private String nativeAppAndroid;
    private String nativeAppIos;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Marker getMarker() {
        return marker;
    }

    public void setMarker(Marker marker) {
        this.marker = marker;
    }

    public Logo getLogo() {
        return logo;
    }

    public void setLogo(Logo logo) {
        this.logo = logo;
    }

    public List<VehiclesItem> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<VehiclesItem> vehicles) {
        this.vehicles = vehicles;
    }

    public Boolean getEmailRequired() {
        return emailRequired;
    }

    public void setEmailRequired(Boolean emailRequired) {
        this.emailRequired = emailRequired;
    }

    public Boolean getPhoneRequired() {
        return phoneRequired;
    }

    public void setPhoneRequired(Boolean phoneRequired) {
        this.phoneRequired = phoneRequired;
    }

    public String getNativeAppAndroid() {
        return nativeAppAndroid;
    }

    public void setNativeAppAndroid(String nativeAppAndroid) {
        this.nativeAppAndroid = nativeAppAndroid;
    }

    public String getNativeAppIos() {
        return nativeAppIos;
    }

    public void setNativeAppIos(String nativeAppIos) {
        this.nativeAppIos = nativeAppIos;
    }
}