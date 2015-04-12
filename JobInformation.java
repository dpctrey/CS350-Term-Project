public class JobInformation{
    private int jobID;                  //Holds the ID number of the job.
    private int memRequestInMB;         //Holds the memory request in megabytes.
    private int jobSegmentNum;          //Holds the segment number of the job.
    private int timeRequest;            //Holds the execution time request of the job.
    private int timeRemaining;           //Holds the amount of execution time remaining on the job.
    private JobStatus jobStatus;        //Holds the state of the job.
    private boolean changed;            //Checks to see if job has changed.
    
   // Constructor which sets everything to -1 and the status to new and changed to false.
    public JobInformation(){
        jobID = -1;
        memRequestInMB = -1;
        jobSegmentNum = -1;
        timeRequest = -1;
        timeRemaining = -1;
        jobStatus = JobStatus.NEW;
        changed = false;
    }
    
   //Constructor which sets the variables as specified.
    public JobInformation(int jobID,
                          int memRequestInMB,
                          int timeRequest){
        jobID = this.jobID;
        memRequestInMB = this.memRequestInMB;
        timeRequest = this.timeRequest;
        timeRemaining = timeRequest;
        jobSegmentNum = -1;
        jobStatus = JobStatus.NEW;
        changed = false;
    }
    
    //Allows other classes to manipulate the jobID variable.
    public void setJobID(int jobID){
        jobID = this.jobID;
    }
    public int getJobID(){
        return jobID;
    }
    
    //Allows other classes to manipulate the memRequestInMB variable.
    public void setMemRequestInMB(int memRequestInMB){
        memRequestInMB = this.memRequestInMB;
    }
    public int getMemRequestInMB(){
        return memRequestInMB;
    }
    
    //Allows other classes to manipulate the jobSegmentNum variable.
    public void setJobSegmentNum(int jobSegmentNum){
        jobSegmentNum = this.jobSegmentNum;
    }
    public int getJobSegmentNum(){
        return jobSegmentNum;
    }
    
    //Allows other classes to manipulate the timeRequest variable.
    public void setTimeRequest(int timeRequest){
        timeRequest = this.timeRequest;
    }
    public int getTimeRequest(){
        return timeRequest;
    }
    
    //Allows other classes to manipulate the timeRemaining variable.
    public void setTimeRemaining(int timeRemaining){
        timeRemaining = this.timeRemaining;
    }
    public int getTimeRemaining(){
        return timeRemaining;
    }
    
    //Allows other classes to manipulate the jobStatus variable.
    public void setJobStatus(JobStatus jobStatus){
        jobStatus = this.jobStatus;
    }
    public JobStatus getJobStatus(){
        return jobStatus;
    }
    
    //Allows other classes to manipulate the changed variable.
    public void setChanged(boolean changed){
        changed = this.changed;
    }
    
    public boolean getChanged(){
        return changed;
    }
}