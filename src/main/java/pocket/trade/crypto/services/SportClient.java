package pocket.trade.crypto.services;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

public class SportClient {

    SpotClient client = new SpotClientImpl();

    public SpotClient getClient() {
        return client;
    }
}
