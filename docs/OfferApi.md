# OfferApi

All URIs are relative to *https://virtserver.swaggerhub.com/atilaek/Offers/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOffer**](OfferApi.md#addOffer) | **POST** /offer | Add a new offer for merchant
[**deleteOffer**](OfferApi.md#deleteOffer) | **DELETE** /offer/{offerId} | Deletes a offer
[**getOfferById**](OfferApi.md#getOfferById) | **GET** /offer/{offerId} | Find offer by ID
[**updateOffer**](OfferApi.md#updateOffer) | **PUT** /offer | Update an existing offer

<a name="addOffer"></a>
# **addOffer**
> addOffer(body)

Add a new offer for merchant

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OfferApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OfferApi apiInstance = new OfferApi();
Offer body = new Offer(); // Offer | Offer object that needs to be added to the store
try {
    apiInstance.addOffer(body);
} catch (ApiException e) {
    System.err.println("Exception when calling OfferApi#addOffer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Offer**](Offer.md)| Offer object that needs to be added to the store |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteOffer"></a>
# **deleteOffer**
> deleteOffer(offerId, apiKey)

Deletes a offer

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OfferApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OfferApi apiInstance = new OfferApi();
Long offerId = 789L; // Long | Offer id to delete
String apiKey = "apiKey_example"; // String | 
try {
    apiInstance.deleteOffer(offerId, apiKey);
} catch (ApiException e) {
    System.err.println("Exception when calling OfferApi#deleteOffer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **Long**| Offer id to delete |
 **apiKey** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getOfferById"></a>
# **getOfferById**
> Offer getOfferById(offerId)

Find offer by ID

Returns a single offer

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OfferApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OfferApi apiInstance = new OfferApi();
Long offerId = 789L; // Long | ID of offer to return
try {
    Offer result = apiInstance.getOfferById(offerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OfferApi#getOfferById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **Long**| ID of offer to return |

### Return type

[**Offer**](Offer.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="updateOffer"></a>
# **updateOffer**
> updateOffer(body)

Update an existing offer

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OfferApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

OfferApi apiInstance = new OfferApi();
Offer body = new Offer(); // Offer | Offer object that needs to be added to the store
try {
    apiInstance.updateOffer(body);
} catch (ApiException e) {
    System.err.println("Exception when calling OfferApi#updateOffer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Offer**](Offer.md)| Offer object that needs to be added to the store |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

