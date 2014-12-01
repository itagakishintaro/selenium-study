import geb.spock.GebSpec
import geb.Browser

/**
 * Created by itdbd on 2014/12/01.
 */
class SpockParameterisedTest extends GebSpec {
    def setup(){
        go "http://www.google.co.jp"
    }

    def "Spockパラメタライズドテスト"(){
        expect:
        $("input", name: name).value() == value
        where:
        name       | value
        "btnK" | "Google 検索"
        "btnI" | "I'm Feeling Lucky"
    }
}

