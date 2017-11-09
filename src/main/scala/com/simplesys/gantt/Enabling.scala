package com.simplesys.gantt

import language.implicitConversions

object Enabling extends Enumeration {
    type Enabling = Value
    val enable = Value(1)
    val disable = Value(2)
}
