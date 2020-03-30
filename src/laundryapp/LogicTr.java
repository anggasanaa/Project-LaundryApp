/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundryapp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



/**
 *
 * @author ACER
 */
public class LogicTr extends ModelTr {
    public int returnService (ModelTr modeltr){
        switch (modeltr.getService()){
            case "Reguler":
                return 6000;
            case "Dry Cleaning":
                return 5000;
            case "Wet Cleaning":
                return 4000;
            case "Express Cleaning":
                return 7000;
            default:
                return 0;
        }
    }
    public int returnWeight (ModelTr modelTrans){
        return 0;
        
    }

}
