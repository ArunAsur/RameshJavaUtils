package com.lalithsoftware.opensource;

public class RameshJavaUtils   {
    public static boolean checkObject(Object toCheck, String desc, boolean writeFlag)
    {
         if(desc == null || desc.length() == 0)
         {
              System.out.println("Error: Description string not provided.");
              return false;
         }
         if(toCheck == null)
         {
              System.out.println("Error: " + desc + " is null.");
              return false;
         }
         else
         {
             return true;
         }
    }
}
