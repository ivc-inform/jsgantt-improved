package com.simplesys.gantt

import language.implicitConversions

object Group extends Enumeration {
    type Group = Value
    val normalTask, standardGroupTask, combinedGroup = Value
}
