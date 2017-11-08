import org.testng.annotations.Test
import java.io.File
import java.io.FileReader

object Driver {
    fun parse(fname: String) {
        val parser = TINYParser(TINYScanner(FileReader(File(fname))))
        parser.parse()
        println(parser.out)
        println(parser.out.tipos(parser.out.escopo()))
    }

    @Test
    fun test4() {
        parse("parimpar.tiny")
    }

    @Test
    fun test5() {
        parse("ciclo.tiny")
    }

    @Test
    fun test6() {
        parse("nosuper.tiny")
    }

    @Test
    fun test7() {
        parse("recampo.tiny")
    }

    @Test
    fun test8() {
        parse("errotipos.tiny")
    }
}
