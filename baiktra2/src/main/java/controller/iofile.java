/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class iofile {
    public static <T> List<T> doc(String file) {
        List<T> list = new ArrayList<>();
        try {
            ObjectInputStream o = new ObjectInputStream(new FileInputStream(file));
            list = (List<T>) o.readObject();
            o.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(iofile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(iofile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(iofile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public static <T> void viet(String file, List<T> list) {
        try {
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(file));
            o.writeObject(list);
            o.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(iofile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(iofile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
