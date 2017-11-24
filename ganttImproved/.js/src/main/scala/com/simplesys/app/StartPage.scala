package com.simplesys.app

import com.simplesys.gantt.GanttChart._
import com.simplesys.gantt.TaskCssClass._
import com.simplesys.gantt._
import org.scalajs.dom

import scala.language.implicitConversions
import scala.scalajs.js.annotation.JSExportTopLevel

object GanttImprovedTest {

    /**
      * pID:	(required) a unique numeric ID used to identify each row
      * pName:	(required) the task Label
      * pStart:	(required) the task start date, can enter empty date ('') for groups. You can also enter specific time (2016-02-20 12:00) for additional precision.
      * pEnd:	(required) the task end date, can enter empty date ('') for groups
      * pClass:	(required) the css class for this task
      * pLink:	(optional) any http link to be displayed in tool tip as the "More information" link.
      * pMile:	(optional) indicates whether this is a milestone task - Numeric; 1 = milestone, 0 = not milestone
      * pRes:	(optional) resource name
      * pComp:	(required) completion percent, numeric
      * pGroup:	(optional) indicates whether this is a group task (parent) - Numeric; 0 = normal task, 1 = standard group task, 2 = combined group task*
      *
      * * Combined group tasks show all sub-tasks on one row. The information displayed in the task list and row caption are taken from the parent task. Tool tips are generated individually
      * * for each sub-task from its own information. Milestones are not valid as sub-tasks of a combined group task and will not be displayed. No bounds checking of start and end dates of sub-tasks is performed
      * * therefore it is possible for these task bars to overlap. Dependencies can be set to and from sub-tasks only.
      *
      * pParent:	(required) identifies a parent pID, this causes this task to be a child of identified task. Numeric, top level tasks should have pParent set to 0
      * pOpen:	(required) indicates whether a standard group task is open when chart is first drawn. Value must be set for all items but is only used by standard group tasks. Numeric, 1 = open, 0 = closed
      * pDepend:	(optional) comma separated list of id's this task is dependent on. A line will be drawn from each listed task to this item
      * Each id can optionally be followed by a dependency type suffix. Valid values are:
      * 'FS' - Finish to Start (default if suffix is omitted)
      * 'SF' - Start to Finish
      * 'SS' - Start to Start
      * 'FF' - Finish to Finish
      * If present the suffix must be added directly to the id e.g. '123SS'
      * pCaption:	(optional) caption that will be added after task bar if CaptionType set to "Caption"
      * pNotes:	(optional) Detailed task information that will be displayed in tool tip for this task
      * pGantt:	(required) javascript JSGantt.GanttChart object from which to take settings. Defaults to "g" for backwards compatibility
      *
      **/

    @JSExportTopLevel("GanttImprovedTest")
    def get() = {
        val div = dom.document.getElementById("GanttChartDIV")

        implicit val g = new GanttChartExt(div, Format.day)
        g.addLang("rus", GanttChart.langRus)
        g setLang "rus"

        g.getDivId.foreach {
            _ ⇒
                g setCaptionType CaptionType.Complete
                g setQuarterColWidth 36
                g setDateTaskDisplayFormat "day dd mm yyyy HH:MI"
                g setDateTaskTableDisplayFormat "dd/mm/yyyy HH:MI"
                g setDayMajorDateDisplayFormat "mon yyyy - Week ww"
                g setWeekMinorDateDisplayFormat "dd mon"
                g setShowTaskInfoLink 1
                g setShowEndWeekDate 0
                g setUseSingleCell 20000
                g setShowComp 1
                //g setShowTaskInfoStartDate 0
                //g setFormatArr(Format.hour, Format.day, Format.week, Format.month, Format.quarter)
                g.AddTaskItem(new TaskItemExt(pID = 1, pName = "Define Chart API", pClass = ggroupblack, pRes = "Brian", pGroup = Group.standardGroupTask, pNotes = "Some Notes text"))
                g.AddTaskItem(new TaskItemExt(pID = 11, pName = "Chart Object", pStart = "2016-02-20 12:30".toLDT, pEnd = "2016-02-22 01:22".toLDT, pClass = gmilestone, pLink = Link("Link about"), pMile = MileStone.milestone, pRes = "Shlomy", pComp = 100, pParentID = 1))
                g.AddTaskItem(new TaskItemExt(pID = 12, pName = "Task Objects", pClass = ggroupblack, pRes = "Shlomy", pComp = 40, pGroup = Group.standardGroupTask, pParentID = 1, pOpen = Opening.open))
                g.AddTaskItem(new TaskItemExt(pID = 121, pName = "Constructor Proc", pStart = "2016-02-21 00:00".toLDT, pEnd = "2016-03-09 00:00".toLDT, pClass = gtaskblue, pRes = "Brian T.", pComp = 60, pParentID = 12, pOpen = Opening.open))
                g.AddTaskItem(new TaskItemExt(pID = 122, pName = "Task Variables", pStart = "2016-03-06 00:00".toLDT, pEnd = "2016-03-11 00:00".toLDT, pClass = gtaskred, pRes = "Brian", pComp = 60, pParentID = 12, pOpen = Opening.open, pDepend = 121))
                g.AddTaskItem(new TaskItemExt(pID = 123, pName = "Task by Minute/Hour", pStart = "2016-03-09 00:00".toLDT, pEnd = "2016-03-14 00:00".toLDT, pClass = gtaskyellow, pRes = "Ilan", pComp = 60, pParentID = 12, pOpen = Opening.open))
                g.AddTaskItem(new TaskItemExt(pID = 124, pName = "Task Functions", pStart = "2016-03-09 00:00".toLDT, pEnd = "2016-03-29 00:00".toLDT, pClass = gtaskred, pRes = "Anyone", pComp = 60, pParentID = 12, pOpen = Opening.open, pDepend = (123).SS, pCaption = "This is a caption"))
                g.AddTaskItem(new TaskItemExt(pID = 2, pName = "Create HTML Shell", pStart = "2016-03-24 00:00".toLDT, pEnd = "2016-03-24 00:00".toLDT, pClass = gtaskyellow, pRes = "Brian", pComp = 20, pOpen = Opening.open, pDepend = 122))
                g.AddTaskItem(new TaskItemExt(pID = 3, pName = "Code Javascript", pClass = ggroupblack, pRes = "Brian", pGroup = Group.standardGroupTask, pOpen = Opening.open))
                g.AddTaskItem(new TaskItemExt(pID = 31, pName = "Define Variables", pStart = "2016-02-25 00:00".toLDT, pEnd = "2016-03-17 00:00".toLDT, pClass = gtaskpurple, pRes = "Brian", pComp = 30, pParentID = 3, pOpen = Opening.open, pCaption = "Caption 1"))
                g.AddTaskItem(new TaskItemExt(pID = 32, pName = "Calculate Chart Size", pStart = "2016-03-15 00:00".toLDT, pEnd = "2016-03-24 00:00".toLDT, pClass = gtaskgreen, pRes = "Shlomy", pComp = 40, pParentID = 3, pOpen = Opening.open))
                g.AddTaskItem(new TaskItemExt(pID = 33, pName = "Draw Task Items", pClass = ggroupblack, pRes = "Someone", pComp = 40, pGroup = Group.combinedGroup, pParentID = 3, pOpen = Opening.open))
                g.AddTaskItem(new TaskItemExt(pID = 332, pName = "Task Label Table", pStart = "2016-03-06 00:00".toLDT, pEnd = "2016-03-09 00:00".toLDT, pClass = gtaskblue, pRes = "Brian", pComp = 60, pParentID = 33, pOpen = Opening.open))
                g.AddTaskItem(new TaskItemExt(pID = 333, pName = "Task Scrolling Grid", pStart = "2016-03-11 00:00".toLDT, pEnd = "2016-03-20 00:00".toLDT, pClass = gtaskblue, pRes = "Brian", pParentID = 33, pOpen = Opening.open, pDepend = 332))
                g.AddTaskItem(new TaskItemExt(pID = 34, pName = "Draw Task Bars", pClass = ggroupblack, pRes = "Anybody", pComp = 60, pGroup = Group.standardGroupTask, pParentID = 3))
                g.AddTaskItem(new TaskItemExt(pID = 341, pName = "Loop each Task", pStart = "2016-03-26 00:00".toLDT, pEnd = "2016-04-11 00:00".toLDT, pClass = gtaskred, pRes = "Brian", pComp = 60, pParentID = 34, pOpen = Opening.open))
                g.AddTaskItem(new TaskItemExt(pID = 342, pName = "Calculate Start/Stop", pStart = "2016-04-12 00:00".toLDT, pEnd = "2016-05-18 00:00".toLDT, pClass = gtaskpink, pRes = "Brian", pComp = 60, pParentID = 34, pOpen = Opening.open))
                g.AddTaskItem(new TaskItemExt(pID = 343, pName = "Draw Task Div", pStart = "2016-05-13 00:00".toLDT, pEnd = "2016-05-17 00:00".toLDT, pClass = gtaskred, pRes = "Brian", pComp = 60, pParentID = 34, pOpen = Opening.open))
                g.AddTaskItem(new TaskItemExt(pID = 344, pName = "Draw Completion Div", pStart = "2016-05-17 00:00".toLDT, pEnd = "2016-06-04 00:00".toLDT, pClass = gtaskred, pRes = "Brian", pComp = 60, pParentID = 34, pOpen = Opening.open, pDepend = Seq(342, 343)))
                g.AddTaskItem(new TaskItemExt(pID = 35, pName = "Make Updates", pStart = "2016-07-17 00:00".toLDT, pEnd = "2017-09-04 00:00".toLDT, pClass = gtaskpurple, pRes = "Brian", pComp = 30, pParentID = 3, pOpen = Opening.open, pDepend = 333))
                g.Draw()
        }

    }
}
