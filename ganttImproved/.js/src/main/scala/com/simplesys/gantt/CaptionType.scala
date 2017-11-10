package com.simplesys.gantt

import language.implicitConversions

object CaptionType extends Enumeration {
    type CaptionType = Value
    val None, Caption, Resource, Duration, Complete = Value
}
