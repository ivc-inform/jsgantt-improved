package com.simplesys.gantt

import scala.language.implicitConversions

object Group extends Enumeration {
    type Group = Value
    val normalTask, standardGroupTask, combinedGroup = Value
}
