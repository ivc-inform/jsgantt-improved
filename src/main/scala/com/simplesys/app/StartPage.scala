package com.simplesys.app

import scala.scalajs.js.annotation.JSExportTopLevel
import org.scalajs.dom
import scalatags.Text.all._


class StartPage {

    def getDiv = {
        h1("Header 1")
    }
}

object GanttImprovedTest {
    @JSExportTopLevel("GanttImprovedTest")
    def main() = {
        val textExample = new StartPage
        dom.document.getElementById("GanttChartDIV").innerHTML = textExample.getDiv.render
    }
}
