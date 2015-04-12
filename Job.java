public class Job {
    int id;
    int memRequest;
    int timeRequest;
    int memAssigned;
    int timeRemain;
    String status;
    
    
    public Job(){
        id = -1;
        memRequest = -1;
        timeRequest = -1;
        memAssigned = -1;
        timeRemain = timeRequest;
        status = "Waiting";
    }
    
    public Job(int id, int memRequest, int timeRequest, int memAssigned, int timeRemain, String status){
        this.id = id;
        this.memRequest = memRequest;
        this.timeRequest = timeRequest;
        this.memAssigned = memAssigned;
        this.timeRemain = timeRemain;
        this.status = status;        
    }
    
    public Job(Job job){
        this.id = id;
        this.memRequest = job.getMemRequest();
        this.timeRequest = job.getTimeRequest();
        this.memAssigned = job.getMemAssigned();
        this.timeRemain = job.getTimeRemain();
        this.status = job.getStatus();        
    }
}