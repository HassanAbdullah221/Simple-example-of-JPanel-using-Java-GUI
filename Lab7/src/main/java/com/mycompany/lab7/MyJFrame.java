/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

import java.awt.GridLayout;
import java.awt.Panel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author hassan
 */

public class MyJFrame extends JFrame {
    JTabbedPane Pane = new JTabbedPane();
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JPanel p4 = new JPanel();
    JPanel p5 = new JPanel();
    JPanel First = new JPanel();
    JPanel Second = new JPanel();
    JPanel Third = new JPanel();
    JButton btn1 = new JButton("Food");
    JButton btn2 = new JButton("Drink");
    JButton btn3 = new JButton("Sweet");
    JButton btn4 = new JButton("other");
    JLabel label = new JLabel("Select one or more:");
    JLabel label2 = new JLabel("Select one or more:");
    JLabel label3 = new JLabel("Select one or more:");
    JLabel FirstL = new JLabel("For Kids:");
    JLabel SecondL = new JLabel("Chef's Selection:");
    JLabel ThirdL = new JLabel("Gluten Sesitive:");
    JCheckBox Foodcb = new JCheckBox("1.Conch fritters");
    JCheckBox Foodcb2 = new JCheckBox("2.Breeze cheese bites");
    JCheckBox Foodcb3 = new JCheckBox("3.Chicken tortilla soup ");
    JCheckBox Foodcb4 = new JCheckBox("4.Cuban black bean soup");
    JCheckBox Foodcb5 = new JCheckBox("5.House salad");
    JCheckBox Foodcb6 = new JCheckBox("6.Caesar salad ");
    JCheckBox Foodcb7 = new JCheckBox("7.Grilled top sirloin steak ");
    JCheckBox Foodcb8 = new JCheckBox("8.Skirt steak churrasco ");
    JCheckBox Foodcb9 = new JCheckBox("9.Tilapia & shrimp Oscar ");
    JCheckBox Foodcb10 = new JCheckBox("10.Coconut shrimp ");
    ///////////////////////////////////////////////////////
    JCheckBox Drinkcb = new JCheckBox("1.Ultimate pineapple ");
    JCheckBox Drinkcb2 = new JCheckBox("2.Strawberry daiquiri");
    JCheckBox Drinkcb3 = new JCheckBox("3.Pineapple-coconut martini");
    JCheckBox Drinkcb4 = new JCheckBox("4.Long island iced tea");
    JCheckBox Drinkcb5 = new JCheckBox("5.Classic margarita");
    JCheckBox Drinkcb6 = new JCheckBox("6.Tamarind margarita");
    JCheckBox Drinkcb7 = new JCheckBox("7.Strawberry margarita");
    JCheckBox Drinkcb8 = new JCheckBox("8.Mighty blood orange Rita ");
    JCheckBox Drinkcb9 = new JCheckBox("9.Coconut mojito");
    JCheckBox Drinkcb10 = new JCheckBox("10.Raspberry mojito");
    ///////////////////////////////////////////////////////
    JCheckBox Sweetcb = new JCheckBox("1.Coconut Grande");
    JCheckBox Sweetcb2 = new JCheckBox("2.Rebecca’s key lime pie");
    JCheckBox Sweetcb3 = new JCheckBox("3.Chocolate island");
    JCheckBox Sweetcb4 = new JCheckBox("4.Rum cake");
    JCheckBox Sweetcb5 = new JCheckBox("5.Banana nut bread supreme");
    JCheckBox Sweetcb6 = new JCheckBox("6.Warm chocolate pineapple upside-down cake");
    JCheckBox Sweetcb7 = new JCheckBox("7.Mango sorbet with tropical fruit");
    JCheckBox Sweetcb8 = new JCheckBox("8.Vanilla ice cream with chocolate sauce");
    ///////////////////////////////////////////////////////
    JCheckBox Firstcb = new JCheckBox("1.Bowtie pasta with tomato sauce");
    JCheckBox Firstcb2 = new JCheckBox("2.Grilled chicken breast");
    JCheckBox Firstcb3 = new JCheckBox("3.Hamburger sliders");
    ///////////////////////////////////////////////////////
    JCheckBox Secondcb = new JCheckBox("1.Calamari");
    JCheckBox Secondcb2 = new JCheckBox("2.Rum & coke chicken and ribs");
    JCheckBox Secondcb3 = new JCheckBox("3.Pirate paradise");
    ///////////////////////////////////////////////////////
    JCheckBox Thirdcb = new JCheckBox("1.Chicken & vegetable soup");
    JCheckBox Thirdcb2 = new JCheckBox("2.Lump crab stack");
    JCheckBox Thirdcb3 = new JCheckBox("3.Grilled chicken & tropical fruit on mixed greens");

    public MyJFrame() {
        super("MyRestaurant");
        p1.setLayout(new GridLayout(2, 2, 5, 5));
        p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
        p3.setLayout(new BoxLayout(p3, BoxLayout.Y_AXIS));
        p4.setLayout(new BoxLayout(p4, BoxLayout.Y_AXIS));
        p5.setLayout(new GridLayout(1, 3, 5, 5));

        First.setLayout(new BoxLayout(First, BoxLayout.Y_AXIS));
        Second.setLayout(new BoxLayout(Second, BoxLayout.Y_AXIS));
        Third.setLayout(new BoxLayout(Third, BoxLayout.Y_AXIS));

        p1.add(btn1);
        p1.add(btn2);
        p1.add(btn3);
        p1.add(btn4);

        Pane.add("Categories", p1);
        Pane.add("Food", p2);
        Pane.add("Drink", p3);
        Pane.add("Sweet", p4);
        Pane.add("Others", p5);

        p5.add(First);
        p5.add(Second);
        p5.add(Third);

        add(Pane);
        p2.add(label);
        p2.add(Foodcb);
        p2.add(Foodcb2);
        p2.add(Foodcb3);
        p2.add(Foodcb4);
        p2.add(Foodcb5);
        p2.add(Foodcb6);
        p2.add(Foodcb7);
        p2.add(Foodcb8);
        p2.add(Foodcb9);
        p2.add(Foodcb10);

        
        
        p3.add(label2);
        p3.add(Drinkcb);
        p3.add(Drinkcb2);
        p3.add(Drinkcb3);
        p3.add(Drinkcb4);
        p3.add(Drinkcb5);
        p3.add(Drinkcb6);
        p3.add(Drinkcb7);
        p3.add(Drinkcb8);
        p3.add(Drinkcb9);
        p3.add(Drinkcb10);

        p4.add(label3);
        p4.add(Sweetcb);
        p4.add(Sweetcb2);
        p4.add(Sweetcb3);
        p4.add(Sweetcb4);
        p4.add(Sweetcb5);
        p4.add(Sweetcb6);
        p4.add(Sweetcb7);
        p4.add(Sweetcb8);

        First.add(FirstL);
        First.add(Firstcb);
        First.add(Firstcb2);
        First.add(Firstcb3);

        Second.add(SecondL);
        Second.add(Secondcb);
        Second.add(Secondcb2);
        Second.add(Secondcb3);

        Third.add(ThirdL);
        Third.add(Thirdcb);
        Third.add(Thirdcb2);
        Third.add(Thirdcb3);

    }
}
