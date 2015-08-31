/*********************************************************************************************************
 * Class Name     : ProrityQueue
 * @author        : Subhash chander
 * Revision Log   : 30 August,2015
 * Description    : PriorityQueue Operations are performed
 ****************************************************************************************************************/
class PriorityQueue
{
	 
    private TaskAccordingToPriority[] heap;  
    private int heapSize, capacity; 
    public PriorityQueue(int capacity)
    {     
        this.capacity = capacity + 1;
        heap = new TaskAccordingToPriority[this.capacity];
        heapSize = 0;
    }
    /**
     * Name       : ClearQueue
     * Description: clears the Queue
     **/
    public void clearQueue()
    {
        heap = new TaskAccordingToPriority[capacity];
        heapSize = 0;
    }
    /**
     * Name       : checkIsEmpty
     * @return    : True or falls
     * Description: Checks whether list is empty
     **/
    public boolean checkIsEmpty()
    {
        return heapSize == 0;
    }
    /**
     * Name       : checkIsFull
     * @return    :True or falls
     * Description: Checks whether list is full
     **/
    public boolean checkIsFull()
    {
        return heapSize == capacity - 1;
    }
    /**
     * Name       : size
     * @return    :return size of heap
     * Description: size is returned
     **/
    public int size()
    {
        return heapSize;
    }
    /**
     * Name        : insert
     * @param      : priority
     * Description : inserts the value in queue
     **/
    public void insert( int priority)
    {
        TaskAccordingToPriority TaskObject = new TaskAccordingToPriority(priority); 
        heap[++heapSize] = TaskObject;
        //
        int position = heapSize; 
        while (position != 1 && TaskObject.priority > heap[position/2].priority)
        {
            heap[position] = heap[position/2];
            position /=2;
        }
        heap[position] = TaskObject;    
    }
    /**
     * Name       : remove
     * Description: Removes the queue after processing the data 
     **/
    public TaskAccordingToPriority remove()
    {
        int parents, child;
        TaskAccordingToPriority item, temp;
        if (checkIsEmpty() )
        {
            System.out.println("Heap is empty");
            return null;
        } 
        item = heap[1];
        temp = heap[heapSize--];
 
        parents = 1;
        child = 2 ;
        while (child <= heapSize)
        {
            if (child < heapSize && heap[child].priority < heap[child + 1].priority)
                child++;
            if (temp.priority >= heap[child].priority)
                break; 
            heap[parents] = heap[child];
            parents = child;
            child *= 2;
        }
        heap[parents] = temp;
 
        return item;
    }
}
 