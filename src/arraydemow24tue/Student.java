/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraydemow24tue;

/**
 *This has been modified by Diya on 23 Jan at12:48PM
 * @author Ronak
 Hello there 
 this comment is for fetch
 */
public class Student {
    private int sid;
    private String sname;
    private String Address;
    
    private String getAddress(){
        return Address;
    }

    public Student(int sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }

    
    
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
    
    
    
}
