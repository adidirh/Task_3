package task3exercise1;

public class SmartPhone{
    // 
    // 1. Declare your private attributes here:
    // NIM : 1301154273 
    // NAMA : Ridwan Hadiansyah
    // 
    //------------------- your code here-----------------------
    private Application[10] appList;
    private int totalApp;
    private int memory;
    //---------------------------------------------------------
   
    //
    // 2. Declare your Setter and Getter method here:
    // NIM : ..........................,
    // NAMA : .........................,
    // 
    //------------------- your code here-----------------------
    public void setMemory(int memory) {
        this.memory = memory;
    }
    
     public int getTotalApp() {
        return totalApp;
    
    }

    public void setTotalApp(int totalApp) {
        this.totalApp = totalApp;
    }

    public int getMemory() {
        return memory;
    }


    //---------------------------------------------------------
    // 
    // 3. method addApplication( appStore , appId ) here:
    // NIM : ..........................,
    // NAMA : ........................., 
    //
    // get an Application object from array appList of an appStore
    // with array index = appId, an Application can be installed 
    // if Application size is less than remaining memory size
    // 
    //------------------- your code here-----------------------
    
    public void addApplication(AppStore appStore, int appld ); {
    
}
    
    //---------------------------------------------------------
    // 
    // 4. method method getRemainingSize() : integer here:
    // NIM : ..........................,
    // NAMA : ........................., 
    //
    // returns the remaining memory size of the smart phone
    //
    //------------------- your code here-----------------------
    
    public void getRemainingSize();{
    return g;
}
    //---------------------------------------------------------
    // 
    // 5. Create method toString() : String here:
    // NIM : ..........................,
    // NAMA : .........................,
    //
    // returns String that contains the smart phone total memory size,
    // number of application installed, and remaining memory size
    //
    // example : "memory size 100MB, 5 application installed, 
    //            remaining memory size: 60MB"
    //
    public String toString() {
        //------------------- your code here-----------------------
        return null;
        
        //---------------------------------------------------------
    }
}
