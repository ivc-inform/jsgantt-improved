package com.simplesys.gantt.JVM

import java.time.LocalDateTime

import com.simplesys.common.Time._
import com.simplesys.gantt.MileStone.MileStone
import io.circe.java8.time._
import io.circe.{Decoder, Encoder}

object TaskItemExt {
    implicit final val decodeLocalDateTimeDefault: Decoder[LocalDateTime] = decodeLocalDateTime(SS_LOCAL_DATE_TIME)
    implicit final val encodeLocalDateTimeDefault: Encoder[LocalDateTime] = encodeLocalDateTime(SS_LOCAL_DATE_TIME)
}

case class TaskItemExt(
                        pID: Long,
                        pName: String,
                        pStart: Option[LocalDateTime] = None,
                        pEnd: Option[LocalDateTime] = None,
                        pClass: String,
                        pLink: Option[String] = None,
                        //pMile: Option[MileStone] = None,
                        /*pRes: Option[String] = None,
                        pComp: Option[Int] = None,
                        pGroup: Option[Group] = None,
                        pParent: Option[Int] = None,
                        pOpen: Option[Opening] = None,
                        pDepend: Option[String] = None,
                        pCaption: Option[String] = None,
                        pNotes: Option[String] = None*/
                      )
