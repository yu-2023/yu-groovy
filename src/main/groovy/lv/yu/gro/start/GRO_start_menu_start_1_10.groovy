
/**
 *
 * Groovy package     lv.yu.gro.start
 *
 * Groovy program     GRO_start_menu_start_1_10.groovy     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023                      mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.gro.start

import javax.swing.JMenu
import javax.swing.JMenuItem

import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.event.KeyEvent

/**
 * GRO_start_menu_start_1_10
 */
public class GRO_start_menu_start_1_10_class {

/**
 * GRO_start_menu_start_1_10()
 */
    public GRO_start_menu_start_1_10_class() {

        var menu_Start_1 = new JMenu("Start1")
            menu_Start_1.setMnemonic(KeyEvent.VK_1)  //  Alt 1
            menu_Start_1.setToolTipText("Start1 commands")

        var menuitem_St11 = new JMenuItem("St11")
            menuitem_St11.setToolTipText("St11 application")
            menuitem_St11.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) { println("Selected menu: " + e.getActionCommand()) } } )
            menu_Start_1.add(menuitem_St11)

        var menuitem_St12 = new JMenuItem("St12")
            menuitem_St12.setToolTipText("St12 application")
            menuitem_St12.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) { println("Selected menu: " + e.getActionCommand()) } } )
            menu_Start_1.add(menuitem_St12)

            lv.yu.gro.GRO_10_tabs_class.menubar.add(menu_Start_1)

    }  //  end GRO_start_menu_start_1_10_class()

}  //  end GRO_start_menu_start_1_10_class
