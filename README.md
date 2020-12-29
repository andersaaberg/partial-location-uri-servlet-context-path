# partial-location-uri-servlet-context-path

https://github.com/grails/grails-core/issues/10879 made it possible to create a partial URL in the Location HTTP-header
for redirects. This yields a correct Location HTTP-header as long as "server.servlet.context-path" is not set. However,
if "server.servlet.context-path" is set, then the context-path is not included in the Location HTTP-header which is incorrect.

See PartialLocationUriSpec