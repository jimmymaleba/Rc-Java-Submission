/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author  @ST10218051
 */
public class task 
{
  String[] TaskNme;
    int TaskNum;
    String[] TaskDescrptn;
    String[] DeveloperDtls;
    int[] TaskDuratn;
    String[] TaskID;
    String[] TaskStatus;
    
    public task(int numberOftask)
    {
        TaskNme = new String[numberOftask];
        TaskNum = 0;
        TaskDescrptn = new String[numberOftask];
        DeveloperDtls = new String[numberOftask];
        TaskDuratn = new int[numberOftask];
        TaskID = new String[numberOftask];
        TaskStatus = new String[numberOftask];       
    }
    
    public boolean checkTaskDescrptn(String descrptn)
    {
         return (descrptn.length() <= 50);                
    }
    public String creareTaskID(int taskNumber)
    {
        TaskID[taskNumber] = TaskNme[taskNumber].substring(0, 2).toUpperCase() + ":" + taskNumber + ":" + DeveloperDtls[taskNumber].substring(DeveloperDtls[taskNumber].length() - 3).toUpperCase(); 
        return TaskID[taskNumber];
    }
    public void printTaskDeatils(int TotalTasks)
    {
        System.out.print("\n\nTasks saved so far....\n");
        System.out.print("\n\ttaskID\ttaskName\tDuration\tStatus\tDescription\tDeveloper\n");
        for(int a = 0; a < TotalTasks; a++)
        {
            System.out.print("\n" + (a+1) + ".\t" + TaskID[a] + "\t" + TaskNme[a] + "\t" + TaskDuratn[a] + "\t" + TaskStatus[a] + "\t" + TaskDescrptn[a] + "\t" + DeveloperDtls[a]);            
        }
        System.out.print("\n\nTotal tasks duration : " + returnTotalhours(TotalTasks) + "\n\n");
    }
    
    public int returnTotalhours(int TotalTasks)
    {
        int totalHours = 0;
        for(int a = 0; a < TotalTasks;a++)
            totalHours = totalHours + TaskDuratn[a];        
        return totalHours;
    }
       
}
