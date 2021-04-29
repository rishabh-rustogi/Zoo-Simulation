/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jam1;

import java.awt.Color;

/**
 *
 * @author rishabhrustogi
 */
public class Jam1 {
    /**
     */
    public static int bfeed;
    public static int lfeed;
    public static int mfeed;
    public static int pfeed;
    public static String bstatus;
    public static String lstatus;
    public static String mstatus;
    public static String pstatus;
    public static int btime;
    public static int ltime;
    public static int mtime;
    public static int ptime;
    public static void change()
    {
        animal an1 = new animal();
        an1=ReadJSON.bear();
        String bear = an1.getStatus();
        animal an2 = new animal();
        an2=ReadJSON.lion();
        String lion = an2.getStatus();
        animal an3 = new animal();
        an3=ReadJSON.monkey();
        String monkey = an3.getStatus();
        animal an4 = new animal();
        an4=ReadJSON.panda();
        String panda = an4.getStatus();
        window.bear.setText(bear);
        System.out.println("---------->"+an2.getStatus()+"<---------");
        window.lion.setText(lion);
        window.monkey.setText(monkey);
        window.panda.setText(panda);
        
    }
    public static void main(String[] args) throws InterruptedException{
        window ww = new window();
        ww.setVisible(true);
        
        /*
        WriteJSON.WriteJSON_bear("1","1","none","fish","none","Rishabh","Rest","fine","no");

        WriteJSON.WriteJSON_lion("1","1","none","fish","none","Rishabh","killing","fine","no");

        WriteJSON.WriteJSON_monkey("1","1","none","fish","none","Rishabh","Sleeping","fine","no");

        WriteJSON.WriteJSON_panda("1","1","none","fish","none","Rishabh","jumping","fine","no");
        */
        long time=0;
        String bhungry="no";
        String lhungry="no";
        String mhungry="no";
        String phungry="no";
        animal an1 = new animal();
        an1=ReadJSON.bear();
        String bhealth=an1.getHealth();
        bstatus =an1.getStatus();
        if(an1.getHealth().equalsIgnoreCase("U"))
        {
            bfeed=-121;
        }
        else
        {
            bfeed=120;
        }
        an1=ReadJSON.lion();
        String lhealth=an1.getHealth();
        lstatus =an1.getStatus();
        if(an1.getHealth().equalsIgnoreCase("U"))
        {
            lfeed=-92;
        }
        else
        {
            lfeed=90;
        }
        an1=ReadJSON.monkey();
        String mhealth=an1.getHealth();
        mstatus =an1.getStatus();
        if(an1.getHealth().equalsIgnoreCase("U"))
        {
            mfeed=-61;
        }
        else
        {
            mfeed=60;
        }
        an1=ReadJSON.panda();
        String phealth=an1.getHealth();
        pstatus =an1.getStatus();
        if(an1.getHealth().equalsIgnoreCase("U"))
        {
            pfeed=-31;
        }
        else
        {
            pfeed=30;
        }
        btime = 40;
        ltime = 30;
        mtime = 20;
        ptime = 10;
        while(true)
        {
            Thread.sleep(500);
            System.out.println(time);
            time++;
            if(bfeed<=-120)
            {
                bhealth="U";
                window.bstatus.setBackground(Color.RED);
            }
            else
            {
                bhealth="H";
                window.bstatus.setBackground(Color.GREEN);
            }
            if(bfeed<=0)
            {
                bhungry="yes";
                //bfeed=120;
            }
            else
            {
                bhungry="no";
            }
            if(lfeed<=-120)
            {
                lhealth="U";
                window.lstatus.setBackground(Color.RED);
            }
            else
            {
                lhealth="H";
                window.lstatus.setBackground(Color.GREEN);
            }
            if(lfeed<=0)
            {
                lhungry="yes";
                //lfeed=90;
            }
            else
            {
                lhungry="no";
            }
            if(mfeed<=-120)
            {
                mhealth="U";
                window.mstatus.setBackground(Color.RED);
            }
            else
            {
                mhealth="H";
                window.mstatus.setBackground(Color.GREEN);
            }
            if(mfeed<=0)
            {
                mhungry="yes";
                //mfeed=60;
            }
            else
            {
                mhungry="no";
            }
            if(pfeed<=-120)
            {
                phealth="U";
                window.pstatus.setBackground(Color.RED);
            }
            else
            {
                phealth="H";
                window.pstatus.setBackground(Color.GREEN);
            }
            if(pfeed<=0)
            {
                phungry="yes";
                //pfeed=30;
            }
            else
            {
                phungry="no";
            }
            if(btime<=0 && bstatus.equalsIgnoreCase("eating"))
            {
                bstatus="Sleeping";
                btime=40;
            }
            if(btime<=0 && bstatus.equalsIgnoreCase("Sleeping"))
            {
                bstatus="roaming";
                btime=40;
            }
            if(btime<=0 && bstatus.equalsIgnoreCase("roaming"))
            {
                bstatus="rest";
                btime=40;
            }
            if(btime<=0 && bstatus.equalsIgnoreCase("rest"))
            {
                bstatus="sleeping";
                btime=40;
            }
            if(ltime<=0 && lstatus.equalsIgnoreCase("eating"))
            {
                lstatus="Sleeping";
                ltime=40;
            }
            if(ltime<=0 && lstatus.equalsIgnoreCase("Sleeping"))
            {
                lstatus="roaming";
                ltime=30;
            }
            if(ltime<=0 && lstatus.equalsIgnoreCase("roaming"))
            {
                lstatus="rest";
                ltime=30;
            }
            if(ltime<=0 && lstatus.equalsIgnoreCase("rest"))
            {
                lstatus="sleeping";
                ltime=30;
            }
            if(mtime<=0 && mstatus.equalsIgnoreCase("eating"))
            {
                mstatus="Sleeping";
                mtime=40;
            }
            if(mtime<=0 && mstatus.equalsIgnoreCase("Sleeping"))
            {
                mstatus="roaming";
                mtime=20;
            }
            if(mtime<=0 && mstatus.equalsIgnoreCase("roaming"))
            {
                mstatus="rest";
                mtime=20;
            }
            if(mtime<=0 && mstatus.equalsIgnoreCase("rest"))
            {
                mstatus="sleeping";
                mtime=40;
            }
            if(ptime<=0 && pstatus.equalsIgnoreCase("eating"))
            {
                pstatus="Sleeping";
                ptime=40;
            }
            if(ptime<=0 && pstatus.equalsIgnoreCase("Sleeping"))
            {
                pstatus="roaming";
                ptime=10;
            }
            if(ptime<=0 && pstatus.equalsIgnoreCase("roaming"))
            {
                pstatus="rest";
                ptime=10;
            }
            if(ptime<=0 && pstatus.equalsIgnoreCase("rest"))
            {
                pstatus="sleeping";
                ptime=10;
            }
            bfeed--;
            lfeed--;
            mfeed--;
            pfeed--;
            btime--;
            ltime--;
            mtime--;
            ptime--;
            window.bstatus.setText(bhealth);
            window.lstatus.setText(lhealth);
            window.mstatus.setText(mhealth);
            window.pstatus.setText(phealth);
            window.notice.setText("Bear is hungry : "+bhungry+"\nLion is hungry : "+lhungry+"\nMonkey is hungry : "+mhungry+"\nPanda is hungry : "+phungry);
            WriteJSON.WriteJSON_bear("1","1","none","fish","none","Rishabh",bstatus,bhealth,bhungry);

            WriteJSON.WriteJSON_lion("1","1","none","fish","none","Rishabh",lstatus,lhealth,lhungry);

            WriteJSON.WriteJSON_monkey("1","1","none","fish","none","Rishabh",mstatus,mhealth,mhungry);

            WriteJSON.WriteJSON_panda("1","1","none","fish","none","Rishabh",pstatus,phealth,phungry);
            change();
        }
    }
}
