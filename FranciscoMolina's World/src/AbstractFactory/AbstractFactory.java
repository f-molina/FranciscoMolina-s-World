/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;
import Nintendo.Nintendo;
import Playstation.Playstation;
import Xbox.Xbox;


/**
 *
 * @author fmolina
 */
public interface AbstractFactory {
    
    Nintendo getNintendo(String type);
    Playstation getPlayStation(String type);
    Xbox getXbox(String type);
    
}
