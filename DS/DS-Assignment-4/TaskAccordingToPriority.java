/*****************************************************************************************************
 * Name: Task
 * @author Subhash chander
 * Description: Adds the priority
 ***********************************************************************************************************/
class TaskAccordingToPriority
{ 
	int priority;
    // Constructor 
    public TaskAccordingToPriority( int priority)
    {
        this.priority = priority; 
    }
    public String toString() {
		return "Task [priority=" + priority + "]";
	}
  
}