/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 *
 * @author QuaVi
 */

public class CounterModel {
    private Map<Character, Integer> charCounter = new HashMap<>();
    private Map<String, Integer> wordCounter = new HashMap<>();

    public void analyzeCharacters(String content) {
        charCounter.clear(); 

        for (char ch : content.toCharArray()) {
            if (Character.isSpaceChar(ch)) continue;
            charCounter.put(ch, charCounter.getOrDefault(ch, 0) + 1);
        }
    }

    public void analyzeWords(String content) {
        wordCounter.clear(); 

        StringTokenizer tokenizer = new StringTokenizer(content);
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            wordCounter.put(token, wordCounter.getOrDefault(token, 0) + 1);
        }
    }

    public Map<Character, Integer> getCharCounter() {
        return charCounter;
    }

    public Map<String, Integer> getWordCounter() {
        return wordCounter;
    }
}



