/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.util.Map;

/**
 *
 * @author QuaVi
 */

public class CounterView {
    public void displayCharacterResults(Map<Character, Integer> charCounter) {
        System.out.println("Ket qua cua đem ky tu:");
        for (Map.Entry<Character, Integer> entry : charCounter.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void displayWordResults(Map<String, Integer> wordCounter) {
        System.out.println("Ket qua cua đem tu:");
        for (Map.Entry<String, Integer> entry : wordCounter.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}



