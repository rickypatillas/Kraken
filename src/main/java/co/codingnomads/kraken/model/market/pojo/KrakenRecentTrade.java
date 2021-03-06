package co.codingnomads.kraken.model.market.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by Ricardo Roque
 *
 * This is the information body, KrakenRecentTrade POJO, for the result list of objects in api call GetRecentTrades,
 *
 * where all the displayed values are listed inside an array of pair name (trades) <url>https://api.kraken.com/0/public/Trades</url>
 *
 * This, mapped according to the body of the Kraken api <url>https://www.kraken.com/help/api#get-recent-trades</url>
 */

public class KrakenRecentTrade {

    /**
     * @param price
     * @param volume
     * @param time
     * @param buySell
     * @param marketLimit
     * @param miscellaneous
     */

    private final BigDecimal price;
    private final BigDecimal volume;
    private final double time;
    private final String buySell;
    private final String marketLimit;
    private final String miscellaneous;


    //Fully qualified constructor
    public KrakenRecentTrade(@JsonProperty("price") BigDecimal price, @JsonProperty("volume") BigDecimal volume,
                             @JsonProperty("time") double time, @JsonProperty("buySell") String buySell,
                             @JsonProperty("marketLimit") String marketLimit,
                             @JsonProperty("miscellaneous") String miscellaneous) {
        this.price = price;
        this.volume = volume;
        this.time = time;
        this.buySell = buySell;
        this.marketLimit = marketLimit;
        this.miscellaneous = miscellaneous;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public double getTime() {
        return time;
    }

    public String getBuySell() {
        return buySell;
    }

    public String getMarketLimit() {
        return marketLimit;
    }

    public String getMiscellaneous() {
        return miscellaneous;
    }

    @Override
    public String toString() {
        return "KrakenRecentTrade{" +
                "price='" + price + '\'' +
                ", volume='" + volume + '\'' +
                ", time=" + time +
                ", buySell='" + buySell + '\'' +
                ", marketLimit='" + marketLimit + '\'' +
                ", miscellaneous='" + miscellaneous + '\'' +
                '}';
    }
}
