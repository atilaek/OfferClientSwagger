# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.OfferApi;

import java.io.File;
import java.util.*;

public class OfferApiExample {

    public static void main(String[] args) {
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
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://virtserver.swaggerhub.com/atilaek/Offers/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OfferApi* | [**addOffer**](docs/OfferApi.md#addOffer) | **POST** /offer | Add a new offer for merchant
*OfferApi* | [**deleteOffer**](docs/OfferApi.md#deleteOffer) | **DELETE** /offer/{offerId} | Deletes a offer
*OfferApi* | [**getOfferById**](docs/OfferApi.md#getOfferById) | **GET** /offer/{offerId} | Find offer by ID
*OfferApi* | [**updateOffer**](docs/OfferApi.md#updateOffer) | **PUT** /offer | Update an existing offer

## Documentation for Models

 - [Offer](docs/Offer.md)
 - [OfferPrice](docs/OfferPrice.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### api_key

- **Type**: API key
- **API key parameter name**: api_key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

atilaek@atilek.atilaek
