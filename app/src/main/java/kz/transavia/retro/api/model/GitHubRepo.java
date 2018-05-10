package kz.transavia.retro.api.model;

public class GitHubRepo {
    String name;
    public String shipType;

    public void setShipType(String shipType) {
        this.shipType = shipType;
    }

    public String getShipType() {
        return shipType;
    }

    public String getName() {
        return name;
    }
}
