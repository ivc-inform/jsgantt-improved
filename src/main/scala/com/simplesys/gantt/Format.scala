package com.simplesys.gantt

import language.implicitConversions

object Format extends Enumeration {
    type Format = Value
    val hour, day, week, month, quarter = Value
}
