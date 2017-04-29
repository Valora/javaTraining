package usingclosures

/**
 * Created by valora on 2017/3/12.
 */
class Resource {
    def open() { print "opened..." }

    def close() { print "closed..." }

    def read() { print "read..." }

    def write() { print "write..." }

    static use(closure) {
        def r = new Resource()
        try {
            r.open()
            closure(r)
        } finally {
            r.close()
        }
    }
}

def resource = new Resource()
resource.open()
resource.read()
resource.write()

Resource.use { res ->
    res.read()
    res.write()
}