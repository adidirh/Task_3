package task3exercise1;

public class AppStore {
    
    // 1. Declare your private attributes here:
    // NIM : .........................., 
    // NAMA : ........................., 
    //
    //------------------- your code here-----------------------
    private Application[] appList;
    private int totalApp;
   

    //---------------------------------------------------------
    // 2. Declare your Setter and Getter method here:
    // NIM : ..........................,
    // NAMA : ........................., 
    //
    //------------------- your code here-----------------------

     public Application[] getList() {
        return list;
    
    }    

    public void setList(Application[] list) {
        this.list = list;
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
    // 3. Create method createNewApp( appName, appSize ) here:
    // NIM : ..........................,
    // NAMA : ........................., 
    // instantiate new Application object and insert it in array appList
    //
    //------------------- your code here-----------------------
    Application createNewApp(String appName, int appSize){
        AppStore AppS[] = new AppStore[10];
        
        
    }
    //---------------------------------------------------------
    // 4. Create method getApp( id ) : Application here:
    // NIM : ..........................,
    // NAMA : ........................., 
    // returns Application object from array appList with array index = id
    //
    //------------------- your code here-----------------------
    
    //---------------------------------------------------------
    // 5. Create method toString() : String here:
    // NIM : ..........................,
    // NAMA : ........................., 
    // @return returns String that contains the number of Application available
    // 
    // example : "There are 5 applications ready to install"
    // 
    public String toString() {
        //------------------- your code here-----------------------
        return null;
        
        //---------------------------------------------------------
    }
}
