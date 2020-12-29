package partial.location.uri.servlet.context.path

class TestController {

    def index() {
        redirect(absolute: false, controller: 'other')
    }
}
