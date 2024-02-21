/* Generated by camel build tools - do NOT edit this file! */
package org.fusesource.camel.component.sap;

import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class SapTransactionalIDocListDestinationEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":destination:idocType:idocTypeExtension:systemRelease:applicationRelease";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(6);
        props.add("applicationRelease");
        props.add("destination");
        props.add("idocType");
        props.add("idocTypeExtension");
        props.add("lazyStartProducer");
        props.add("systemRelease");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        SECRET_PROPERTY_NAMES = Collections.emptySet();
        MULTI_VALUE_PREFIXES = Collections.emptySet();
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "sap-idoclist-destination".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "destination", null, true, copy);
        uri = buildPathParameter(syntax, uri, "idocType", null, true, copy);
        uri = buildPathParameter(syntax, uri, "idocTypeExtension", null, false, copy);
        uri = buildPathParameter(syntax, uri, "systemRelease", null, false, copy);
        uri = buildPathParameter(syntax, uri, "applicationRelease", null, false, copy);
        uri = buildQueryParameters(uri, copy, encode);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public Set<String> secretPropertyNames() {
        return SECRET_PROPERTY_NAMES;
    }

    @Override
    public Set<String> multiValuePrefixes() {
        return MULTI_VALUE_PREFIXES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}
