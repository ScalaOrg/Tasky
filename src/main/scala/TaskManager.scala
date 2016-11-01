import java.time.LocalDate

// create a scala object TaskManager which defines a single method allTasksDueToday
object TaskManager {

    def allTasksDueToday(tasks: List[Task]): List[Task] = tasks.filter(t => t.dueOn.isEqual(LocalDate.now))
}
