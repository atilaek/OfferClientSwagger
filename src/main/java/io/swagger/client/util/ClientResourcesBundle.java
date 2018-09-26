package io.swagger.client.util;

import java.util.ResourceBundle;

/**
 * TODO
 *
 * @author Atila Ekimci
 */
public class ClientResourcesBundle {
    private final static String apiKey = "apiKey";
    private final static String basePath = "basePath";

    private String bundleName;
    private ResourceBundle resourceBundle;

    public ClientResourcesBundle(final String bundleName) {
        resourceBundle = ResourceBundle.getBundle(bundleName);
    }

    @SuppressWarnings("unused")
    public ClientResourcesBundle() {
        resourceBundle = ResourceBundle.getBundle("clientResources");
    }

    public String getProperty(final String propertyId) {
        return resourceBundle.getString(propertyId);
    }

    public String getApiKey() {
        return getProperty(apiKey);
    }

    public String getBasePath() {
        return getProperty(basePath);
    }
}
