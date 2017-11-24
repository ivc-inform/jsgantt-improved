package com.simplesys.gantt

import scala.language.implicitConversions

object MileStone extends Enumeration {
    type MileStone = Value
    val notMilestone, milestone = Value
}
