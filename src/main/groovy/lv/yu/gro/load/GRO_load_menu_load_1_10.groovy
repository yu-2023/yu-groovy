
/**
 *
 * Groovy package     lv.yu.gro.load
 *
 * Groovy program     GRO_load_menu_load_1_10.groovy     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023                    mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.gro.load

import javax.swing.JMenu
import javax.swing.JMenuItem

import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.event.KeyEvent

/**
 * GRO_load_menu_load_1_10
 */
public class GRO_load_menu_load_1_10_class {

/**
 * GRO_load_menu_load_1_10()
 */
    public GRO_load_menu_load_1_10_class() {

        var menu_Load_1 = new JMenu("Load1")
            menu_Load_1.setMnemonic(KeyEvent.VK_1)  //  Alt 1
            menu_Load_1.setToolTipText("Load1 commands")

        var menuitem_Lo11 = new JMenuItem("Lo11")
            menuitem_Lo11.setToolTipText("Lo11 application")
            menuitem_Lo11.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) { println("Selected menu: " + e.getActionCommand()) } } )
            menu_Load_1.add(menuitem_Lo11)

        var menuitem_Lo12 = new JMenuItem("Lo12")
            menuitem_Lo12.setToolTipText("Lo12 application")
            menuitem_Lo12.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) { println("Selected menu: " + e.getActionCommand()) } } )
            menu_Load_1.add(menuitem_Lo12)

            lv.yu.gro.GRO_10_tabs_class.menubar.add(menu_Load_1)

    }  //  end GRO_load_menu_load_1_10_class()

}  //  end GRO_load_menu_load_1_10_class
