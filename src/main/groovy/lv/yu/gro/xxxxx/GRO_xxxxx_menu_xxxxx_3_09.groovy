
/**
 *
 * Groovy package     lv.yu.gro.xxxxx
 *
 * Groovy program     GRO_xxxxx_menu_xxxxx_3_09.groovy     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023                      mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.gro.xxxxx

import javax.swing.JMenu
import javax.swing.JMenuItem

import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.event.KeyEvent

/**
 * GRO_xxxxx_menu_xxxxx_3_09
 */
public class GRO_xxxxx_menu_xxxxx_3_09_class {

/**
 * GRO_xxxxx_menu_xxxxx_3_09()
 */
    public GRO_xxxxx_menu_xxxxx_3_09_class() {

        var menu_Xxxxx_3 = new JMenu("Xxxxx3")
            menu_Xxxxx_3.setMnemonic(KeyEvent.VK_3)  //  Alt 3
            menu_Xxxxx_3.setToolTipText("Xxxxx3 commands")

        var menuitem_Xx31 = new JMenuItem("Xx31")
            menuitem_Xx31.setToolTipText("Xx31 application")
            menuitem_Xx31.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) { println("Selected menu: " + e.getActionCommand()) } } )
            menu_Xxxxx_3.add(menuitem_Xx31)

        var menuitem_Xx32 = new JMenuItem("Xx32")
            menuitem_Xx32.setToolTipText("Xx32 application")
            menuitem_Xx32.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) { println("Selected menu: " + e.getActionCommand()) } } )
            menu_Xxxxx_3.add(menuitem_Xx32)

            lv.yu.gro.GRO_09_internal_frames_change_class.menubar.add(menu_Xxxxx_3)

    }  //  end GRO_xxxxx_menu_xxxxx_3_09_class()

}  //  end GRO_xxxxx_menu_xxxxx_3_09_class
