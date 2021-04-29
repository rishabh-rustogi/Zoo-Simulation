/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jam1;

/**
 *
 * @author rishabhrustogi
 */
public class animal {
    private String id="";
    private String cage="";
    private String Medi="";
    private String Cons="";
    private String All="";
    private String train="";
    private String Status="";
    private String Health="";
    private String Hungry="";
    public void set(String id, String cage, String Medi, String Cons, String All, String train, String Status, String Health,String Hungry)
    {
        this.id=id;
        this.cage=cage;
        this.Medi=Medi;
        this.Cons=Cons;
        this.All=All;
        this.train=train;
        this.Status=Status;
        this.Health=Health;
        this.Hungry=Hungry;
    }
    public String getid()
    {
        return id;
    }
    public String getcage()
    {
        return cage;
    }
    public String getMedi()
    {
        return Medi;
    }
    public String getCons()
    {
        return Cons;
    }
    public String getAll()
    {
        return All;
    }
    public String gettrain()
    {
        return train;
    }
    public String getStatus()
    {
        return Status;
    }
    public String getHealth()
    {
        return Health;
    }
    public String getHungry()
    {
        return Hungry;
    }
    
}
