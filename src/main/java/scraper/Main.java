package scraper;
import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;
import java.util.ArrayList;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Document doc;

        try {
            doc = Jsoup.connect("https://www.kijiji.ca/b-ontario/fujifilm-lens/k0l9004")
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36")
                    .header("Accept-Language", "*")
                    .get();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //initialize list of object listing to store scraped data
        ArrayList<KijijiListing> kijijiListings = new ArrayList<>();

        Elements listings = doc.select("section.sc-379c64e5-1");

        for (Element listing : listings) {
            KijijiListing kijijiListing = new KijijiListing();

            // extracting data of interest
            kijijiListing.setUrl(listing.selectFirst("a").attr("href"));
            kijijiListing.setName(listing.selectFirst("a").text());
            kijijiListing.setPrice(listing.selectFirst("p").text());

            kijijiListings.add(kijijiListing);
        }

        //kijijiListings.toString();
        System.out.println("Hello");
        System.out.println(kijijiListings);
        System.out.println("Bye");

    }
}
