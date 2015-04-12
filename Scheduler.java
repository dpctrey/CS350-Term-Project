import java.util.ArrayList;

public class Scheduler{
    private ArrayList<JobInformation> jobInfo;
    private ArrayList<MemoryInformation> memInfo;
    
    public Scheduler(){
        jobInfo = new ArrayList<JobInformation>();
        memInfo = new ArrayList<MemoryInformation>();
    }
    
    //Adds a new job to the jobInfo ArrayList.
    public void addJob(int jobID,
                       int memReq,
                       int timeReq){
        jobInfo.add(new JobInformation(jobID,
                                       memReq,
                                       timeReq));
    }
    
    //Removes a job from the jobInfo ArrayList.
    public void removeJob(int jobID){
        //Look through the ArrayList, if the jobIDs match, remove from the ArrayList.
        for(int i = 0; i < jobInfo.size(); i++){
            if(jobID == jobInfo.get(i).getJobID()){
                jobInfo.remove(i);
            }
        }
    }
    
    //Adds a new set of memory to the memInfo ArrayList.
    public void addMemory(int memSegNum,
                          int sizeInMB,
                          int wastedSpaceInMB,
                          boolean segInUse){
        memInfo.add(new MemoryInformation(memSegNum,
                                          sizeInMB,
                                          wastedSpaceInMB,
                                          segInUse));
    }
}