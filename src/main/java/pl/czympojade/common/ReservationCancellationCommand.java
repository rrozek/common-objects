//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package pl.czympojade.common;

public class ReservationCancellationCommand {
    private String provider;
    private String token;

    public ReservationCancellationCommand() {
    }

    public ReservationCancellationCommand(String provider, String token) {
        this.provider = provider;
        this.token = token;
    }

    public String getProvider() {
        return this.provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String toString() {
        return "ReservationCancellationCommand{provider='" + this.provider + '\'' + ", token='" + this.token + '\'' + '}';
    }
}
