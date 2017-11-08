package com.simplesys.app

import scalatags.Text
import scalatags.Text.all._
import scalatags.Text.tags2

class StartPage(_title: String) {
    def bodyHTML(lastScript: String): Text.TypedTag[String] = {
        html(
            head(
                tags2.title(_title),
                meta(httpEquiv := "Content-Type", content := "text/html; charset=utf-8")
            ),
            body(
                link(href := "jsgantt-improved/src/main/css/jsgantt.css", rel := "stylesheet", `type` := "text/css"),
                script(src := "jsgantt-improved/src/main/javascript/jsgantt.js"),
                script(lastScript)
            )
        )
    }
}
