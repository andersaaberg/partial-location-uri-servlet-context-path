import grails.testing.mixin.integration.Integration
import spock.lang.Ignore
import spock.lang.Specification

@Integration
class PartialLocationUriSpec extends Specification {

    /**
     * Works only if server.servlet.context-path is not set in application.yml
     */
    @Ignore
    void 'test without servlet context'() {
        expect:
        new URL("http://localhost:${serverPort}/test").text == 'was redirected to OtherController'
    }

    void 'test with servlet context'() {
        expect:
        new URL("http://localhost:${serverPort}/app/test").text == 'was redirected to OtherController'
    }
}
