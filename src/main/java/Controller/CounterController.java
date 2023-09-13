/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.CounterModel;
import View.CounterView;
import java.util.Scanner;

/**
 *
 * @author QuaVi
 */

public class CounterController {
    public static void run(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CounterModel model = new CounterModel();
        CounterView view = new CounterView();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Dem ky tu");
            System.out.println("2. Dem tu");
            System.out.println("3. Thoat");

            System.out.print("Nhap lua chon: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.println("Nhap noi dung:");
                    String content = scanner.nextLine();
                    model.analyzeCharacters(content);
                    view.displayCharacterResults(model.getCharCounter());
                }
                case 2 -> {
                    System.out.println("Nhap noi dung:");
                    String content2 = scanner.nextLine();
                    model.analyzeWords(content2);
                    view.displayWordResults(model.getWordCounter());
                }
                case 3 -> {
                    System.out.println("Ket thuc chuong trinh.");
                    return;
                }
                default -> System.out.println("Lua chon khong hop le.");
            }
        }
    }
}


