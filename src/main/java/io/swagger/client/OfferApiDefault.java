package io.swagger.client;

import io.swagger.client.api.OfferApi;
import io.swagger.client.auth.ApiKeyAuth;
import io.swagger.client.util.ClientResourcesBundle;

/**
 * TODO
 *
 * @author Atila Ekimci
 */

public class OfferApiDefault {

    public static final ClientResourcesBundle CLIENT_RESOURCES_BUNDLE = new ClientResourcesBundle();
    public static final String API_KEY = CLIENT_RESOURCES_BUNDLE.getApiKey();
    public static final String BASE_PATH = CLIENT_RESOURCES_BUNDLE.getBasePath();

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath(BASE_PATH);
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey(API_KEY);
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        OfferApi apiInstance = new OfferApi();
        try {

            System.err.println( "Getting offer nr 3 : " + apiInstance.getOfferById(3L));
        } catch (ApiException e) {
            System.err.println("Exception when calling OfferApi#addOffer");
            e.printStackTrace();
        }
    }
}
