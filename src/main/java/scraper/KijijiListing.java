package scraper;

public class KijijiListing {
    private String url;
    private String name;
    private String price;

    public String getUrl() {
        return url;
    }

    public void setUrl(String newUrl) {
        this.url = newUrl;
    }

    public String getName() {
        return name;
    }

    public  void setName(String newName) {
        this.name = newName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String newPrice) {
        this.price = newPrice;
    }

    @Override
    public String toString() {

        return "{ \"url\":\"" + url + "\",\n "
                + "\"name\":\"" + name + "\",\n "
                + "\"price\": \"" + price + "\"\n }\n";
    }

}
