/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wikits3;

/**
 *
 * 1301154255
 */
public class Wikits3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           
        StartUp myStartUp = new StartUp();        
        Member m;
        Project p;
       
        m = new Member("Alex");
        myStartUp.addMember( m );
        m = new Member("Beni");
        myStartUp.addMember( m );
        
        
        myStartUp.createNewProject( "project1" );
        myStartUp.createNewProject( "project2" );
        
          
        p = myStartUp.getProject( 0 );
        m = myStartUp.getMember( 0 );
        p.addMember(m); 
        m = myStartUp.getMember( 1 );
        p.addMember(m);
        
        
        p = myStartUp.getProject( 1 );
        m = myStartUp.getMember( 1 );
        p.addMember(m); 
        m = myStartUp.getMember( 2 );
        p.addMember(m);
   
        
        p = myStartUp.getProject( 1 );
        myStartUp.releaseProject( p );
        
  
        System.out.println( myStartUp.getMember( 0 ) );
        System.out.println( myStartUp.getMember( 1 ) );
       
        
        System.out.println( myStartUp.getProject( 0 ) );
        System.out.println( myStartUp.getProject( 1 ) );
     
        
   
    }
    
}
