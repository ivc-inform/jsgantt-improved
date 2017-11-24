package com.simplesys.gantt

import scala.language.implicitConversions

object DependEn extends Enumeration {
    type DependEn = Value
    val FS, SF, SS, FF = Value
}
