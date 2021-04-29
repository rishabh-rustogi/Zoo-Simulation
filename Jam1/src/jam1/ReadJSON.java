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
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
 
public class ReadJSON
{
    static animal an1;
    static animal an2;
    static animal an3;
    static animal an4;
    @SuppressWarnings("unchecked")
    public static animal bear()
    {
        //JSON parser object to parse read file
        JSONParser jsonParser1 = new JSONParser();
         
        try (FileReader reader1 = new FileReader("bear.json"))
        {
            //Read JSON file
            Object obj1 = jsonParser1.parse(reader1);
 
            JSONArray animalList1 = (JSONArray) obj1;
            //System.out.println(animalList);
             
            //Iterate over employee array
            animalList1.forEach( ani -> parsebearObject( (JSONObject) ani ) );
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        return an1;
    }
 
    private static void parsebearObject(JSONObject ani)
    {
        
        JSONObject animalObject = (JSONObject) ani.get("bear");
         
        
        String id = (String) animalObject.get("Id");   
        //System.out.println(id);
         
        
        String cageno = (String) animalObject.get("Cage no.");   
        //System.out.println(cageno);
         
        
        String medication = (String) animalObject.get("Medication");   
        //System.out.println(medication);
         
        
        String allergy = (String) animalObject.get("Consumable");   
        //System.out.println(allergy);
         
        
        String consumable = (String) animalObject.get("Allergies");   
        //System.out.println(consumable);
         
        
        String trainer = (String) animalObject.get("Trainers");   
        //System.out.println(trainer);
         
        
        String status = (String) animalObject.get("Status");   
        //System.out.println(status);
        
        String Health = (String) animalObject.get("Health");   
        //System.out.println(Health);
        
        String Hungry = (String) animalObject.get("Hungry");   
        //System.out.println(Hungry);
        try {
        an1 = new animal();
        an1.set(id, cageno, medication, allergy, consumable, trainer, status, Health, Hungry);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    
    
    
    public static animal lion()
    {
        //JSON parser object to parse read file
        JSONParser jsonParser2 = new JSONParser();
         
        try (FileReader reader2 = new FileReader("lion.json"))
        {
            //Read JSON file
            Object obj2 = jsonParser2.parse(reader2);
 
            JSONArray animalList2 = (JSONArray) obj2;
            //System.out.println(animalList);
             
            //Iterate over employee array
            animalList2.forEach( ani -> parselionObject( (JSONObject) ani ) );
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return an2;
    }
 
    private static void parselionObject(JSONObject ani)
    {
        
        JSONObject animalObject = (JSONObject) ani.get("lion");
         
        
        String id = (String) animalObject.get("Id");   
        //System.out.println(id);
         
        
        String cageno = (String) animalObject.get("Cage no.");   
        //System.out.println(cageno);
         
        
        String medication = (String) animalObject.get("Medication");   
        //System.out.println(medication);
         
        
        String allergy = (String) animalObject.get("Consumable");   
        //System.out.println(allergy);
         
        
        String consumable = (String) animalObject.get("Allergies");   
        //System.out.println(consumable);
         
        
        String trainer = (String) animalObject.get("Trainers");   
        //System.out.println(trainer);
         
        
        String status = (String) animalObject.get("Status");   
        System.out.println(status);
        
        String Health = (String) animalObject.get("Health");   
        //System.out.println(status);
        
        String Hungry = (String) animalObject.get("Hungry");   
        //System.out.println(status);
        try {
        an2 = new animal();
        an2.set(id, cageno, medication, allergy, consumable, trainer, status, Health, Hungry);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    
    
    public static animal monkey()
    {
        //JSON parser object to parse read file
        JSONParser jsonParser3 = new JSONParser();
         
        try (FileReader reader3 = new FileReader("monkey.json"))
        {
            //Read JSON file
            Object obj3 = jsonParser3.parse(reader3);
 
            JSONArray animalList3 = (JSONArray) obj3;
            //System.out.println(animalList);
             
            //Iterate over employee array
            animalList3.forEach( ani -> parsemonkeyObject( (JSONObject) ani ) );
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return an3;
    }
 
    private static void parsemonkeyObject(JSONObject ani)
    {
        
        JSONObject animalObject = (JSONObject) ani.get("monkey");
         
        
        String id = (String) animalObject.get("Id");   
        //System.out.println(id);
         
        
        String cageno = (String) animalObject.get("Cage no.");   
        //System.out.println(cageno);
         
        
        String medication = (String) animalObject.get("Medication");   
        //System.out.println(medication);
         
        
        String allergy = (String) animalObject.get("Consumable");   
        //System.out.println(allergy);
         
        
        String consumable = (String) animalObject.get("Allergies");   
        //System.out.println(consumable);
         
        
        String trainer = (String) animalObject.get("Trainers");   
        //System.out.println(trainer);
         
        
        String status = (String) animalObject.get("Status");   
        //System.out.println(status);
        
        String Health = (String) animalObject.get("Health");   
        //System.out.println(status);
        
        String Hungry = (String) animalObject.get("Hungry");   
        //System.out.println(status);
        try {
        an3 = new animal();
        an3.set(id, cageno, medication, allergy, consumable, trainer, status, Health, Hungry);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    
    
    
    public static animal panda()
    {
        //JSON parser object to parse read file
        JSONParser jsonParser4 = new JSONParser();
         
        try (FileReader reader4 = new FileReader("panda.json"))
        {
            //Read JSON file
            Object obj4 = jsonParser4.parse(reader4);
 
            JSONArray animalList4 = (JSONArray) obj4;
            //System.out.println(animalList);
             
            //Iterate over employee array
            animalList4.forEach( ani -> parsepandaObject( (JSONObject) ani ) );
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return an4;
    }
 
    private static void parsepandaObject(JSONObject ani)
    {
        
        JSONObject animalObject = (JSONObject) ani.get("panda");
         
        
        String id = (String) animalObject.get("Id");   
        //System.out.println(id);
         
        
        String cageno = (String) animalObject.get("Cage no.");   
        //System.out.println(cageno);
         
        
        String medication = (String) animalObject.get("Medication");   
        //System.out.println(medication);
         
        
        String allergy = (String) animalObject.get("Consumable");   
        //System.out.println(allergy);
         
        
        String consumable = (String) animalObject.get("Allergies");   
        //System.out.println(consumable);
         
        
        String trainer = (String) animalObject.get("Trainers");   
        //System.out.println(trainer);
         
        
        String status = (String) animalObject.get("Status");   
        //System.out.println(status);
        
        String Health = (String) animalObject.get("Health");   
        //System.out.println(status);
        
        String Hungry = (String) animalObject.get("Hungry");   
        //System.out.println(status);
        try {
        an4 = new animal();
        an4.set(id, cageno, medication, allergy, consumable, trainer, status, Health, Hungry);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}