public class MemoryInformation{
    private int memSegmentNum;      //Holds the segment number of memory.
    private int sizeInMB;           //Hold the size of memory in megabytes.
    private boolean segmentInUse;   //Flag to see if the segment in memory is being used.
    private int wastedSpaceInMB;    //Holds the amount of wasted space inside of the memory in megabytes.
    
    //Constructor which sets everything to 0 or false.
    public MemoryInformation(){
        memSegmentNum = 0;
        sizeInMB = 0;
        segmentInUse = false;
        wastedSpaceInMB = 0;
    }
    
    //Constructor which will set everything to what was given.
    public MemoryInformation(int memSegmentNum,
                             int sizeInMB,
                             int wastedSpaceInMB,
                             boolean segmentInUse){
        memSegmentNum = this.memSegmentNum;
        sizeInMB = this.sizeInMB;
        segmentInUse = this.segmentInUse;
        wastedSpaceInMB = this.wastedSpaceInMB;
    }
    //Allows other classes to manipulate the memSegmentNum variable.
    public void setMemSegmentNum(int memSegmentNum){
        memSegmentNum = this.memSegmentNum;
    }
    public int getMemSegmentNum(){
        return memSegmentNum;
    }
    //Allows other classes to manipulate the sizeInMB variable.
    public void setSizeInMB(int sizeInMB){
        sizeInMB = this.sizeInMB;
    }
    public int getSizeInMB(){
        return sizeInMB;
    }
    //Allows other classes to manipulate the segmentInUse variable.
    public void setSegmentInUseFlag(boolean segmentInUse){
        segmentInUse = this.segmentInUse;
    }
    public boolean getSegmentInUseFlag(){
        return segmentInUse;
    }
    //Allows other classes to manipulate the wastedSpaceInMB variable.
    public void setWastedSpaceInMB(int wastedSpaceInMB){
        wastedSpaceInMB = this.wastedSpaceInMB;
    }
    public int getWastedSpaceInMB(){
        return wastedSpaceInMB;
    }
}