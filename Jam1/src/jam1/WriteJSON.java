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
import java.io.FileWriter;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
public class WriteJSON {
    
    public static void WriteJSON_bear(String id, String cage, String Medi, String Cons, String All, String train, String Status, String Health,String Hungry ) {
       
        JSONObject animalDetails1 = new JSONObject();
        animalDetails1.put("Id", id);
        animalDetails1.put("Cage no.", cage);
        animalDetails1.put("Medication", Medi);
        animalDetails1.put("Consumable", Cons);
        animalDetails1.put("Allergies", All);
        animalDetails1.put("Trainers", train);
        animalDetails1.put("Status", Status);
        animalDetails1.put("Health", Health);
        animalDetails1.put("Hungry", Hungry);
         
        JSONObject animalObject1 = new JSONObject();
        animalObject1.put("bear", animalDetails1);
        
        JSONArray animalList = new JSONArray();
        animalList.add(animalObject1);
        
        try (FileWriter file1 = new FileWriter("bear.json")) {
 
            file1.write(animalList.toJSONString());
            file1.flush();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void WriteJSON_lion(String id, String cage, String Medi, String Cons, String All, String train, String Status, String Health,String Hungry ) {
       
        JSONObject animalDetails2 = new JSONObject();
        animalDetails2.put("Id", id);
        animalDetails2.put("Cage no.", cage);
        animalDetails2.put("Medication", Medi);
        animalDetails2.put("Consumable", Cons);
        animalDetails2.put("Allergies", All);
        animalDetails2.put("Trainers", train);
        animalDetails2.put("Status", Status);
        animalDetails2.put("Health", Health);
        animalDetails2.put("Hungry", Hungry);
         
        JSONObject animalObject2 = new JSONObject();
        animalObject2.put("lion", animalDetails2);
        
        JSONArray animalList2 = new JSONArray();
        animalList2.add(animalObject2);
        
        try (FileWriter file2 = new FileWriter("lion.json")) {
 
            file2.write(animalList2.toJSONString());
            file2.flush();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void WriteJSON_monkey(String id, String cage, String Medi, String Cons, String All, String train, String Status, String Health,String Hungry ) {
       
        JSONObject animalDetails = new JSONObject();
        animalDetails.put("Id", id);
        animalDetails.put("Cage no.", cage);
        animalDetails.put("Medication", Medi);
        animalDetails.put("Consumable", Cons);
        animalDetails.put("Allergies", All);
        animalDetails.put("Trainers", train);
        animalDetails.put("Status", Status);
        animalDetails.put("Health", Health);
        animalDetails.put("Hungry", Hungry);
         
        JSONObject animalObject = new JSONObject();
        animalObject.put("monkey", animalDetails);
        
        JSONArray animalList = new JSONArray();
        animalList.add(animalObject);
        
        try (FileWriter file = new FileWriter("monkey.json")) {
 
            file.write(animalList.toJSONString());
            file.flush();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void WriteJSON_panda(String id, String cage, String Medi, String Cons, String All, String train, String Status, String Health,String Hungry ) {
       
        JSONObject animalDetails = new JSONObject();
        animalDetails.put("Id", id);
        animalDetails.put("Cage no.", cage);
        animalDetails.put("Medication", Medi);
        animalDetails.put("Consumable", Cons);
        animalDetails.put("Allergies", All);
        animalDetails.put("Trainers", train);
        animalDetails.put("Status", Status);
        animalDetails.put("Health", Health);
        animalDetails.put("Hungry", Hungry);
         
        JSONObject animalObject = new JSONObject();
        animalObject.put("panda", animalDetails);
        
        JSONArray animalList = new JSONArray();
        animalList.add(animalObject);
        
        try (FileWriter file = new FileWriter("panda.json")) {
 
            file.write(animalList.toJSONString());
            file.flush();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}