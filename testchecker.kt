import org.testng.annotations.Test
import javax.lang.model.type.TypeVisitor
import java.io.FileReader
import java.io.File

object CheckerTest {
    fun check(fname: String) {
        val f = File(fname)
        val fr = FileReader(f)
        val parser = Parser(fr)
        parser.parse()
        val erros = mutableListOf<String>()
        tipo(parser.saida, emptyMap(), erros)
        for (err in erros) {
            System.err.println(err)
        }
    }

    @Test
    fun test1() {
        check("factorial.java")
    }

    @Test
    fun test2() {
        check("binarysearch.java")
    }

    @Test
    fun test3() {
        check("bubblesort.java")
    }

    @Test
    fun test4() {
        check("treevisitor.java")
    }
}