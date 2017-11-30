//package com.simplesys.gantt.JVM
//
//import java.time.LocalDateTime
//
//import com.simplesys.common.Time._
//import com.simplesys.gantt.Group.Group
//import com.simplesys.gantt.MileStone.MileStone
//import com.simplesys.gantt.Opening.Opening
//import com.simplesys.gantt._
//import com.simplesys.gantt.TaskCssClass.TaskCssClass
//import io.circe.java8.time._
//import io.circe.{Decoder, Encoder}
//
//object TaskItemExt {
//    implicit final val decodeLocalDateTimeDefault: Decoder[LocalDateTime] = decodeLocalDateTime(SS_LOCAL_DATE_TIME)
//    implicit final val encodeLocalDateTimeDefault: Encoder[LocalDateTime] = encodeLocalDateTime(SS_LOCAL_DATE_TIME)
//
//    implicit val taskCssClassDecoder: Decoder[TaskCssClass.Value] = Decoder.enumDecoder(TaskCssClass)
//    implicit val taskCssClassEncoder: Encoder[TaskCssClass.Value] = Encoder.enumEncoder(TaskCssClass)
//
//    implicit val groupDecoder: Decoder[Group.Value] = Decoder.enumDecoder(Group)
//    implicit val groupEncoder: Encoder[Group.Value] = Encoder.enumEncoder(Group)
//
//    implicit val openingDecoder: Decoder[Opening.Value] = Decoder.enumDecoder(Opening)
//    implicit val openingEncoder: Encoder[Opening.Value] = Encoder.enumEncoder(Opening)
//
//    implicit val mileStoneDecoder: Decoder[MileStone.Value] = Decoder.enumDecoder(MileStone)
//    implicit val mileStoneEncoder: Encoder[MileStone.Value] = Encoder.enumEncoder(MileStone)
//
//    implicit val dependEnDecoder: Decoder[DependEn.Value] = Decoder.enumDecoder(DependEn)
//    implicit val dependEnEncoder: Encoder[DependEn.Value] = Encoder.enumEncoder(DependEn)
//}
//
//case class TaskItemExt(
//                        pID: Long,
//                        pName: String,
//                        pStart: Option[LocalDateTime] = None,
//                        pEnd: Option[LocalDateTime] = None,
//                        pClass: TaskCssClass,
//                        pLink: Option[String] = None,
//                        pMile: Option[MileStone] = None,
//                        pRes: Option[String] = None,
//                        pComp: Option[Int] = None,
//                        pGroup: Option[Group] = None,
//                        pParent: Option[Long] = None,
//                        pOpen: Option[Opening] = None,
//                        pDepend: Option[Depend] = None,
//                        pCaption: Option[String] = None,
//                        pNotes: Option[String] = None
//                      )
