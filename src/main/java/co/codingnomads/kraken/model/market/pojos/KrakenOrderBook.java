package co.codingnomads.kraken.model.market.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by Ricardo Roque
 * 1/Dec/2017
 */


public class KrakenOrderBook {

    //ask side array of array contains three values(price, volume, timestamp).
    private final List<KrakenOrder> asks;
    //ask side array of array contains three values(price, volume, timestamp).
    private final List<KrakenOrder> bids;

    public KrakenOrderBook(@JsonProperty("asks") List<KrakenOrder> asks, @JsonProperty("bids") List<KrakenOrder> bids) {
        this.asks = asks;
        this.bids = bids;
    }

    public List<KrakenOrder> getAsks() {
        return asks;
    }

    public List<KrakenOrder> getBids() {
        return bids;
    }



    @Override
    public String toString() {
        return "KrakenOrderBook{" +
                "asks='" + asks + '\'' +
                ", bids='" + bids + '\'' +
                '}';
    }
}
