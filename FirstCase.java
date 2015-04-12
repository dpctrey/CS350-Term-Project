public class firstCase {
    Boolean complete = false;
    int counter = 0;
    Queue myJobs;
    MainMemory main;
    Boolean verbose = false;
    int numFinished = 0;
    
    
    public firstCase(Queue jobs, MainMemory main){
        this.jobs = jobs;
        this.main = main;
    }
    
    
    public void run(){
        while(!complete){
            Boolean isAssigned = false;
            int count = 0;
            while(!isAssigned){
                if (!main.memoryAvailable()){
                    isAssigned = true;
                }
                if (!jobs.getAnyUnassignedJobs()){
                    isAssigned = true;
                }
                if (count >= jobs.getLength()){
                    isAssigned = true;
                }
                
                Boolean done = false;
                while (!testDone){
                    if (count < jobs.getLength()){
                        if (jobs.getStatus(count) == "Waiting"){
                            done = true;
                        }
                    }
                    else {
                        isAssigned = true;
                        done = true;
                    }
                    if (done == false){
                        count++;
                    }
                }
                
                if (!assigned) {
                    if (count < jobs.getLength()) {
                        Boolean success = false;
                        for (int i = main.firstAvailableMemoryPos(); i < main.size && success == false; i++){
                            if (!main.getInUse(i)){
                                if (jobs.getMemRequest(count) < main.getSize(i)){
                                    main.assignMemory(i, jobs.getJob(count));
                                    success = true;
                                }
                            }
                        }
                    }
                }
                
                count ++;
            }
            
            if (verbose){
                System.out.println(main.toString());
            }
            
            tick();
            
            if (!jobs.getAnyUnfinishedJobs()){
                complete = true;
            }
            
            if (tick >= 30){
                complete = true;
            }
        }
        
        numFinished = jobs.numberOfFinishedJobs();
        System.out.println("Total number of finished jobs: " + numFinished);
    }
    
    public void tick() {
        tick++;
        main.tick();
        System.out.println("======================================================");
        System.out.println("Tick: " + tick);
        System.out.println("Waiting: " +jobs.numberOfWaitingJobs() + "\t\t");
        System.out.println("Total Memory Wasted: " + main.totalWastedMemory());
        System.out.println("======================================================");
        System.out.println("\n\n\n");
        }
        
        public void setVerbose(Boolean verbose){
            this.verbose = verbose;
        }
        
        public int numberOfFinishedJobs(){
            if (tick < 30){
                return -1;
            }
            return numFinished;
        }
}