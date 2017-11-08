package com.simplesys.app

import scala.scalajs.js.annotation.JSExportTopLevel
import org.scalajs.dom


class StartPage[Builder, Output <: FragT, FragT](val bundle: scalatags.generic.Bundle[Builder, Output, FragT]) {

    import bundle.all._

    def getDiv = {
        h1("Header 1")
    }
}

object GanttImprovedTest {
    @JSExportTopLevel("GanttImprovedTest")
    def main(t1: String) = {
        val textExample = new StartPage(scalatags.Text)
        dom.document.getElementById(t1).innerHTML = textExample.getDiv.render
    }
}
